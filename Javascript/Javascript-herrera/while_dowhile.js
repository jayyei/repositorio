
var i = 0;

while( i<=10 ){
    i++
    if( i === 5){
        break // continua dentro del ciclo pero se brinca aquel que contenga la condicion
    }
    console.log(i);
}

do{
    i++
    if(i===5)
    continue
    console.log( i );
    
}while (i < 10 );

// El ciclo do while se ejecuta al menos una vez al momento de realizar el programa
// Continue lo que hace es omitir un ciclo en donde cierta condicion sea cierta y despues continua dentro del ciclo
// Break si rompe el ciclo, es decir a llegar a cierta condicion rompe la continuidad del mismo y evita que se siga ejecutando