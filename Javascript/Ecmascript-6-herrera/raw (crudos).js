

let saludo = `Hola \n mundo\\`,

saludodos = String.raw`Hola \n mundo \\` //El string.raw permite que no se escapen los caracteresespeciales como los saltosde linea o las barras invertidas
console.info(saludo)
console.info(saludodos)