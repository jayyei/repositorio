import React, { Fragment, useEffect } from 'react';
import logo from './logo.svg';
import { H1, H2 } from './components/headers'
import { Button1, Imagen } from './components/buttons'
import './App.css';

function App() {
  return (
    <Fragment>
      <div className="App">
        <H1/>
        <H2/>
      </div>
      <div className="App">
        <Button1/>
      </div>
      <div className="App">
        <Imagen/>
      </div>
    </Fragment>
  );
}

export default App;
