import React from "react";
import { render } from "react-dom";
import "./index.css";
import CounterContainer from "./containers/Counter";

import { counterApp } from "./reducers";
import { createStore } from 'redux';
import { Provider } from 'react-redux';

const store = createStore(counterApp);

render(
  < Provider store = { store } >
    <CounterContainer / >
  </Provider>,
    document.getElementById("root")
  );

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
