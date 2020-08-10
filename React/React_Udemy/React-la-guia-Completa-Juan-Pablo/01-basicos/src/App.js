import React, { Fragment, useState } from 'react';
import Header from './components/header';
import Footer from './components/footer';
import Producto from './components/producto';
import CarritoDeCompras from './components/carrito';
import Carrito from './components/carrito';

function App() {

  const [productos, setProductos] = useState([
    {id:1, nombre: 'Camisa ReactJS', precio: 50},
    {id:2, nombre: 'Camisa VueJS', precio: 40},
    {id:3, nombre: 'Camisa Node.JS', precio: 30},
    {id:4, nombre: 'Camisa Angular', precio: 20},
  ]);

  const [carrito, setCarrito] = useState([]);
  //Obtener la fecha
  const fecha = new Date().getFullYear();

  return (
    <Fragment>
      <Header
        titulo='Tienda virtual'
      />
      <h1>Lista de productos</h1>
      {productos.map(producto=>(
        <Producto
          key={producto.id}
          producto={producto}
          carrito={carrito}
          productos={productos}
          setCarrito={setCarrito}
        />
      ))}
      <CarritoDeCompras
        carrito={carrito}
        setCarrito={setCarrito}
      />
      <Footer
        fecha={fecha}
      />
    </Fragment>
  );
}

export default App;
