class Calculator {
    suma(number1, number2) {
        let suma = number1 + number2;
        console.log(suma);
        return suma;
    }
    resta(number1, number2) {
        let resta = number1 + number2;
        console.log(resta);
        return resta;
    }
}
window.onload = function () {
    var calc = new Calculator();
    console.log(`Resultado suma: ${calc.suma(1, 2)}`);
    console.log(`Resultado resta: ${calc.resta(2, 1)}`);
};
