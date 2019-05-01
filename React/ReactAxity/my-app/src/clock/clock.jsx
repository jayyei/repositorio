import React, {Component} from 'react';

export class Clock extends Component{
    constructor(props){
        super(props);
        this.state = {
            date: new Date(),
            isoFormat : false
        };
        //this.showMessage2() = this.showMessage2.bind(this);
    }

    componentDidMount(){
        console.log("Inicio");
        this.timerId = setInterval(
            () => this.tick(), 1000
        )
    }

    componentWillUpdate(){
        console.log("Actualizacion");
        /* this.showMessage2(); */
    }

    componentWillUnmount(){
        console.log("Actualizacion");
    }

    tick(){
        this.setState({
            date: new Date()
        })
    }

    showMessage(){
        alert("Hola mundo");
    }

    showMessage2(){
        alert("Hola mundo");
    }

    changeFormat(isoFormat2){
        this.setState({
            isoFormat : !isoFormat2
        });
    }
    

    render(){
        const clockDiv = [
          <div>  
            <h1>Componente Reloj</h1>
            <h1>Hora: { 
                this.state.isoFormat ? 
                this.state.date.toISOString() :
                this.state.date.toLocaleTimeString() }</h1> 
         </div>
        ];
        
        const buttonDiv = [
            <div> 
                <button onClick={this.changeFormat.bind(this, this.state.isoFormat)}>Presiona
                { 
                this.state.isoFormat ? 
                ' Cambia a pesos' :
                ' Cambiar a dolares' }
                </button> 
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