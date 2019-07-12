//Comparaciones de == y === y Object.is que es un simple comparador

console.log(+0 == -0)
console.log(+0 === -0)
console.log( Object.is(+0,-0)) //Comparacion bien minusiosa

console.log("======")

console.log(NaN==NaN);
console.log(NaN===NaN);
console.log(Object.is(NaN,NaN));

console.log("======")
console.log(5==5)
console.log(5=="5")

console.log("======")
console.log(5===5)
console.log(5==="5")

console.log("======")
console.log(Object.is(5,5))
console.log(Object.is(5,"5"))