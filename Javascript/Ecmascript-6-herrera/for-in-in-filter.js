let arregloNuevo = [{
        id: 1,
        description: "LaCuca"
    },
    {
        id: 2,
        description: "Ferr"
    },
    {
        id: 3,
        description: "rara"
    },
];

console.log(arregloNuevo.filter(x => {
    if ('description' in x) { //Similar al for in 
        return x.description !== "Ferr";
    } else {
        return x !== "Ferr"
    }
}))

/* El metodo for in itera sobre los nombres de las propiedades de un objeto mientras que forEach
itera sobre los valores del objeto */