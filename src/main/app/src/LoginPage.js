
import React, { Component } from 'react';
import $ from "jquery";
import {Redirect} from 'react-router-dom';
import {Image,Grid, Panel, Row, Form, FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';
import wrapWithTryCatch from 'react-try-catch-render';
import slimsLogo from './images/SLIMS.jpg';

class MyErrorHandler extends React.Component {
    render(){
        return (
            <div className="terrible-error">{this.props.error}</div>
        );
    }
}




 class LoginPage extends Component {

    constructor(props) {
        super(props);
        this.state={
            username:"",
            password:""      
        };
        
        this.handleInput = this.handleInput.bind(this); 
        this.handleLogin = this.handleLogin.bind(this); 
        

    }


    componentDidMount() {
        
    }

    handleInput(event) {
       
        if (event == null) {
            return;
        }

        if (event.target == null) {
            return;
        }

        const name = event.target.name;
        
        const value = event.target.value;
        
        this.setState({[name]:value});

    }
    
    handleLogin(event){
        event.preventDefault();
        var url = this.props.url;
        
     url = url.concat("/login");
     
        $.ajax({
            url: url,
            type: "POST", //send it through post method
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify(this.state),
            success: (data) => {
                console.log(data);

                if(data.username == this.state.username)
                { 
                    this.props.parentLogin(true);
                }
            }
        });
    }
    
    render() {
       try{ 
       
        }catch(e){
            console.log(e);
        }
//       
        return(
                 
                <Row>
                   <Image src={slimsLogo} responsive />
                    <Col sm={2}></Col> 
                    <Col sm={8}>
                    <h3 className="customHeader">Login</h3>
                    <Form className="customForm" onSubmit={this.handleLogin}>
                        <FormGroup controlId="Login">
                            <Col componentClass={ControlLabel} sm={2}>
                              UserName:
                            </Col>
                            <Col sm={10}>
                            <FormControl type="text"  name="username" value={this.state.username} onChange={this.handleInput}></FormControl>
                            </Col>
                             <Col componentClass={ControlLabel} sm={2}>
                              PassWord:
                            </Col>
                            <Col sm={10}>
                            <FormControl type="password"  name="password" value={this.state.password} onChange={this.handleInput}></FormControl>
                            </Col>
                        </FormGroup> 
                        <Button  type="submit" value="Submit">Submit</Button>    
                    </Form>
                    </Col>
                    
                </Row>
                );
    }
}

  export default wrapWithTryCatch(React,MyErrorHandler, {error:"Caught an Exception from RecursiveTable. See Console for details"})(LoginPage); 

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


