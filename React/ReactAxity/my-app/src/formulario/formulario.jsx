import React, { Component } from "react";
import { connect } from "react-redux";

import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import { withStyles } from '@material-ui/core/styles';
import FormTemplate from './formulario-form';

import { actionSendData } from '../actions/action-formulario';
export class Formulario extends Component{

    constructor(props){
        super(props);
        this.state={
            email: '',
            pwd: ''
        };
        this.sendData = this.sendData.bind(this);
    }

    componentDidMount(){
    }
    
    componentWillUpdate(){
    }

    componentWillMount(){}

    sendData(){
        let requestObjetc = {
            email: this.state.email,
            pwd: this.state.pwd
        };
        this.props.actionSendData(requestObjetc);
    }
    render(){
        const formDiv =[
            <div>
                <form>
                <TextField
                    id="outlined-email-input"
                    label="Email"
                    type="email"
                    name="email"
                    autoComplete="email"
                    margin="normal"
                    variant="outlined"
                    value={this.state.email}
                   onChange={e => this.setState({ email: e.target.value })}
                />

                <TextField
                    id="outlined-password-input"
                    label="Password"
                    type="password"
                    autoComplete="current-password"
                    margin="normal"
                    variant="outlined"
                    value={this.state.pwd}
                   onChange={e => this.setState({ pwd: e.target.value })}
                 />

                <Button variant="contained" color="primary" onClick={this.sendData}>
                        Primary
                </Button>
                </form>
            </div>
        ]
        return(
            <div>
              <FormTemplate fields={formDiv} submitHandler={(x, y) => { }} />
            </div>
        );
    }
}

const mapStateToProps = state => ({
});

const mapDispatchToProps = dispatch => ({
    actionSendData: (t) => dispatch(actionSendData(t))
 });

const FormularioContainer = connect(mapStateToProps, mapDispatchToProps)(Formulario);

export default FormularioContainer;