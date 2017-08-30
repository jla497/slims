import React, { Component } from 'react';
import {Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';

class Container extends Component{
            render() {
              return (<tr key ={this.props.container.name}>
                            <td>{this.props.container.valid}</td>
                            <td>{this.props.container.stock}</td>                           
                            <td>{this.props.container.type}</td>
                            <td>{this.props.container.shelf}</td>
                            <td>{this.props.container.location}</td>
                            <td>{this.props.container.shipStatus}</td>
                            <td>{this.props.container.shipDate}</td>
                            <td>{this.props.container.comment}</td>     
                             <td>{this.props.container.init}</td>              
                       </tr>
                );
            }
}
   
export default class ContainerTable extends Component{
        render() {
          var rows = [];
          try{
            if(Array.isArray(this.props.Containers)){
                  this.props.Containers.forEach(function(sub) {
                    rows.push({
                        id:sub.containerid,
                        name:sub.containername,
                        alias:sub.containeralias,
                        materialtype:sub.tblcontainertypes !=null?sub.tblcontainertypes.description : '',
                        freezertype:sub.tblfreezers != null ? sub.tblfreezers.description : '',
                        location:sub.location,    
                        shelf:sub.shelf,
                        stock:sub.stock,
                        shippedout:sub.shippedout == 1?'yes':'no',
                        shipDate:sub.shippeddate,
                        comment:sub.comments,
                        init:sub.initials
                    });
                });
           }
          }catch(e){
                console.log("Caught Exception from ContainerTable:");
                console.log(e);
          }
          
            return (
             <Row>
                       <BootstrapTable data={rows} striped={true} hover={true} pagination exportCSV>
                         <TableHeaderColumn width='150' dataField="id" isKey={true} dataAlign="center" dataSort={true}>ID</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="name" dataAlign="center" dataSort={true}>Name</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="alias" dataAlign="center" dataSort={true}>Alias</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="materialtype" dataAlign="center" dataSort={true}>Material Type</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="freezertype" dataAlign="center" dataSort={true}>Freezer Type</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="location" dataSort={true}>Location</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="shelf" dataSort={true}>Shelf</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="shelf" dataSort={true}>Shelf</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="type" dataSort={true}>Container Type</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="shelf" dataSort={true}>Shelf</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="location" dataSort={true}>Location</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="shippedout" dataSort={true}>Ship Status</TableHeaderColumn>
                         <TableHeaderColumn width='150' dataField="shipDate" dataSort={true}>Ship Date</TableHeaderColumn>    
                         <TableHeaderColumn width='150' dataField="comment" dataSort={true}>Comment</TableHeaderColumn>    
                         <TableHeaderColumn width='150' dataField="init" dataSort={true}>Plate Maker's Init</TableHeaderColumn>    
                       </BootstrapTable>
                </Row>
            
          
           );
          }
  }


