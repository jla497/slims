import React, { Component } from 'react';
import $ from "jquery";
import DateInput from './DateInput';
import GenotypeSearch from './genotypeSearch';
import {Grid, Panel, Row, Form, FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
import Loader from 'react-loader';
import wrapWithTryCatch from 'react-try-catch-render';


class MyErrorHandler extends React.Component {
    render(){
        return (
            <div className="terrible-error">{this.props.error}</div>
        );
    }
}

class SampleSearch extends Component {

    constructor(props) {
        super(props);
        this.state = {
            material_types: [],
            sample_types: [],
            gene_types:[],
            samples_loaded:true
        };

        this.loadMaterialTypes = this.loadMaterialTypes.bind(this);
        this.loadSampleTypes = this.loadSampleTypes.bind(this);
        this.handleInput = this.handleInput.bind(this);
        this.handleCheckboxChange = this.handleCheckboxChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChildInput = this.handleChildInput.bind(this);
    }

    loadMaterialTypes() {
        var url = this.props.url;
        url = url.concat("/search/field/materialtypes");
        $.get(url, (data) => {

            console.log(data);

            var materialtypes = $.parseJSON(data);

            materialtypes.unshift("");

            this.setState({material_types: materialtypes

            });
        });
    }

    loadSampleTypes() {
        var url = this.props.url;
        url = url.concat("/search/field/sampletypes");
        $.get( url, (data) => {
            console.log(data);

            var samples = $.parseJSON(data);

            samples.unshift("");

            this.setState({sample_types: samples
            });
        });
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
        this.loadMaterialTypes();
        this.loadSampleTypes();
    }

    handleInput(event) {

        if (event == null) {
            return;
        }

        if (event.target == null) {
            return;
        }

        const target = event.target;
        const name = event.target.name;
        console.log("name: " + name + " value: " + event.target.value);
        this.props.handleChildInput(name, event.target.value, "samplesearch");

    }
    
    handleChildInput(name,value,child){
         if(child.includes("genotypesearch")){
           if(name != null && value != null){
            var params = this.props.params.genotypeParams;
            params[name]=value;
            this.setState({genotypeParams:params}); 
            console.log(this.state.genotypeParams);
           }
        }     
        
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
        this.props.handleChildInput(name, event.target.value, "samplesearch");
    }

    handleSubmit(event) {
        this.setState({samples_loaded:false});
        event.preventDefault();

        $.ajax({
            url: "http://localhost:8080/search/samples",
            type: "POST", //send it through get method
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(this.props.params),
            success: (data) => {
                console.log(data);
                if (!$.trim(data)) {

                } else {
                   
                    this.props.submitTblData("samplesearch",data);
                }
                this.setState({samples_loaded:true});
            },

            error: function (xhr) {
                this.setState({samples_loaded:true});
            }
        });

    }
  
    render() {
     try{
        var materialRows = this.state.material_types.map((e, index) => <option key={index}>{e}</option>);
        
        var sampleRows = this.state.sample_types.map((x, index) => <option key={index}>{x}</option>);

        var geneRows = this.state.gene_types.map((x, index) => <option key={index}>{x}</option>);
        }catch(e){
            console.log("Caught Exception from sampleSearch");
            console.log(e);

     }
        return( 
               <Loader loaded={this.state.samples_loaded}>
                <Row>
                   <h3 className="customHeader">Sample Search</h3>
                    <Form horizontal onSubmit={this.handleSubmit} className="customForm">
                        <FormGroup controlId="formsampleid" >
                            <Col componentClass={ControlLabel} sm={4}>
                            sampleid:
                            </Col>
                            <Col sm={6}>
                            <FormControl type="text"  name="sampleID" value={this.props.params.sampleID} onChange={this.handleInput}></FormControl>
                            </Col>
                            <Col sm={2}>
                            <Checkbox  name="sampleidIsExact" checked={this.props.params.sampleidIsExact}
                                       onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                            </Col>
                        </FormGroup>
                        <FormGroup controlId="formsampleid">
                            <Col componentClass={ControlLabel} sm={4}>
                            barcode:
                            </Col>
                            <Col sm={6}>
                            <FormControl type="text"  name="barcode" value={this.props.params.barcode} onChange={this.handleInput}></FormControl>
                            </Col>
                            <Col sm={2}>
                            <Checkbox  name="barcodeIsExact" checked={this.props.params.barcodeIsExact}
                                       onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                            </Col>
                        </FormGroup>     
                        <FormGroup controlId="formsamplevolume">
                            <Col componentClass={ControlLabel} sm={4}>
                            volume:
                            </Col>
                            <Col sm={6}>
                            <FormControl type="text"  name="volume" value={this.props.params.volume} onChange={this.handleInput}></FormControl>
                            </Col>
                        </FormGroup>
                        <FormGroup controlId="formsampleconcentration">
                            <Col componentClass={ControlLabel} sm={4}>
                            concentration:
                            </Col>
                            <Col sm={6}>
                            <FormControl type="text"  name="concentration" value={this.props.params.concentration} onChange={this.handleInput}></FormControl>
                            </Col>
                        </FormGroup>
                        <FormGroup>
                            <Col componentClass={ControlLabel} sm={4}>
                            material_types:
                            </Col>
                            <Col sm={6}>
                            <FormControl componentClass="select" name="materialtype" ref="select"  value={this.props.params.materialtype} onChange={this.handleInput.bind(this)}>
                                {materialRows}
                            </FormControl>       
                            </Col>
                        </FormGroup>
                        <FormGroup>
                            <Col componentClass={ControlLabel} sm={4}>
                            sample_types:
                            </Col>
                            <Col sm={6}>
                            <FormControl componentClass="select" name="sampletype" ref="select"  value={this.props.params.sampletype} onChange={this.handleInput.bind(this)}>
                                {sampleRows}
                            </FormControl>  
                            </Col>
                        </FormGroup>
                        <FormGroup>
                            <Col componentClass={ControlLabel} sm={4}>
                            stock:
                            </Col>
                            <Col sm={6}>
                            <FormControl componentClass="select" name="stock" ref="select"  value={this.props.params.stock} onChange={this.handleInput.bind(this)}>
                                <option>Unknown</option>
                                <option>No</option>
                                <option>Yes</option>
                            </FormControl>  
                            </Col>
                        </FormGroup> 
                        <FormGroup>
                            <Col componentClass={ControlLabel} sm={4}>
                            contaminated:
                            </Col>
                            <Col sm={6}>
                            <FormControl componentClass="select" name="contaminated" ref="select"  value={this.props.params.contaminated} onChange={this.handleInput.bind(this)}>
                                <option>Unknown</option>
                                <option>No</option>
                                <option>Yes</option>
                            </FormControl>  
                            </Col>
                        </FormGroup>
                        <FormGroup>
                            <Col componentClass={ControlLabel} sm={3}>
                            collected_after:
                            </Col>
                            <Col sm={3}>
                            <DateInput name={"collectdate_after"} value ={this.props.params.collectdate_after} handleInput={this.handleInput} />
                            </Col>
                            <Col componentClass={ControlLabel} sm={3}>
                            collected_before:
                            </Col>
                            <Col sm={3}>
                            <DateInput name={"collectdate_before"} value ={this.props.params.collectdate_before} handleInput={this.handleInput}/>
                            </Col>
                        </FormGroup>
                        <FormGroup>
                            <Col componentClass={ControlLabel} sm={3}>
                            extractdate_after:
                            </Col>
                            <Col sm={3}>
                            <DateInput name={"extractdate_after"} value ={this.props.params.extractdate_before} handleInput={this.handleInput} />
                            </Col>
                            <Col componentClass={ControlLabel} sm={3}>
                            extract_before:
                            </Col>
                            <Col sm={3}>
                            <DateInput name={"extractdate_before"} value ={this.props.params.extractdate_before} handleInput={this.handleInput}/>
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
               </Loader>
                );
    }
 
}

 export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(SampleSearch); 