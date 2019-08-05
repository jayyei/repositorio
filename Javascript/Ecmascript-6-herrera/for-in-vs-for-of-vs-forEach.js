

// El metodo forEach() es un metodo unicamente disponible en objetos de tipo arreglo. Te permite iterar sobre elementos de un arreglo
//Cuando se invoca toma la funcion de callback una vez por cad elemento del arreglo

// El for in es usado para iterar sobre las propiedades de un objeto js. este metodo te permite tener acceso a las llaves de un objeto
// Pero no te provee referencias a sus valores

//En js los objetos tienen propiedades internas como la de "enumerable", el metodo for in solo funcionara si la propiedad que se encuentra
// tiene el enumerable puesto en true

//El for of es el metodo mas facil introducido en el ECM6 .. para que este metodo funcione en una coleccion esta debe de tener la propiedad Symbol.iterator 
