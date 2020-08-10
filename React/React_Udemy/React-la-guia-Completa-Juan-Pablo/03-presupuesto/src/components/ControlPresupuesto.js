import React, { Fragment } from 'react';
import { revisarPresupuesto } from '../helpers';
import Proptypes from 'prop-types';

export const ControlPresupuesto = ({presupuesto, restante}) =>{
    return (
        <Fragment>
            <div className="alert alert-primary">
                Presupuesto: $ {presupuesto}
            </div>
            <div className={revisarPresupuesto(presupuesto, restante)}>
                Restante: $ {restante}
            </div>
        </Fragment>
    )
};

ControlPresupuesto.propTypes = {
    presupuesto: Proptypes.number.isRequired,
    restante: Proptypes.number.isRequired
}