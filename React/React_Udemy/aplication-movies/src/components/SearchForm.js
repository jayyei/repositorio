import React, { Component } from 'react';

const API_KEY = '4287ad07';

export class SearchForm extends Component{
    state={
        inputMovie: '',
    }

    _handleChange = (e) => {
        this.setState({inputMovie: e.target.value})
    }
    _handleSubmit = (e) => {
        e.preventDefault();
        const { inputMovie } = this.state;
        fetch(`http://www.omdbapi.com/?apikey=${API_KEY}&s=${inputMovie}`)
            .then(res=>res.json())
                .then(results =>{
                    const { Search =[], totalResults="0" } = results; //Cuando viajen algunos datos para realizar el setState de algun componente, puedes destructurar l;a informacion y siempre tratar de mantener el tipo de dato con el que se inicio el state para asi evitar validaciones inecesarias
                    //Aqui por ejemplo antes de que viajen Search al componente padre y sean Seteadas, primero se le da un valor por defecto que sea el mismo tipo del state inicial al que se va a setear
                    console.log(Search, totalResults)
                    this.props.onResults(Search)
                })
    }
    render (){
        return(
        <form onSubmit={this._handleSubmit}>
            <div className="field has-addons">
                <div className="control">
                    <input className="input" 
                        type="text" 
                        onChange={this._handleChange}
                        placeholder="Movie to search..."/>
                </div>
                <div className="control">
                    <button className="button is-info">
                    Search
                    </button>
                </div>
            </div>
        </form>
    )
    }
}