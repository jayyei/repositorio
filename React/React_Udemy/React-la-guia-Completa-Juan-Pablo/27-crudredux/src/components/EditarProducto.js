import React,{useEffect, useState} from 'react';
import {useDispatch, useSelector} from 'react-redux';
import { editarProductoAction } from '../actions/productoActions';
import { useHistory } from 'react-router-dom';


const EditarProducto = () => {

    // nuevo state de producto
    const [producto, guardarProducto] = useState({
        nombre: '',
        precio: '' 
    })

    const history = useHistory();
    const dispatch = useDispatch();

    const productoEditar = useSelector(state => state.productos.productoEditar);
    
    //Llenar el state automaticamente
    useEffect( ()=> {
        if (productoEditar) guardarProducto(productoEditar)
    }, [productoEditar]);

    const onChangeFormulario = e => {
        guardarProducto({
            ...producto,
            [e.target.name]: e.target.value
        })
    }
    
    const {nombre, precio} = producto;

    const submitEditarProducto = e => {
        e.preventDefault();
        dispatch(editarProductoAction(producto));
        history.push('/')
    }

    return(
        <div className="row justify-content-center">
            <div className="col-md-8">
                <div className="card">
                    <div className="card-body">
                        <h2 className="text-center mb-4 font-weigth-bold">
                            Editar Nuevo Producto
                        </h2>
                        <form
                            onSubmit={submitEditarProducto}
                        >
                            <div className="form-group">
                                <label>
                                    Nombre Producto
                                    <input
                                        type="text"
                                        className="form-control"
                                        placeholder="Nombre Producto"
                                        name="nombre"
                                        onChange={onChangeFormulario}
                                        value={nombre}
                                    />
                                </label>
                            </div>
                            <div className="form-group">
                                <label>
                                    Precio Producto
                                    <input
                                        type="number"
                                        className="form-control"
                                        placeholder="Precio Producto"
                                        name="precio"
                                        onChange={onChangeFormulario}
                                        value={precio}
                                    />
                                </label>
                            </div>
                            <button 
                                type="submit"
                                className="btn btn-primary font-weight-bold text-uppercase d-block w-100"
                            > Guardar Cambios
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default EditarProducto;