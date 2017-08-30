import React, { Component } from 'react';
import {Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';



export default class SampleTable extends Component {
    constructor() {
        super();
       
    }
  
 
    render() {
            var dataRows = [];
            
           try{

                if(this.props.Samples!=null){

                this.props.Samples.forEach((e)=>{

                    dataRows.push(
                            {   id: e.sampleid,
                                name:e.name,
                                material_type: e.tblsampletypes.description,
                                concentration: e.concentration,
                                sample_type: e.tblsampletypes.description,
                                subject: e.tblsubject.id,
                                extractiondate: e.extractiondate,
                                collectiondate: e.collectiondate  
                            }
                    );
                });
             }
         }catch(e){
             
                console.log('error',e);
         }
         
         return(<Row>
                       <BootstrapTable data={dataRows} striped={true} hover={true} pagination exportCSV>
                         <TableHeaderColumn dataField="id" isKey={true} dataAlign="center" dataSort={true}>ID</TableHeaderColumn>
                         <TableHeaderColumn dataField="name" dataSort={true}>Sample Name</TableHeaderColumn>
                         <TableHeaderColumn dataField="material_type" dataSort={true}>Material Type</TableHeaderColumn>
                         <TableHeaderColumn dataField="sample_type" dataSort={true}>Sample Type</TableHeaderColumn>
                         <TableHeaderColumn dataField="subject" dataSort={true}>Subject</TableHeaderColumn>
                         <TableHeaderColumn dataField="extractiondate" dataSort={true}>Extraction Date</TableHeaderColumn>
                         <TableHeaderColumn dataField="collectiondate" dataSort={true}>Collection Date</TableHeaderColumn>    
                       </BootstrapTable>
                </Row>
                 );
    }
}
