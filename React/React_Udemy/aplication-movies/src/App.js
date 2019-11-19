import React, {Component} from 'react';
import {Switch, Route } from 'react-router-dom' //Switch sirve para envolver rutas de forma que solo renderiza la primera ruyta que satisfaga la regla que se delcara en la app 
import './App.css';
import 'bulma/css/bulma.css'

import { Detail } from './pages/detail';
import { Home } from './pages/home';
import { NotFound } from './pages/NotFound'

class App extends Component{
  
  render(){
    //const url = new URL(document.location) //Desde js sacas el parametro url de la ubicaion actual
    //const Page = url.searchParams.has('id')? // si es url puedes buscar parametros y preguntar si tiene el id
     // <Detail id={url.searchParams.get('id')}/>:
      //<Home/>

    return (
      <div className="App">
        <Switch> {/*Switch se utilza para envolver las routes que se declaran*/}
          <Route exact path='/' component={Home}/> {/* Para colocar las rutas de forma delcarativa */}
          <Route exact path='/detail/:id' component={Detail}/>
          <Route component= {NotFound}/> {/**Al incluirla al final y al no definirle un path sera el por defecto a cargar cuando no hay match con las demas paginas */}
        </Switch>
      </div>
    );
  }
}

export default App;
