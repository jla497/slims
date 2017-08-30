 import React, { Component } from 'react';
 import $ from "jquery";
 import DateInput from './DateInput';
 import {Grid,Panel,Row,Form,FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
 import Loader from 'react-loader';
 import wrapWithTryCatch from 'react-try-catch-render';


class MyErrorHandler extends React.Component {
    render(){
        return (
            <div className="terrible-error">{this.props.error}</div>
        );
    }
}

 class SubjectSearch extends Component{
         
   constructor(props){
        super(props);
        this.state = {
           Cohorts: [],
           Ethnicities: [],     
           subjects_loaded:true
         };  
         
         this.loadEthnicities = this.loadEthnicities.bind(this);
         this.loadCohorts = this.loadCohorts.bind(this);
         this.handleSubmit = this.handleSubmit.bind(this);
         this.handleInput = this.handleInput.bind(this);
         this.handleCheckboxChange = this.handleCheckboxChange.bind(this);
       }
      
       loadEthnicities(){
        var url = this.props.url;
        url = url.concat("/search/field/ethnicitytypes");
       $.get(url,(data)=>{
           
           console.log(data);
           
            var ethnicities = $.parseJSON(data);
            
            ethnicities.unshift("");
            
            this.setState({Ethnicities: ethnicities
                        });
        });
      }

    loadCohorts(){
         var url = this.props.url;
        url = url.concat("/search/field/cohorttypes");
           $.get(url,(data)=>{
               console.log(data);
               
               var cohorts = $.parseJSON(data);
               
               cohorts.unshift("");
               
               this.setState({Cohorts: cohorts
                             });
           });
      }
     
     componentDidMount(){
         this.loadCohorts();   
         this.loadEthnicities();
         
     }
     
       handleInput(event){
         
          if(event == null){
              return;
          }
         
         if(event.target == null){
             return;
         }
         
          const target = event.target;
          const name = event.target.name;
          console.log("name: "+name+" value: "+event.target.value);
          this.props.handleChildInput(name,event.target.value,"subjectsearch");
         
      }
    
     handleCheckboxChange(event) {
         
        if(event == null)
        {
            return;
        }
        
        if(event.target == null){
             return;
         }
        
        const target = event.target;
        const value = target.type === 'checkbox' ? target.checked : target.value;
        const name = target.name;
        this.props.handleChildInput(name,event.target.value,"subjectsearch");
      }
         

     handleSubmit(event){
          this.setState({subjects_loaded:false});
          
          event.preventDefault();
          
          $.ajax({
                url: "http://localhost:8080/search/subjects",
                contentType:"application/json",
                type: "POST", //send it through get method
                data: JSON.stringify(this.props.params),
                success: (data) => {
                    console.log(data);
                    
                    var subjects = [];
                    
                    data.forEach((e)=>{
                        subjects.push({
                           subjectID: e.subjectid,
                           familyid: e.familyid,
                           fatherid: e.fatherid,
                           motherid: e.motherid,
                           gender: e.gender,
                           consent: e.hasconsent === 1? "yes" : "no",
                           cohort: e.tblcohortlookup.name,
                           ethnicity: e.tblethnicitylookupByEthnicityid.ethnicity      
                        });
                    });
                    console.log(subjects);
                    this.props.submitTblData("subjectsearch",subjects);
                    this.setState({subjects_loaded:true});
                },
                
                error: function(xhr) {
                  this.setState({subjects_loaded:true});
                }
            });

      }
      
      render(){
          try{
            var cohRows = this.state.Cohorts.map((e,index) =><option key={index}>{e}</option>);
  
            var ethRows = this.state.Ethnicities.map((x,index) => <option key={index}>{x}</option>);
            var genders = ["","Male","Female"];
            var genderRows = genders.map((x,index) => <option key={index} value={x}>{x}</option>);
            var consents=["","Yes","No"];
            var consentRows =consents.map((x,index) => <option key={index} value={x}>{x}</option>);
            }catch(e){
              console.log("Caugth Exception from SubjectSearch:");
              console.log(e);
          }
            return(
                 <Loader loaded={this.state.subjects_loaded}>
                  <Row>
                     <h3 className="customHeader">Subject Search</h3>
                     <Form horizontal onSubmit={this.handleSubmit} className="customForm">
                        <FormGroup controlId="formsubjectid">
                        <Col componentClass={ControlLabel} sm={4}>
                          id:
                        </Col>
                        <Col sm={6}>
                          <FormControl type="text"  name="subjectID" value={this.props.params.subjectID} onChange={this.handleInput}></FormControl>
                        </Col>
                         <Col sm={2}>
                              <Checkbox  name="subjectIDisExact" checked={this.props.params.subjectIDisExact}
                                  onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                         </Col>           
                      </FormGroup> 
                      <FormGroup controlId="formsubjectid">
                        <Col componentClass={ControlLabel} sm={4}>
                          Family_id:
                        </Col>
                        <Col sm={6}>
                          <FormControl type="text"  name="familyID" value={this.props.params.familyID} onChange={this.handleInput}></FormControl>
                        </Col>
                         <Col sm={2}>
                              <Checkbox  name="familyIDisExact" checked={this.props.params.familyIDisExact}
                                  onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                         </Col>           
                      </FormGroup>
                      <FormGroup controlId="formsubjectid">
                        <Col componentClass={ControlLabel} sm={4}>
                            Mother_id:
                        </Col>
                        <Col sm={6}>
                          <FormControl type="text"  name="motherID" value={this.props.params.motherID} onChange={this.handleInput}></FormControl>
                        </Col>
                         <Col sm={2}>
                              <Checkbox  name="motherIDisExact" checked={this.props.params.motherIDisExact}
                                  onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                         </Col>           
                      </FormGroup>
                       <FormGroup controlId="formsubjectid">
                        <Col componentClass={ControlLabel} sm={4}>
                            Father_id:
                        </Col>
                        <Col sm={6}>
                          <FormControl type="text"  name="fatherID" value={this.props.params.fatherID} onChange={this.handleInput}></FormControl>
                        </Col>
                         <Col sm={2}>
                              <Checkbox  name="fatherIDisExact" checked={this.props.params.fatherIDisExact}
                                  onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                         </Col>           
                      </FormGroup>
                       <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            cohort:
                        </Col>
                        <Col sm={6}>
                           <FormControl componentClass="select" name="cohorttype" ref="select"  value={this.props.params.cohorttype} onChange={this.handleInput.bind(this)}>
                             {cohRows}
                         </FormControl>  
                         </Col>
                      </FormGroup> 
                      <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            ethnicity:
                        </Col>
                        <Col sm={6}>
                           <FormControl componentClass="select" name="ethnicitytype" ref="select"  value={this.props.params.ethnicitytype} onChange={this.handleInput.bind(this)}>
                             {ethRows}
                           </FormControl>      
                         </Col>
                      </FormGroup> 
                      <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            geneticEthnicity:
                        </Col>
                        <Col sm={6}>
                           <FormControl componentClass="select" name="geneticEthnicity" ref="select"  value={this.props.params.geneticEthnicity} onChange={this.handleInput.bind(this)}>
                             {ethRows}
                           </FormControl>    
                         </Col>
                      </FormGroup> 
                       <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            selfReportedEthnicity:
                        </Col>
                        <Col sm={6}>
                           <FormControl componentClass="select" name="selfReportedEthnicity" ref="select"  value={this.state.selfReportedEthnicity} onChange={this.handleInput.bind(this)}>
                             {ethRows}
                           </FormControl> 
                         </Col>
                      </FormGroup>  
                      <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            Self_Reported_Ancestral_Ethnicity:
                        </Col>
                        <Col sm={6}>
                          <FormControl componentClass="select" name="selfAncEthnicity" ref="select"  value={this.props.params.selfAncEthnicity} onChange={this.handleInput.bind(this)}>
                             {ethRows}
                           </FormControl> 
                         </Col>
                      </FormGroup> 
                      <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            gender:
                        </Col>
                        <Col sm={6}>
                         <FormControl componentClass="select" name="gender" ref="select"  value={this.state.gender} onChange={this.handleInput}>
                             {genderRows}
                         </FormControl>
                       </Col>
                      </FormGroup>
                      <FormGroup>
                        <Col componentClass={ControlLabel} sm={4}>
                            consent:
                        </Col>
                        <Col sm={6}>
                         <FormControl componentClass="select" name="consent" ref="select"  value={this.props.params.consent} onChange={this.handleInput.bind(this)}>
                             {consentRows}
                         </FormControl>  
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
                              <Checkbox  name="commentisExact" checked={this.props.params.commentisExact} onChange={this.handleCheckboxChange}>is Exact</Checkbox>
                          </Col>
                      </FormGroup>
                  </Form>
                </Row>
              
                 </Loader>
                    );
          
         
        }
  }
 
   export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(SubjectSearch); 
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


