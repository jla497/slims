 import React, { Component } from 'react';
 import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';
import {Table,Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
 
 


function PhenotypeFormatter(props){
        
        var types = props.phenotypes.split(",");
        if(Array.isArray(types)){
        var rows = [];
        types.forEach((x)=>{
            rows.push(<option>{x}</option>);
        });

//        console.log("in phenotypes...");
//        console.log(rows);
        return(      
          <select>{rows}</select>
        );
        }else
        return;
  }
  function formatPhenotype(cell,index){
        
        var types = cell.split(",");
        if(Array.isArray(types)){
        var rows = [];
        types.forEach((x)=>{
            rows.push(<option>{x}</option>);
        });

        console.log("in phenotypes...");
        console.log(rows);
        return(      
          <select>{rows}</select>
        );
        }else
        return;
  }

export default class SubjectTable extends Component{
        render() {
          var dataRows = [];
          var rows = [];
          try{
            if(this.props.Subjects!=null){
            
                this.props.Subjects.forEach((e)=>{
                     var arr = [];
                     
                     if(Array.isArray(e.tblphenotypeses)){
                       
                        e.tblphenotypeses.forEach((p)=>{
                           arr.push(p.tblphenotypelookup.name);
                        });
                       
                        console.log(arr);
                    }
                    
                    
                    dataRows.push(
                            {   
                                id: e.id,
                                cohort:e.tblcohortlookup != null ? e.tblcohortlookup.name : '',
                                ethnicity: e.tblethnicitylookupByEthnicityid != null ? e.tblethnicitylookupByEthnicityid.ethnicity : '',
                                gender: e.gender,
                                familyid: e.familyid,
                                fatherid: e.fatherid,
                                motherid: e.motherid,
                                consent: e.consent,
                                phenotypes: arr.join()
                            }
                    );
                    
        });
        
        dataRows.forEach((e)=>{
            
                  var el = (<tr>
                    <td>{e.id}</td>
                    <td>{e.cohort}</td>
                    <td>{e.ethnicity}</td>
                    <td>{e.familyid}</td>
                    <td>{e.motherid}</td>
                    <td>{e.fatherid}</td>
                    <td>{e.consent}</td>
                    <td>{e.fatherid}</td>
                    <td>
                    <PhenotypeFormatter phenotypes={e.phenotypes}/>
                    </td>
                    </tr>); 
             
             rows.push(el);
        
        });
        
      }
    }catch(e){
        console.log('error',e);
    }
            return (  
            <Row>
           <BootstrapTable data={dataRows} responsive={true} striped={true} hover={true}  scrollTop={ 'Bottom' } pagination exportCSV>
                <TableHeaderColumn dataField="id" isKey={true} dataAlign="center" dataSort={true}>ID</TableHeaderColumn>
                <TableHeaderColumn dataField="cohort" dataSort={true}>Cohort</TableHeaderColumn>
                <TableHeaderColumn dataField="ethnicity" dataSort={true}>Ethnicity</TableHeaderColumn>
                <TableHeaderColumn dataField="gender" dataSort={true}>Gender</TableHeaderColumn>
                <TableHeaderColumn dataField="familyid" dataSort={true}>Family ID</TableHeaderColumn>
                <TableHeaderColumn dataField="fatherid" dataSort={true}>Father ID</TableHeaderColumn>
                <TableHeaderColumn dataField="motherid" dataSort={true}>Mother ID</TableHeaderColumn>
                <TableHeaderColumn dataField="consent" dataSort={true}>Consent</TableHeaderColumn>  
                <TableHeaderColumn width="400" dataField="phenotypes" dataFormat={formatPhenotype}>Phenotypes</TableHeaderColumn>                 
            </BootstrapTable>
            <Table striped bordered condensed hover>
                <thead>
                  <tr>
                    <th>id</th>
                    <th>cohort</th>
                    <th>ethnicity</th>
                    <th>gender</th>
                    <th>familyid</th>
                    <th>fatherid</th>
                    <th>motherid</th>
                    <th>consent</th>
                    <th>phenotypes</th>
                  </tr>
                </thead>
                {rows}
            </Table>
          </Row>
           );
          }
  }