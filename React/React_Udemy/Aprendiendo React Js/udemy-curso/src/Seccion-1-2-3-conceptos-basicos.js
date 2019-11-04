import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';

/* function Hello (props){        //Esta funcion es equivalente creando una clase que extienda de Component
  return <h2>{props.title}</h2>
} */


class Hello extends Component {
  constructor (props){    //Para inicializar el state de cualquier componente de react se requiere de utilizar el constructor y mandar a llamar el metodo super, a su vez es necesario inicializar el this.state dentro del constructor
    super(props);
    this.state ={ contador: this.props.contador} //Para utilizar las props en el state inicial de un componente, es necesario pasarlas como parametro al constructor y a la llamada al metodo super
    setInterval(()=> this.setState({contador: this.state.contador +1}),1000)
    // no se debe de mutar los cambios idrectamente del componente porque react optimiza cuando debe de realizar los cambios en el arbol de navegacion
  }
  render (){
    return <div>
              <h1>{this.state.contador}</h1>
              <h2>{this.props.title}</h2>
          </div> 
  }
}

//El flujo de datos es de padres a hijos, es decir cada vez que cambia el estado del padre, este se actualiza, pasa el estado del mismo a sus hijos y estos se vuelven a renderizar

class Text extends Component {

  render (){
    const {title, defecto, text, number, boolean } = this.props
    return <div>
              {title}
              <h2>{text}</h2> 
              <h2>{number}</h2>
              <h2>{defecto}</h2>
              <h2>{JSON.stringify(boolean)}</h2>
           </div>
  }
}

Text.defaultProps = {
      defecto: "Esta es una prop por defecto"
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Hello title="Bienvenido a react" contador={40}/>
        <Text 
          text="String" 
          number={2} 
          boolean={true}
          title={<h1>Este es un titulo</h1>} />
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
            Notas importantes para jsx
            Para observar los errores en jsx debes de instalar la extension de eslint de tu editor de codigo 
            y ademas debes de crear en la altura de src un archivo con extension .eslintrc en donde debes de indicar lo que se menciona en este archivo de ejemplo 
        </a>
      </header>
    </div>
  );
}

export default App;
