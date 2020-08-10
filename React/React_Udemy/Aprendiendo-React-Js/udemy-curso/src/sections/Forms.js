import React, { Component } from 'react';

export default class Forms extends Component{
    constructor(){
        super();
        this.state={
            name: "",
            twitter: "@"
        }
    }

    handleClick=(e)=>{
        e.preventDefault();
        console.log(this.state);
    }
    render(){
        return(
            <div>
                <h4>formularios</h4>
                <form onSubmit={this.handleClick}>
                    <p>
        <label htmlFor='name'>Nombre:</label> {/*La etiqueta htmlfor se usa para enlazar el evento del click a la entrada del formulario */}
                        <input 
                            id='name'
                            name='username'
                            value={this.state.name}
                            onChange={(e)=>this.setState({name:e.target.value})}
                            placeholder='Introuduce el nombre'/>
                    </p>
                    <p>
                        <label htmlFor='twitter'>Twitter:</label>
                        <input 
                            id='twitter'
                            name='twitterAccount'
                            value={this.state.twitter}
                            onChange={(e)=>this.setState({twitter:e.target.value})}
                            placeholder='Introuduce tu twitter'/>
                    </p>

                    <button>enviar</button> {/*si el ultimo botton encontrado al no tener motivo alguno servira
                     como el que envia la info del formulario*/}
                </form>
            </div>
        )
    }
}