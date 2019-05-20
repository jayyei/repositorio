import React, { Component } from 'react';

class Contador extends Component{

  constructor(props){   //Para llamar al setState se necesita el constructor y el metodo super
    super(props)
    this.state = {contador: this.props.contadorInitial}
    setInterval(() => {
      this.setState({contador : this.state.contador + 1})
    }, 1000)
  }

  render(){
    return <ContadorNumero numero= {this.state.contador}/>
  }
}

Contador.defaultProps = {
  contadorInitial : 0
}

class ContadorNumero extends Component {
  render(){
    console.log('ejecucion del render de contadornumero')
    return <span>{this.props.numero}</span>
  }
}
class App extends Component {
  render() {
    return (
      <div className="App">
      <p>Primer Componente con state</p>
      <Contador/>
      </div>
    )
  }
}

export default App;