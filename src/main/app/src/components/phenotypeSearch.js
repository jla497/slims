import React, { Component } from 'react';
import $ from "jquery";
import DateInput from './DateInput';
import {Grid, Panel, Row, Form, FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
import wrapWithTryCatch from 'react-try-catch-render';


class MyErrorHandler extends React.Component {
    render(){
        return (
            <div className="terrible-error">{this.props.error}</div>
        );
    }
}




 class PhenotypeSearch extends Component {

    constructor(props) {
        super(props);
        this.state = {
            pheno_types:[]
        };

        this.loadGeneTypes = this.loadGeneTypes.bind(this);
        this.handleInput = this.handleInput.bind(this); 

    }

    loadGeneTypes() {
        var url = this.props.url;
        url = url.concat("/search/field/phenotypes");
        $.get( url, (data) => {
            console.log(data);

            var genes = $.parseJSON(data);

            genes.unshift("");

            this.setState({pheno_types: genes
            });
        });
    }

    componentDidMount() {
        this.loadGeneTypes();
    }

    handleInput(event) {
       
        if (event == null) {
            return;
        }

        if (event.target == null) {
            return;
        }

        const name = event.target.name;
        
        this.props.handleChildInput(name, event.target.value, "phenotypesearch");

    }

    render() {
       try{ 
        var geneRows = this.state.pheno_types.map((x, index) => <option key={index}>{x}</option>);
        }catch(e){
            console.log(e);
        }
        return(
                <Row>
                    <h3 className="customHeader">Phenotype Search</h3>
                    <Form className="customForm">
                        <FormGroup controlId="formgenotype">
                        
                            <Col componentClass={ControlLabel} sm={2}>
                              id:
                            </Col>
                            <Col sm={2}>
                            <FormControl type="text"  name="phenotypeid" value={this.props.params.phenotypeid} onChange={this.handleInput}></FormControl>
                            </Col>
                            <Col componentClass={ControlLabel} sm={2}>
                              name:
                            </Col>
                            <Col sm={2}>
                              <FormControl componentClass="select" name="pheno_name" ref="select" value={this.props.params.pheno_name} onChange={this.handleInput.bind(this)}>
                                {geneRows}
                            </FormControl>
                            </Col>
                        </FormGroup> 
                    </Form>
                </Row>
                );
    }
}

  export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(PhenotypeSearch); 

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


