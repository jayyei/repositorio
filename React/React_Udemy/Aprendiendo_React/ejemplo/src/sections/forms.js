import React, { Component } from 'react' ;

export default class Forms extends Component {
    constructor(){
        super()
        this.state = {
            inputName: '',
            inputTwitter: '@',
            inputTerms: true
        }
    }
    handleSubmit = (e) => {
        e.preventDefault()
        //const name = document.getElementById('name').value
       /*  const name = this.inputName.value
        const email = document.getElementById('twitter').value
        console.log({name, email}); */
        console.log(this.state)
    }

    handleChange = (e) => {
        console.log('hanndleChange')
        console.log(e.target.checked)
        this.setState({inputTerms: e.target.checked})
    }

    render(){
        return (
            <div>
                <h4>Formularios</h4>
                <form onSubmit={this.handleSubmit}>
                    <p>
                        <label htmlFor='name'>Nombre: </label>
                        <input 
                        id='name'
                        name='userName'
                        onChange={e => this.setState({ inputName: e.target.value})}
                        placeholder='Introduce el nombre' 
                        ref={inputElement => this.inputName = inputElement}
                        value = {this.state.inputName}/>
                    </p>

                    <p>
                        <label htmlFor='twitter'>Twitter: </label>
                        <input
                        id='twitter'
                        name='twitterAccount'
                        onChange= {e => this.setState({ inputTwitter: e.target.value})}
                        placeholder='Introduce tu Twitter' 
                        value= {this.state.inputTwitter}/>
                    </p>

                    <p>
                        <label>
                            <input 
                            checked = {this.state.inputTerms}
                            onChange={this.handleChange} 
                            type='checkbox' />
                            Accepted terms
                        </label>
                    </p>

                    <button>Enviar</button>
                </form>
            </div>
        )
    }
}

//onSubmit remplaz a onclick del botton, este onsubmit ahora se colocara en el form directamente 
//Otros eventos a considerar son los onInput y onInvalite