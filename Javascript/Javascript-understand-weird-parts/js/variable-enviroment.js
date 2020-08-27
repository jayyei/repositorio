/*function b(){
    var myVar;
    console.log(myVar);
}


function a(){
    var myVar = 2;
    console.log(myVar);
    b();
}

var myVar = 1;
console.log(myVar);
a();

*/

let b = () => {  //The same result with arrow functions no matter if it is let or var
    let myVar;
    console.log(myVar);
}

let a = () => {
    let myVar = 2;
    console.log(myVar);
    b();
}

let myVar = 1;
console.log(myVar);
a();
console.log(myVar);