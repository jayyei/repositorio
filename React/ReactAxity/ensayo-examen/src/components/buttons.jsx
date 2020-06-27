import React from 'react';
import certified from '../assets/images/Jay_Sanchez.jpg';
import '../styles/styles-component.css';


export const Button1 = (props)=> {
    return(
        <button className='button1' type='button'>Oculta Headers</button>
    )
}

export const Imagen = (props) => {
    return(
        <img className = "imagen" src={certified} alt="No"/>
    )
}