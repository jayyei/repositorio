import React, {useState} from 'react';
import {Error} from '../components/Error';
import shortid from 'shortid';
import PropTypes from 'prop-types';

export const Formulario = ({setGasto, setCrearGasto}) => {

    const [nombre, setNombre] = useState("");
    const [cantidad, setCantidad] = useState(0);
    const [error, setError] = useState(false);

    //cuando el usuario agregue un gasto
    const agregarGasto = e =>{
        e.preventDefault();

        //validar
        if(cantidad <= 0 || isNaN(cantidad) || nombre.trim() === ''){
            setError(true);
            return;
        }
        setError(false);
        //construir el gasto
        const gasto = {
            id: shortid.generate(),
            nombre,
            cantidad
        }
        console.log(gasto)
        //pasar el gasto al componente principal
        setGasto(gasto);
        setCrearGasto(true)
        //Resetear el formulario
        setNombre("");
        setCantidad(0);
    }


    return (
        <form onSubmit={agregarGasto}>
            <h2>Agregar tus gastos aquí</h2>
            {error? <Error mensaje="Ambos campos son obligatorios o presupuesto invalido"/>
                :null}
            <div className="campo">
                <label>Nombre gasto</label>
                <input
                    type="text"
                    className="u-full-width"
                    placeholder="Ej. transporte"
                    value={nombre}
                    onChange={e=>setNombre(e.target.value)}
                />
            </div>
            <div className="campo">
                <label>Cantidad gasto</label>
                <input
                    type="number"
                    className="u-full-width"
                    placeholder="Ej. 1000"
                    value={cantidad}
                    onChange={e=>setCantidad(parseInt(e.target.value,10))}
                />
            </div>
            <input
                type="submit"
                className="button-primary u-full-width"
                value="agregar gasto"
            />
        </form>
    )
}

Formulario.propTypes = {
    setGasto: PropTypes.func.isRequired,
    setCrearGasto: PropTypes.func.isRequired
}