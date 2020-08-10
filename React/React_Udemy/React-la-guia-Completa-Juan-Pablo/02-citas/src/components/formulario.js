import React, { Fragment, useState } from 'react';
import { v4 as uuid } from 'uuid';


const Formulario = ({crearCita}) => {

    //Crear State de Citas
    const[cita, setCita] = useState({
        mascota: '',
        propietario: '',
        fecha: '',
        hora: '',
        sintomas: ''
    });
    const [error, setError] = useState(false)

    //Funcion que se ejecuta cada que el usuario escribe en un input
    const actualizarState = (e) =>{
        //e.persist(); //Para evitar nullables en el evento, que se utilizan para mejorar el performance
        setCita({
            ...cita, //Recuerda que se puede destructurar objetos para copiarlos
            [e.target.name]: e.target.value
        })
    }

    const {mascota,propietario,fecha,hora,sintomas} = cita;

    //Cuando el usuario presiona agregar cita
    const submitCita = e =>{
        e.persist();
        e.preventDefault();
        //Validar
        const validarCita = () => (
            Object.values(cita).some(x => x.trim() === '')
        )
        if(validarCita()){
            setError(true);
            return
        }
        cita.id = uuid();
        setError(false);
        //Asignar un ID

        //Crear la cita
        crearCita(cita)
        //Reiniciar el form
        setCita({
            mascota: '',
            propietario: '',
            fecha: '',
            hora: '',
            sintomas: ''
        })
    }

    return (
        <Fragment>
            <h2>Crear Cita</h2>
            {error ? <p className="alerta-error">
                Todos los campos son obligatorios
            </p> : null}
            <form
                onSubmit={submitCita}>
                <label>Nombre Mascota</label>
                <input
                    type='text'
                    name='mascota'
                    className='u-full-width'
                    placeholder="Nombre Mascota"
                    onChange={actualizarState}
                    value={mascota} 
                />
                <label>Nombre Dueño</label>
                <input
                    type='text'
                    name='propietario'
                    className='u-full-width'
                    placeholder="Nombre Dueño de la mascota"
                    onChange={actualizarState}
                    value={propietario}
                />
                <label>Fecha</label>
                <input
                    type='date'
                    name='fecha'
                    className='u-full-width'
                    onChange={actualizarState}
                    value={fecha}
                />
                <label>Hora</label>
                <input
                    type='time'
                    name='hora'
                    className='u-full-width'
                    onChange={actualizarState}
                    value={hora}
                />
                <label>Sintomas</label>
                <textarea
                    name='sintomas'
                    className='u-full-width'
                    onChange={actualizarState}
                    value={sintomas}
                ></textarea>
                <button
                    type='submit'
                    className="u-full-width button-primary"
                >Agregar Cita
                </button>
            </form>
        </Fragment>
    );
}

export default Formulario;