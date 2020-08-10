import React from 'react';

const Producto = ({producto, carrito, setCarrito, productos}) => {

    const {nombre, precio, id} = producto;

    //Agregar producto al carrito
    const seleccionarProducto = () => {
        const producto = productos.filter(producto=> producto.id === id);
        const exists = carrito.find(element=>element.id === id);
        if(exists === undefined)
        setCarrito([...carrito, ...producto])
    }
    const eliminarProducto = () => {
        const producto = carrito.filter(producto=> producto.id !== id);
        setCarrito(producto)
    }

    return(
        <div>
            <h2>{nombre} {` $ ${precio}`}</h2>
            {productos? 
             <button type='button'
                onClick={seleccionarProducto}>
             Comprar
             </button>
            :<button type='button'
                onClick={eliminarProducto}>
             Eliminar
             </button>}
        </div>
    );
}

export default Producto;