 import React, { Component } from 'react'; 
 import {FormGroup, FormControl, Button, Checkbox, Col, ControlLabel} from 'react-bootstrap';

export default class DateInput extends Component{
    render(){
        return(
                    <FormControl type="date" name={this.props.name} value={this.props.value} onChange={this.props.handleInput} ></FormControl>    
        ); 
    }
    
}
