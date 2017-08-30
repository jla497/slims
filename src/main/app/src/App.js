/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import React, { Component } from 'react';
import { browserHistory, Router,Route } from 'react-router';
import './App.css';
import slimsLogo from './images/SLIMS.jpg';
import {Image, ButtonGroup, Grid, Row, Col, Panel, Button, Form, FormControl, ControlLabel} from 'react-bootstrap';
import $ from "jquery";
import Loader from 'react-loader';
import SearchPage from './SearchPage';
import LoginPage from './LoginPage';

export default class MainApp extends Component{
        
    constructor(props){

        super(props);

        this.state = {
            authed:null,
           url:"http://dlappsrv01.hli.ubc.ca:8080/slims2",
            //url:"http://localhost:8080/slims2"
        };
        
        this.parentLoginHandle = this.parentLoginHandle.bind(this);
        this.logOut = this.logOut.bind(this);
        this.isLoggedIn = this.isLoggedIn.bind(this);
    } 
    
    parentLoginHandle(value){
        
        if(value === true){
            console.log("authenticated!");
            this.setState({authed:true});
        }
    }
    
    
    isLoggedIn(){
        console.log("is logged in?");
        console.log(this.state.authed);
        if(this.state.authed != true){
            
            return false;
        }
        
        return true;
        
    }
    logOut(event){
        
        this.setState({authed:null});
        
    }
    
    shouldComponentUpdate(props,state){
        if (state.authed != this.state.authed){
            
            return true;
        }
        else{
            
            return false;
        }
    }
   
    render(){
            if(this.state.authed!=true){
                
                return(<LoginPage url={this.state.url} parentLogin={this.parentLoginHandle}/>);
            }
            else{
                
                 return(<SearchPage url={this.state.url} logOut={this.logOut} /> );
                
            }
           
    }
 } 
