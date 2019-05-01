import React, {Component} from 'react';

export class Clock extends Component{
    constructor(props){
        super(props);
        this.state = {
            date: new Date()
        }
    }

    componentDidMount(){
        console.log("Inicio");
        this.timerId = setInterval(
            () => this.tick(), 1000
        )
    }

    componentWillUpdate(){
        console.log("Actualizacion");
    }

    componentWillUnmount(){
        console.log("Actualizacion");
    }

    tick(){
        this.setState({
            date: new Date()
        })
    }

    render(){
        const clockDiv = [
          <div>  
            <h1>Componente Reloj</h1>
            <h1>Hora: { this.state.date.toLocaleTimeString() }</h1> 
         </div>
        ];
        
        const buttonDiv = [
            <div> 
                <button>Presiona</button> 
           </div>
          ];
        return(
            <div>
                {clockDiv}
                {buttonDiv}    
            </div>
        )
    }
}