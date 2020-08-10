import React, { Component } from 'react';

class EjemploComponentDidMount extends Component {
    constructor (props){
        super(props)
        console.log("Construcotr")
        this.state ={

        }
    }

    componentWillMount(){
        console.log("Component will mount")
    }
    componentDidMount(){
        console.log("Component did mount")
    }

    render(){
        console.log("Render")
        return(
            <div className="App">
                
            </div>
        )
    }
}

export default EjemploComponentDidMount;