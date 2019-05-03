import React  from 'react';
import { BrowserRouter, Route, Link, Switch } from 'react-router-dom';
import { Hello } from './hello-world/hello-world';
import { Clock } from './clock/clock';
import { Formulario } from './formulario/formulario';

export const routes = (
    <BrowserRouter>
       <Switch>
        <Route exact key = "Hello" path="/hello" component = {Hello}></Route> {/* Solo para componentes en donde necesitamos una proteccion */}
        <Route exact key = "Clock" path="/clock" component = {Clock}></Route>   
        <Route exact key = "formulario" path="/formulario" component = {Formulario}></Route>   
       </Switch> 
    </BrowserRouter>
);