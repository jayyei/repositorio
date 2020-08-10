import React, { Fragment, useState, useEffect } from 'react';
import Formulario from './components/formulario';
import Cita from './components/cita';
import PropTypes from 'prop-types';

function App() {

  //Citas iniciales en localStorage
  let citasIniciales = JSON.parse(localStorage.getItem('citas'));
  if(!citasIniciales){
    citasIniciales = []
  }

  //Arreglo de citas
  const [citas, setCitas] = useState(citasIniciales);

  //UseEffect para realizar ciertas operaciones cuando el state cambia
  useEffect(()=>{
      localStorage.setItem('citas', JSON.stringify(citas));
  },[citas]);

  // Funcion que tome las citas actuales y agregue la nueva
  const crearCita = cita => {
    setCitas([...citas, cita])
  };

  //Funcion que elimina una cita por su id
  const eliminarCita = id =>{
    const nuevasCitas = citas.filter(cita=>cita.id !== id)
    setCitas(nuevasCitas)
  }

  const titulo = citas.length === 0? 'No hay citas' : 'Administra tus citas';
  return (
    <Fragment>
      <h1>Administrador de tareas</h1>
      <div className="container">
        <div className="row">
          <div className="one-half column">
            <Formulario
              crearCita={crearCita}
            />
          </div>
          <div className="one-half column">
            <h2>{titulo}</h2>
            {citas.map(cita => (
              <Cita
                key={cita.id}
                cita={cita}
                eliminarCita={eliminarCita}
              />
            ))}
          </div>
        </div>
      </div>
    </Fragment>
  );
}

Formulario.propTypes = {
  crearCita:PropTypes.func.isRequired
}

export default App;

