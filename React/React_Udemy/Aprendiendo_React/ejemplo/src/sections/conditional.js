import React, { Component } from 'react';

class LoginButton extends Component {
    render(){
        return <button>Iniciar sesion</button>
    }
}

class LogoutButton extends Component {
    render(){
        return <div>
            <p>Bienvenido, usuario</p>
            <button>Cerrar sesion</button>
            </div>
    }
}

/* function useConditionalRendering(mostrarA){
    if(mostrarA){
        return <CompoenenteA/>
    }
    return <CompoenenteB/>
} */


export default class ConditionalSection extends Component {
    constructor(){
        super();
        this.state = {isUserLog : true}
    }

    render(){
        /* const conditionalComponent = this.state.mostrarA ? <CompoenenteA/> : <CompoenenteB/>; */
        return(
            <div>
                <h4>Conditional rendering</h4>
                {this.state.isUserLog ? <LoginButton/> : <LogoutButton/>}
               {/*  <CompoenenteA/>
                <CompoenenteB/> */}
                {/* conditionalComponent */}
            </div>
        )
    }
}