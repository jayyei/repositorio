

const pendientes = ['Tarea', 'comer', 'Proyecto', 'Aprender']

pendientes.forEach((pendiente, index) => { //El index te da el indice, el pendiente es el contenido
    console.log(` ${index} : ${pendiente}`)
});

const carrito =[
    {id:1, producto: 'libro'},
    {id:2, producto: 'camisa'},
    {id:3, producto: 'Guitarra'},
    {id:4, producto: 'Disco'}
]

const nombreProducto = carrito.map((element)=>element.producto)

console.log(nombreProducto);

const automovil = {
    modelo: 'Camaro',
    motor: '6.1',
    anio: 1969,
    marca: 'Chevrolet'
}

for (let cosa in automovil){
    console.log(`${cosa} : ${automovil[cosa]}`)
}
