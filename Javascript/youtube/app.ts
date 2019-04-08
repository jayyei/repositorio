let miFuncion = function(a: number, b: number){
    return a + b;
}

let miFuncion2 = (a:number, b:number) => a + b;

let miFuncion3 = function(nombre:string){
    nombre = nombre.toUpperCase();
    return nombre;
}

let miFuncion4 = (nombre:string) =>{
    nombre = nombre.toUpperCase();
    return nombre;
}
console.log(miFuncion4("Alberto"),miFuncion3("Alberto"));