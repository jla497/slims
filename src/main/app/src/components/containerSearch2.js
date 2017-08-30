 import React, { Component } from 'react'; 
 import $ from "jquery";
 import DateInput from './DateInput';
 import {Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
 import wrapWithTryCatch from 'react-try-catch-render';


class MyErrorHandler extends React.Component {
    render(){
        return (
            <div className="terrible-error">{this.props.error}</div>
        );
    }
}

 
 class ContainerSearch extends Component{
              
    constructor(props){
       super(props);
       this.state ={
           Containers:[],
           container_types: [],
           freezer_types:[],
           shipto_types:[]
         };  

         this.handleInput = this.handleInput.bind(this);
         this.handleCheckboxChange = this.handleCheckboxChange.bind(this);
         this.handleSubmit = this.handleSubmit.bind(this);
         this.loadContainerTypes = this.loadContainerTypes.bind(this);
         this.loadFreezers = this.loadFreezers.bind(this);
         this.loadShipToDests = this.loadShipToDests.bind(this);
         
       }

       loadContainerTypes (){
         var url = this.props.url;
         url = url.concat("/search/field/containertypes");
         $.get(url,(data)=>{
           
//           console.log(data);
           var data = $.parseJSON(data);
            if(Array.isArray(data)){
                data.unshift("");
                
                this.setState({container_types: data    
                                 });
            } 
        });
      }

    loadFreezers(){
           var url = this.props.url;
           url = url.concat("/search/field/freezertypes");
           $.get(url,(data)=>{
                
               console.log(data);
               var data =$.parseJSON(data);
               if(Array.isArray(data)){
               
                    data.unshift("");

                    this.setState({freezer_types: data    
                                  });
               }
           },"text");
      }
      
      loadShipToDests(){
           var url = this.props.url;
           url = url.concat("/search/field/shiptotypes");
           $.get(url,(data)=>{
//               console.log(data);
               var data = $.parseJSON(data);
               if(Array.isArray(data)){
                   
                    data.unshift("");

                    this.setState({shipto_types: data
                                  });
               }
           });
      }
    
       componentDidMount(){
           console.log("in containersearch_componentDidMount");
           this.loadContainerTypes();
           this.loadFreezers();
           this.loadShipToDests();
       }
       
       componentWillUnmount(){}
         
     handleInput(event) {

        if (event == null) {
            return;
        }

        if (event.target == null) {
            return;
        }

        const target = event.target;
        const name = event.target.name;
//        console.log("name: " + name + " value: " + event.target.value);
        this.props.handleChildInput(name, event.target.value, "containersearch");

    }

    handleCheckboxChange(event) {

        if (event == null)
        {
            return;
        }

        if (event.target == null) {
            return;
        }

        const target = event.target;
        const value = target.type === 'checkbox' ? target.checked : target.value;
        const name = target.name;
        this.props.handleChildInput(name, event.target.value, "containersearch");
    }
      
      handleSubmit(event){
          event.preventDefault();
//          console.log(this.state);
//           $.ajax({
//                url: "http://localhost:8080/search/containers",
//                type: "POST", //send it through get method
//                contentType: "application/json",
//                dataType: "json",
//                data: JSON.stringify(
//                  this.props.params
//                ),
//                success: (data) => {
//                    console.log(data);
//                    if(!$.trim(data)){
//                     
//                    }else{
//                        var containers = [];
//
//                        data.forEach((e)=>{
//                            var el = {
//                                name:'',
//                                valid:'',
//                                alias:'',
//                                stock:'',
//                                type: '',
//                                date: '',
//                                shippedto: '',
//                                shippeddate: ''
//                            };
//                            
//                            if(e.containername != null){
//                                el.name = e.containername;
//                            }
//                            if(e.valid != null){
//                                el.valid = e.valid;
//                            }
//                            if(e.stock != null){
//                                el.stock = e.stock;      
//                            }
//                            
//                            if(e.tblcontainertypes.description != null){
//                                el.type = e.tblcontainertypes.description;
//                            }
//                            
//                            if(e.shippeddate!=null ){
//                                el.shippeddate = e.shippedate;
//                            }
//                            
//                            if(e.date!= null){
//                                el.date = e.date;
//                            }
//                            
//                            if(e.containeralias != null){
//                                el.alias = e.containeralias;
//                            }
//                            
//                            containers.push(el);
//                        });
//                        console.log(containers);
//                        this.setState({Containers: containers});
//                    }
//                 }
//             });
       }
      
     render(){
         
       try{
         var typeRows = this.state.container_types.map((e,index) =><option key={index}>{e}</option>);

          var freezerRows = this.state.freezer_types.map((x,index) => <option key={index}>{x}</option>);
          
          var shipToRows = this.state.shipto_types.map((x,index) => <option key={index}>{x}</option>);
      }catch(e){
          console.log("Caught Exception in ContainerSearch:");
          console.log(e);
      }
//          console.log("in container search render...");
//          console.log(this.state);
          return(
                <Row>
                  <h3 className="customHeader"> Container Search</h3>
                  <Form horizontal onSubmit={this.handleSubmit} className="customForm">
                  
                    <FormGroup controlId="formcontainername">
                      <Col componentClass={ControlLabel} sm={4}>
                         container_name:
                      </Col>
                      <Col sm={6}>
                        <FormControl className="name" type="text"  name="name" value={this.props.params.name} onChange={this.handleInput}></FormControl>
                      </Col>
                       <Col sm={2}>
                            <Checkbox  name="nameisExact" checked={this.props.params.nameisExact}
                                onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                       </Col>           
                    </FormGroup>
                    
                    <FormGroup controlId="formcontaineralias">
                       <Col componentClass={ControlLabel} sm={4}>
                                container_alias:
                       </Col>
                       <Col sm={6}>
                                <FormControl type="text"  name="alias" value={this.props.params.alias} onChange={this.handleInput}></FormControl>
                        </Col>
                        <Col sm={2}>
                            <Checkbox  name="aliasisExact" checked={this.props.params.aliasisExact}onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                        </Col>
                    </FormGroup>
                    
                    <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                             plate_maker's_initials:
                        </Col>
                        <Col sm={6}>
                            <FormControl type="text"  name="plate_maker_init" value={this.props.params.plate_maker_init} onChange={this.handleInput}></FormControl>
                         </Col>
                         <Col sm={2}>
                             <Checkbox name="plate_maker_initisExact" checked={this.props.params.plate_maker_initisExact} onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                         </Col>
                    </FormGroup> 
                    
                    <FormGroup>
                      <Col componentClass={ControlLabel} sm={4}>
                          container_type:
                      </Col>
                      <Col sm={6}>
                          <FormControl componentClass="select" name="containertype"  value={this.props.params.containertype} onChange={this.handleInput.bind(this)}>
                           {typeRows}
                          </FormControl>  
                       </Col>
                    </FormGroup> 
                    <FormGroup>
                      <Col componentClass={ControlLabel} sm={4}>
                          freezer_type:
                      </Col>
                      <Col sm={6}>
                         <FormControl componentClass="select" name="freezertype" value={this.props.params.freezertype} onChange={this.handleInput.bind(this)}>
                           {freezerRows}
                          </FormControl>  
                      </Col>
                    </FormGroup> 
                    <FormGroup>
                      <Col componentClass={ControlLabel} sm={4}>
                          shipTo:
                      </Col>
                      <Col sm={6}>
                         <FormControl componentClass="select" name="shiptotype" ref="select"  value={this.props.params.shiptotype} onChange={this.handleInput.bind(this)}>
                           {shipToRows}
                          </FormControl>        
                      </Col>
                    </FormGroup> 
                    <FormGroup>
                        <Col componentClass={ControlLabel} sm={3}>
                            shipped_after:
                        </Col>
                        <Col sm={3}>
                            <DateInput name={"shipped_after"} value ={this.props.params.shipped_after} handleInput={this.handleInput} />
                        </Col>
                         <Col componentClass={ControlLabel} sm={3}>
                            shipped_before:
                        </Col>
                        <Col sm={3}>
                            <DateInput name={"shipped_before"} value ={this.props.params.shipped_before} handleInput={this.handleInput}/>
                        </Col>
                    </FormGroup> 
                      <FormGroup controlId="formbarcode">
                       <Col componentClass={ControlLabel} sm={4}>
                           barcode:
                       </Col>
                       <Col sm={6}>
                                <FormControl type="text"  name="barcode" value={this.props.params.barcode} onChange={this.handleInput}></FormControl>
                        </Col>
                        <Col sm={2}>
                            <Checkbox  name="barcodeisExact" checked={this.props.params.barcodeisExact}onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                        </Col>
                    </FormGroup>
                      <FormGroup controlId="formcomment">
                       <Col componentClass={ControlLabel} sm={4}>
                            comment:
                       </Col>
                       <Col sm={6}>
                                <FormControl type="text"  name="comment" value={this.props.params.comment} onChange={this.handleInput}></FormControl>
                        </Col>
                        <Col sm={2}>
                            <Checkbox  name="commentisExact" checked={this.props.params.commentisExact}onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                        </Col>
                    </FormGroup>  
                </Form>   
                </Row>
             );
      }
  }

  export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(ContainerSearch);
