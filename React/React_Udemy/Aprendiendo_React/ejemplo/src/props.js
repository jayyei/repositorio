import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

/* function Hello (props) {
  return <h2>{props.title}</h2> 
} */

// const Hello = (props) => <h2>{props.title}</h2>

class Hello extends Component {
  render(){
    return <h2>{this.props.title}</h2>
  }
}

class Text extends Component {
  render () {
    const { isActivated, 
      arrayOfNumbers, 
      multiply, 
      text, 
      number, 
      objectWithInfo,
      title
    } = this.props
    
    const textoSegundoBol = isActivated ? 'Es Cierto' : 'Es Falso';
    const mappedNumbers = arrayOfNumbers.map(multiply);
    return (
      <div>
        <p>{text}</p>
        <p>{number}</p>
        <p>{textoSegundoBol}</p>
        <p>{arrayOfNumbers.join(', ')}</p>
        <p>{mappedNumbers.join(', ')}</p>
        <p>{objectWithInfo.key}</p>
        {/* <p>{JSON.stringify(this.props.boolean)}</p> */}
        {title}
      </div>
    )
  }
}

class App extends Component {
  render(){
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
        </a>
        <Hello title='Hola desde un prop'/>
      </header>
      <Text 
        arrayOfNumbers={[2,3,8]}
        isActivated
        objectWithInfo={{ key: 'First Value', key2: 'otherValue'}}
        multiply={(number) => number * 5}
        number={2} 
        text='Testeando el string' 
        title={<h1>Este es el titulo</h1>}
        />
    </div>
  );
}
}

export default App;