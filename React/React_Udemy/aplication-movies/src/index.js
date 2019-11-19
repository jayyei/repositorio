import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import { BrowserRouter } from 'react-router-dom'; //Se envuelve todo el app con el componente browserRoute
//Es la api de html5 history que permite cambiar el estado de las url y sincronizar la ui con estos cambios

ReactDOM.render(
    <BrowserRouter> 
        <App />
    </BrowserRouter>,
     document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
