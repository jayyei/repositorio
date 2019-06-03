import React from 'react';
import logo from './logo.svg';
import './App.css';

/* titleCompoenent.defaultProps ={
    example : true,
    string : true,
    number : 123
} */  //Default props

function App() {
  return (
    <div className="App">
      <Text 
      number = {2}
       />
    </div>
  );
}

class Contador extends Component { //Cuando usar el constructor y el super, es sencillo cuando se quieren usar los states y cuando se desa definir una prop como algun state inicial del compoenente
  constructor(props){
    super(props)
    console.log(this.props.contadorInicial)
    setInterval(()=> {
      this.setState({ contador: this.state.contador + 1})
    } , 1000)
  }

  render (){
    return <h1>this.state.contador</h1>
  }
}


export default App;



