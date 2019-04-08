
var arguments = 10;

function miFuncion(a,b,c,d){
    console.log( arguments );
    if (arguments.length === 4)
    {
        console.info(a + b + c + d)
    }else {
        console.error("No son numeros")
        console.error(typeof arguments);
    }
}

miFuncion(10,20,30,40 );
console.log(typeof 10);