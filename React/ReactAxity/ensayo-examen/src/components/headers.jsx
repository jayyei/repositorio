import React from 'react';
import '../styles/styles-component.css'

const styleH1 = {
    backgroundColor: 'red', 
    width: 'fit-content', 
    textAlign: 'center',
    borderRadius: '15px',
    color: 'white',
    marginRight: '1%'
}

export const H1 = (props) => (
    <h1 style={styleH1}>
        Hola soy h1
    </h1>
);

export const H2 = (props) => (
    <h2 className='styleH2'>
        Hola soy h2
    </h2>
);


