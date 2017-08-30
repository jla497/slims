import React, { Component } from 'react';
import {Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';
import $ from 'jquery';
import wrapWithTryCatch from 'react-try-catch-render';


class MyErrorHandler extends React.Component {
    render(){
        return (
            <div className="terrible-error">{this.props.error}</div>
        );
    }
}

 class RecursiveTable extends Component{
        
        constructor(props){
            super(props);
            this.state={
                
                TblHeaders:[],
                sortedData:[],
                tblHdrClmns:[],
                tblKey:'',
                exportColumns:{},
                ExportColumnCheckboxes:[],
                childData:null,
                searchResults_loaded:true
            };
            
            this.getTypes = this.getTypes.bind(this);
            this.formatChildColumn = this.formatChildColumn.bind(this);
            this.handleClick = this.handleClick.bind(this);
            this.sortData = this.sortData.bind(this);
            this.backToParent = this.backToParent.bind(this);
            this.handleCheckbox = this.handleCheckbox.bind(this);
            this.createExportColumnCheckboxes = this.createExportColumnCheckboxes.bind(this);
            this.initializeExportColumns = this.initializeExportColumns.bind(this);
            this.onExportToCSV = this.onExportToCSV.bind(this);
            
        }
        
        componentDidMount(){
            this.sortData();    
            this.initializeExportColumns();
        }
        
         setLoader(){
        this.setState({searchResults_loaded: !this.state.searchResults_loaded});
        }
        
        onExportToCSV(){
            
         const selectedRows = this.refs.table.state.selectedRowKeys;
         return this.refs.table.state.data.filter(el =>{
            if(selectedRows.indexOf(el.id)> -1){
                
                return el;
                
            } 
         });
        }
        
        handleCheckbox(event){
            
            if (event == null) {
                return;
            }

            if (event.target == null) {
                return;
            }

        const target = event.target;
        const name = event.target.name;
        var exportColumns = Object.assign({},this.state.exportColumns);
        exportColumns[name]=!exportColumns[name];
        this.setState({exportColumns:exportColumns},this.sortData);      
        console.log("exportColumns: "+exportColumns[name]);
        }
        
        initializeExportColumns(){
            
            var data = this.props.Data[0];
            var TblHeaders = new Set();
            var exportColumns = {};
            
            Object.keys(data).forEach((key)=>{
                    
                    const type = this.getTypes(data[key]);
                    
                    switch(type){
                        case 'object':
                             TblHeaders.add(key);
                            break;
                            
                        case 'array':
                              TblHeaders.add(key);
                            break;
                        case 'string':
                            
                               TblHeaders.add(key);
                            break;
                            
                        case 'boolean':
                         
                              TblHeaders.add(key);
                            break;
                        
                        case 'number':
                           
                              TblHeaders.add(key);
                            break;
                        
                    }   
                });  
           
//           console.log("TblHeaders: "+TblHeaders);
          
            TblHeaders = [...TblHeaders];
          
            TblHeaders.forEach((key)=>{
               exportColumns[key]=true;
           });
           
           this.setState({exportColumns:exportColumns},this.createExportColumnCheckboxes);
        }
        
        createExportColumnCheckboxes(){
            
            var TblHeaders = Object.keys(this.state.exportColumns);
            
//            console.log("in createExportColumnCheckboxes...");
             var ExportColumnCheckboxes = TblHeaders.map((key,index)=><Checkbox inline name={key} value={this.state.exportColumns[key]} onClick={this.handleCheckbox}>{key}</Checkbox>);
             const component = (<FormGroup>{ExportColumnCheckboxes}</FormGroup>)
//            console.log("ExportColumnCheckboxes: ");
//            console.log(ExportColumnCheckboxes);
             this.setState({ExportColumnCheckboxes:component});
        }

        sortData(){
          var sortedData = [];
          var re = new RegExp('[a-z,A-Z]*id$','i');
          var re2 = new RegExp('^tbl[a-z,A-Z]+$','i');
          var reInt = new RegExp('^[0-9]+$','i');
          var reFloat = new RegExp('^[0-9]+.[0-9]+$','i'); 
          var tblHdrClmns = [];
          var tblChldHdrs = new Set();
          var TblHeaders = new Set();
          var columnKeys = [];
          var tblkey = '';
          var exportColumns = Object.assign({},this.state.exportColumns);
          
          try{
              
             var Data = [];
//             console.log("props.Data: ",this.props.Data);
            if (this.getTypes(this.props.Data) == 'object') {
                const tmp = Object.assign(this.props.Data);
                Data.push(tmp);
            } else if (Array.isArray(this.props.Data)) {

                Data = this.props.Data.concat();
            }
            if(Array.isArray(Data)){
                
                Data.forEach((data)=>{
                    
                 var displayHere = Object.assign({});
          
                 var toChild = Object.assign({});
                
                 Object.keys(data).forEach((key)=>{
                     
                    if(Object.keys(exportColumns).length > 0 && exportColumns[key]===true || Object.keys(exportColumns).length === 0){
//                     console.log("export column "+key);
                    const type = this.getTypes(data[key]);
                    
                    switch(type){
                        case 'object':
                            if(key.search(re2) > -1){
                                toChild[key]=Object.assign(data[key]);
                                tblChldHdrs.add(key);
                            }
                            break;
                            
                        case 'array':
                             if(key.search(re2) > -1){
                                toChild[key]=data[key].concat();
                                tblChldHdrs.add(key);
                            }
                            break;
                        case 'string':
                            if (data[key].search(reInt)>-1){

                              TblHeaders.add(key);
                              
                              displayHere[key] = parseInt(data[key]);
    
                            }else if(data[key].search(reFloat)>-1){
                                
                              TblHeaders.add(key);
                              
                              displayHere[key] = parseFloat(data[key]);
                                
                            }else{
                              displayHere[key]=data[key];
                              TblHeaders.add(key);
                            }
                            break;
                            
                        case 'boolean':
                              displayHere[key]=data[key];
                              TblHeaders.add(key);
                            break;
                        
                        case 'number':
                               //this is a hack to check if number is a reference id for another database table
                            if(key.search(re2) > -1){
                                toChild[key]=data[key];
                                tblChldHdrs.add(key);
                            }
//                            else if (data[key].search(reInt)>-1){
//                              TblHeaders.add(key);
//                              displayHere[key] = parseInt(data[key]);
//                                
//                                
//                            }else if(data[key].search(reFloat)>-1){
//                                
//                              TblHeaders.add(key);
//                              displayHere[key] = parseFloat(data[key]);
//                                
//                            }
                            else{
                              displayHere[key]=data[key];
                              TblHeaders.add(key);
                            }
                            break;
                        
                    }
                  }   
                });  
                var sortedDataObj = {};
                
                sortedDataObj['displayHere'] = Object.assign(displayHere);
                
                sortedDataObj['toChild'] = Object.assign(toChild);
                
                sortedData.push(sortedDataObj);
                
            });
           }
       
         }catch(e){
                console.log("Caught Exception from RecursiveTable:");
                console.log(e);
          }

        try{//convert set to arrays for map function
            TblHeaders = [...TblHeaders];

           tblChldHdrs = [...tblChldHdrs];
      
           tblHdrClmns = TblHeaders.map((key,index)=>{ 
                if(this.getTypes(key) == 'string') {
                    return (<TableHeaderColumn width='150' dataField={key} dataSort={true} filter={{ type:'TextFilter', delay:1000}} export={this.state.exportColumns[key]}>{key}</TableHeaderColumn>);
                       
                 }else if(this.getTypes(key) == 'number' || this.getTypes(key) == 'integer' || this.getTypes(key) == 'float'){
                     
                     return (<TableHeaderColumn width='150' dataField={key} dataSort={true} 
                              filter={{type: 'NumberFilter', delay: 1000, numberComparators: [ '=', '>', '<=' ]}}>{key}</TableHeaderColumn>);
                        
                 }
           });

           var tmp = tblChldHdrs.map((key,index)=>
                            <TableHeaderColumn width='150' dataField={key} dataSort={true} dataFormat={this.formatChildColumn.bind(this,key)} export={false}>{key}</TableHeaderColumn>);

           tblHdrClmns = tblHdrClmns.concat(tmp);

           columnKeys = TblHeaders.filter((key)=>{return !key.search(re)});

           tblkey = TblHeaders[0];

           if(columnKeys.length > 0){
               tblkey = columnKeys[0];
           }

           //assign unique id to each childData to help identify which data to fetch when childData btn is clicked
          
             sortedData.forEach((e,index)=>{
               e.toChild['id'] = index;
               e.displayHere['id'] = index;
             });

//           this.setState({TblHeaders:TblHeaders});
            
           //setState sortedData
           this.setState({sortedData:sortedData});
           
           this.setState({tblHdrClmns:tblHdrClmns});
           
           this.setState({tblKey:'id'});
           console.log("toChild: ",tblChldHdrs);
           console.log("displayHere",TblHeaders);
           console.log("columnKeys: ",columnKeys);
           console.log("tblkey: ",tblkey);

       }catch(e){
            console.log("Caught Exception from RecursiveTable:");
            console.log(e);
       }
       
     }
        formatChildColumn(tblheader,cell,row,enumObject,index){
       
//            console.log("cell",cell);
//            console.log("row",row);
//            console.log("enumObject",enumObject);
//            console.log("index",index);
            
            var id = this.state.tblKey;
            
            var filterObj = this.state.sortedData.filter((e)=>{
                return e.toChild[id] === row[id];
            });
            
//            console.log("filteredObj: ",filterObj[0].toChild);
            var childData = Object.assign(filterObj[0].toChild[tblheader]);
//            console.log("tblheader: ",tblheader);
//            console.log("childData: ",childData);
            //bind child data to pass onto handlClick function
            return(<input type='button' name={tblheader} onClick={this.handleClick.bind(this,childData)}></input>);
        }
        
        handleClick(obj,event){
            var name = event.target.name;
            var url = this.props.url;
            url = url.concat("/search/byid/");
            console.log(name);
            console.log(obj);
            url = url.concat(name+"/");
            url = url.concat(obj);
            $.get(url, (data) => {

                console.log(data);

                var  result = $.parseJSON(data);

                this.setState({childData:result});
               
            });
           
        }
        
         backToParent() {
            this.setState({childData: null});
        }
        
        getTypes(prop){
            var type = Object.prototype.toString.call(prop);
//            console.log("getTypes type: ",type);
            switch(type){
                case '[object Object]':
                    return 'object';
                break;
                
                case '[object Array]':
                    return 'array';
                break;
                
                case '[object String]':
                    return 'string';
                break;
                
                case '[object Boolean]':
                    return 'boolean';
                break;
                
                
                case '[object Number]':
                    return 'number';
                break;
            }
            
        }
        
        render() {
            
//            throw new Error('Something went terribly worng inside this render');
            var component = (<Row></Row>);
            
            //prop for modifying row selection
            const selectRowProp = {     
                mode: 'checkbox',
                clickToSelect: true,  // enable click to select
                hideSelectColumn:true,
                bgColor: 'pink',
                showOnlySelected:true    
            };
            
            const options = {
                onExportToCSV: this.onExportToCSV
            };
            
            var dataForTable =  this.state.sortedData.map((e,index)=>e.displayHere);
            
            if(this.state.tblKey !== null && this.state.tblKey !==''){
             component = (
                    <Row>
                     <Button onClick={this.props.backToParent}>Previous Table</Button>
                     <h3>Hide Columns: </h3>
                     <FormGroup>{this.state.ExportColumnCheckboxes}</FormGroup>
                     <BootstrapTable ref = 'table' data={dataForTable} keyField={this.state.tblKey} responsive={true} striped={true} hover={true}  scrollTop={ 'Bottom' } pagination options={options} exportCSV selectRow={selectRowProp}>
                        {this.state.tblHdrClmns}
                     </BootstrapTable>
                    </Row>);
            }
            
            if(this.state.childData !== null){
                component = (<RecursiveTable Data={this.state.childData} backToParent={this.backToParent} url={this.props.url}/>);
           //pull out data just for the table to render at this level
            }
            return component;
          
          }
  }
  
  export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(RecursiveTable);



