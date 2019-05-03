import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { routes } from './routes.jsx';
import Formulario from './formulario/formulario';

import { Provider } from 'react-redux';
import { createStore, applyMiddleware, compose } from 'redux';
import { routerMiddleware } from 'react-router-redux';
import createHistory from 'history/createBrowserHistory';
import thunk from 'redux-thunk';

import rootReducer from './reducers';

const history = createHistory();
const _routerMiddleware = routerMiddleware(history);
const composeEnhacers = window.__REDUX_DEVT0OOLS_EXTENSION_COMPOSE__ || compose;
const store  = createStore(
  rootReducer,
  composeEnhacers(
    applyMiddleware( thunk, _routerMiddleware)
  )
);

class App extends Component {
  render(){
    return (
      <Provider store = {store}>
      <div>
        <Formulario/>
        { /* routes */ }
      </div>
      </Provider>
    );
  }
  }

export default App;
