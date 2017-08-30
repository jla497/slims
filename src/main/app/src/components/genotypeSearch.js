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




class GenotypeSearch extends Component {

    constructor(props) {
        super(props);
        this.state = {
            gene_types:[]
        };

        this.loadGeneTypes = this.loadGeneTypes.bind(this);
        this.handleInput = this.handleInput.bind(this); 

    }

    loadGeneTypes() {
          var url = this.props.url;
           url = url.concat("/search/field/genetypes");
        $.get(url, (data) => {
            console.log(data);

            var genes = $.parseJSON(data);

            genes.unshift("");

            this.setState({gene_types: genes
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
        
        this.props.handleChildInput(name, event.target.value, "genotypesearch");

    }

    render() {
        
        var geneRows = this.state.gene_types.map((x, index) => <option key={index}>{x}</option>);
        
        return(
                <div class="form-group">
                    <Form>
                        <FormGroup controlId="formgenotype">
                            genotypes:
                            <Col componentClass={ControlLabel} sm={2}>
                              snp_num:
                            </Col>
                            <Col sm={2}>
                            <FormControl type="text"  name="snpRSNumber" value={this.props.params.snpRSNumber} onChange={this.handleInput}></FormControl>
                            </Col>
                            <Col componentClass={ControlLabel} sm={2}>
                              snp_chr:
                            </Col>
                            <Col sm={2}>
                           <FormControl type="text"  name="snpChromosome" value={this.props.params.snpChromosome} onChange={this.handleInput}></FormControl>
                            </Col>
                            <Col componentClass={ControlLabel} sm={2}>
                              gene_name:
                            </Col>
                            <Col sm={2}>
                              <FormControl componentClass="select" name="snpGene" ref="select" value={this.props.params.snpGene} onChange={this.handleInput.bind(this)}>
                                {geneRows}
                            </FormControl>
                            </Col>
                        </FormGroup> 
                    </Form>
                </div>
                );
    }
}

 export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(GenotypeSearch);

