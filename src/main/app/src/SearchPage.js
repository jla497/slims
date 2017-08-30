import React, { Component } from 'react';
import './App.css';
import slimsLogo from './images/SLIMS.jpg';
import {Image, ButtonGroup, Grid, Row, Col, Panel, Button, Form, FormControl, ControlLabel} from 'react-bootstrap';
import $ from "jquery";
import Loader from 'react-loader';
import ContainerSearch from './components/containerSearch2';
import SubjectSearch from './components/subjectSearch2';
import SampleSearch from './components/sampleSearch2';
import PhenotypeSearch from './components/phenotypeSearch';
import  RecursiveTable from './components/RecursiveTable';

class SearchPage extends Component {
constructor(props){
    super(props);
    this.state = {
        
            containersearch:true,
            subjectsearch:false,
            samplesearch:false,
            phenotypesearch:false,
            subjecttable:false,
            containertable:false,
            sampletable:false,
            submitResults_loaded:'',
            searchSource:'subject',
            searchTarget:'subject',
            searchDirection:'',
            searchResults_loaded:true,
            Phenotypes:[],
            Subjects:[],
            Containers:[],
            Samples:[],
            subject_params:{
                    subjectID: "",
                    subjectIDisExact: false,
                    familyID: "",
                    familyIDisExact: false,
                    motherID: "",
                    motherIDisExact: false,
                    fatherID: "",
                    fatherIDisExact: false,
                    cohorttype: "",
                    ethnicitytype: "",
                    geneticEthnicity: "",
                    selfReportedEthnicity: "",
                    selfAncEthnicity: "",
                    gender:"",
                    consent: "",
                    comment: "",
                    commentisExact: false
            },
            sample_params:{
                    sampleID:"",
                    sampleidIsExact:false,
                    barcode:"",
                    barcodeIsExact:false,
                    volume:"",
                    concentration:"",
                    dnaAmt: "",
                    materialtype:"",
                    stock:"",
                    contaminated:"",
                    sampletype:"",
                    collectdate_after:"",
                    collectdate_before:"",
                    extractdate_after:"",
                    extractdate_before:"",
                    comment:"",
                    commentIsExact:"",
                    sampledocname:"",
                    sampledoccomment:"",
                    genotypeParams:{
                    snpRSNumber:"",
                            snpChromosome:"",
                            snpGene:""
                    }
            },
            container_params: {
                    name:"",
                    nameisExact: false,
                    alias:"",
                    aliasisExact:false,
                    plate_maker_init: "",
                    plate_maker_initisExact: false,
                    containertype:"",
                    freezertype: "",
                     shiptotype: "",
                    discarded: null,
                    shipped_after: "",
                    shipped_before:"",
                    comment:"",
                    commentisExact:false,
                    barcode:"",
                    barcodeisExact:false
            },
            phenotype_params:{
                     phenotypeid:"",
                    pheno_name:""
            },
            genotype_params:{
                    snpRSNumber:"",
                    snpChromosome:"",
                    snpGene:""
            },
            searchResult:[],
            mockData: [{
                thisObject:{
                    key:'foo',
                    key2:'bar'
                },
                thisString:'string',
                thisNum:11,
                thisArray:[1,2,3]
                },{
                thisObject:{
                    key:'foo',
                    key2:'bar'
                },
                thisString:'string',
                thisNum:11,
                thisArray:[1,2,3]
                }]
    }

    this.handleSubmit = this.handleSubmit.bind(this);
    this.handleChildInput = this.handleChildInput.bind(this);
    this.handleTableInputs = this.handleTableInputs.bind(this);
    this.handleSearchSrcTarget = this.handleSearchSrcTarget.bind(this);
    this.setLoader = this.setLoader.bind(this);
    }

    handleSearchSrcTarget(event){

    var enums = {
    phenotype:1,
    subject:2,
    sample:3,
    container:4,
    };
    if (event == null) {
    return;
    }

    if (event.target == null) {
    return;
    }

    const name = event.target.name;
    const val = event.target.value;
    this.setState({[name]:val});
    if (enums[this.state.searchSource] <= enums[this.state.searchTarget]){

    this.setState({searchDirection:'right'});
    } else if (enums[this.state.searchSource] > enums[this.state.searchTarget]){
    this.setState({searchDirection:'left'});
    }

    }

    handleChildInput(name, value, child){
    var re = new RegExp('[a-z,A-Z]*isexact$','i');  
    if (child.includes("subjectsearch")){

    var params = this.state.subject_params;
    if(name.search(re) > -1){
     params[name]=!params[name];
      
    }else{
        params[name] = value;
    }
    this.setState({subject_params:params});
//    console.log(this.state.subject_params);
    }
    else if (child.includes("samplesearch")){
    var params = this.state.sample_params;
    if(name.search(re) > -1){
     params[name]=!params[name];
      
    }else{
        params[name] = value;
    }
    this.setState({sample_params:params});
//    console.log(this.state.sample_params);
    return;
    }

    if (child.includes("containersearch")){
    var params = this.state.container_params;
    if(name.search(re) > -1){
     params[name]=!params[name];
      
    }else{
        params[name] = value;
    }
    this.setState({container_params:params});
    return;
    }

    if (child.includes("genotypesearch")){
    var params = this.state.genotype_params;
    if(name.search(re) > -1){
     params[name]=!params[name];
      
    }else{
        params[name] = value;
    }
    this.setState({genotype_params:params});
    return;
    }

    if (child.includes("phenotypesearch")){
    var params = this.state.phenotype_params;
   if(name.search(re) > -1){
     params[name]=!params[name];
      
    }else{
        params[name] = value;
    }
    this.setState({phenotype_params:params});
    return;
    }
    }

    handleTableInputs(child, arr){
    if (child.includes("subjectsearch")){
    if (Array.isArray(arr)){
    this.setState({Subjects:arr});
    this.setState({subjecttable:true});
    }
    return;
    }
    else if (child.includes("samplesearch")){
    if (Array.isArray(arr)){
    this.setState({Samples:arr});
    this.setState({sampletable:true});
    }
    return;
    }

    if (child.includes("containersearch")){
    if (Array.isArray(arr)){
    this.setState({Containers:arr});
    this.setState({containertable:true});
    }
    return;
    }
    }

    handleSubmit(event){

    event.preventDefault();
    this.setLoader();
    
    var context = this;
    
    if (event == null){
        this.setLoader();
    
        return;
    }
    
    var url = this.props.url;
    url = url.concat("/search/search_chain");
//    console.log(this.state.searchResults_loaded);
    $.ajax({
            url: url,
            type: "POST", //send it through get method
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify({
                    phenotypeParams: this.state.phenotype_params,
                    genotypeParams: this.state.genotype_params,
                    subjectParams: this.state.subject_params,
                    sampleParams: this.state.sample_params,
                    containerParams: this.state.container_params,
                    src: this.state.searchSource,
                    target: this.state.searchTarget,
                    direction: this.state.searchDirection
            }),
            success: (data) => {
           console.log(data);
            var target = this.state.searchTarget;
            switch (target){
            case "subject":
                this.setState({submitResults_loaded:"subject"});
                this.setState({Subjects:data});
                  
            break;
            case "sample":
                this.setState({submitResults_loaded:"sample"});
                this.setState({Samples:data});
                   
            break;
            case "container":
                this.setState({submitResults_loaded:"container"});
                this.setState({Containers:data});
            break;
            default:
            break;
    }

            this.setLoader();
    },
            error: function (xhr) {
                context.setLoader();
                console.log("error in handleSubmit");
            }
    });

    }
    
    setLoader(){
        this.setState({searchResults_loaded: !this.state.searchResults_loaded});
    }
    render() {

    var DataTable = null;
    var hasData = this.state.submitResults_loaded;
    switch (hasData){
    case "subject":
        
      DataTable = <RecursiveTable Data={this.state.Subjects} url={this.props.url}/>
//      DataTable = <RecursiveTable Data={this.state.mockData}/>

    break;
    case "sample":

//    DataTable = <SampleTable Samples ={this.state.Samples}/>
       DataTable = <RecursiveTable Data={this.state.Samples} url={this.props.url}/>
    break;
    case "container":

//    DataTable = <ContainerTable Containers={this.state.Containers}/>
       DataTable = <RecursiveTable Data={this.state.Containers} url={this.props.url}/>
    break;
    }

    return (
     
    <Grid>
    <Loader loaded={this.state.searchResults_loaded}>
    <Image src={slimsLogo} responsive />
    <Button  onClick={this.props.logOut}>Log Out</Button>
    <Panel className="customborder">
    <Col sm={4}>
    <Panel>
        <Panel>
            <ButtonGroup vertical>
                <Button className='container_search_btn'  onClick={() => this.setState({containersearch: !this.state.containersearch})}>Container Search</Button>
                <Button className='sample_search_btn' onClick={() => this.setState({samplesearch: !this.state.samplesearch})}>Sample Search</Button>
                <Button className='subject_search_btn' onClick={() => this.setState({subjectsearch: !this.state.subjectsearch})}>Subject Search</Button>
                <Button className='phenotype_search_btn' onClick={() => this.setState({phenotypesearch: !this.state.phenotypesearch})}>Phenotype Search</Button>
            </ButtonGroup>
        </Panel>
        <Panel>
            <div className="form-group">
                <Form horizontal onSubmit={this.handleSubmit}>     
                    <Row>
                        <Col componentClass={ControlLabel} sm={2} className="leftcolumn">
                        Search End:
                        </Col>
                        <Col sm={8}>
                        <FormControl componentClass="select" name="searchTarget"  value={this.state.searchTarget} onChange={this.handleSearchSrcTarget}>
                            <option value="phenotype">phenotype</option>
                            <option value="subject">subject</option>
                            <option value="sample">sample</option>
                            <option value="container">container</option>
                        </FormControl>  
                        </Col>
                    </Row>
                    <Row>
                        <Col componentClass={ControlLabel} sm={2} className="leftcolumn">
                        Search Start:
                        </Col>
                        <Col sm={8}>
                        <FormControl componentClass="select" name="searchSource" value={this.state.searchSource} onChange={this.handleSearchSrcTarget}>         
                            <option value="phenotype">phenotype</option>
                            <option value="subject">subject</option>
                            <option value="sample">sample</option>
                            <option value="container">container</option>
                        </FormControl>  
                        </Col>
                    </Row>
                    <Button  type="submit" value="Submit">Submit</Button>    
                </Form>
            </div>
        </Panel>
    </Panel>      
    </Col>
    <Col sm={8}>
    <Panel className= "container_search_panel" collapsible expanded={this.state.containersearch}>  
        <ContainerSearch url={this.props.url} submitTblData={this.handleTableInputs} params={this.state.container_params} handleChildInput={this.handleChildInput} handleCheckboxChange ={this.handleCheckboxChange} handleSubmit={this.handleSubmit} />
    </Panel> 
    
    <Panel className= "sample_search_panel" collapsible expanded={this.state.samplesearch}>
        <SampleSearch url={this.props.url} submitTblData={this.handleTableInputs} params={this.state.sample_params} handleChildInput={this.handleChildInput}  handleCheckboxChange ={this.handleCheckboxChange} handleSubmit={this.handleSubmit}/>
    </Panel>

    <Panel className= "subject_search_panel" collapsible expanded={this.state.subjectsearch} >
        <SubjectSearch url={this.props.url} submitTblData={this.handleTableInputs} params={this.state.subject_params} handleChildInput={this.handleChildInput} handleCheckboxChange ={this.handleCheckboxChange} handleSubmit={this.handleSubmit}/>
    </Panel>

    <Panel className= "phenotype_search_panel" collapsible expanded={this.state.phenotypesearch}>
        <PhenotypeSearch url={this.props.url} submitTblData={this.handleTableInputs} params={this.state.phenotype_params} handleChildInput={this.handleChildInput}  handleCheckboxChange ={this.handleCheckboxChange} handleSubmit={this.handleSubmit}/>
    </Panel>
    </Col>
    <Row>
      <Col sm={12}>
        {DataTable}
      </Col>
    </Row>
  </Panel>
    </Loader>
    </Grid>
    

    );
        }
    }

    export default SearchPage;
