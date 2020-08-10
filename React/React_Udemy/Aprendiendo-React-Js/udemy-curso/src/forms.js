import React, { Component } from 'react'

export default class Forms extends Component {
    constructor(){
        super()
        this.state ={
            inputName: '',
            inputTwitter: '@',
            inputTerms: true
        }
    }

    handleSubmit =(e) => {
        e.preventDefault()
        console.log(this.state)
        //const name = this.inputName.value
        //const name = document.getElementById('name').value
        //const email = document.getElementById('twitter').value
        //console.log(name, email)
    }

    handleChange=(e)=>{
        console.log(e.target.checked);
        this.setState({ inputTerms: e.target.checked})
    }
    render(){
        return(
            <div>
                <h4>Formularios</h4>
                <form onSubmit={this.handleSubmit}>
                    <p>
                        <label htmlFor='name'> Nombre:</label>
                        <input  id='name'
                                name='userName'
                                placeholder='Introduce el nombre'
                                ref={inputElement => this.inputName = inputElement} 
                                value={this.state.inputName}
                                onChange={ e => this.setState({inputName: e.target.value})}/>
                    </p>

                    <p>
                        <label htmlFor='twitter'> Twitter:</label>
                        <input  id='twitter'
                                name='twitterAccount'
                                placeholder='Introduce el twitter' 
                                value={this.state.inputTwitter}
                                onChange={ e => this.setState({inputTwitter: e.target.value})}/>
                    </p>

                    <p>
                        <label > 
                            <input 
                                onChange={this.handleChange}
                                type="checkbox"
                                checked={this.state.inputTerms} /> Acepto
                        </label>
                    </p>

                    <button >Enviar</button>
                </form>
            </div>
        )
    }
}