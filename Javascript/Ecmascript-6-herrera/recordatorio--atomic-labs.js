		///Recordatorio de examen

		//Variables locales: Las variables declaradas dentro de una function de javascript se vuelven locales a la funcion, no importa si usas var

		//Ejemplo

		//code here can Not use carName

		function myFunction() {
		    var carName = "Volvo";
		}

		//code Here can NOT use carName

		console.log(typeof carName) //Arroja undefined



		//FUNCIONES CON DOBLES PARAMETROS EN JAVASCRIPT
		//En javascript, las funciones nos proveen acceso to arguments object el cual provee los actuales parametros pasados
		//A una funcion
		//Ejemplo de suma

		function suma(x) {
		    if (arguments.length === 2) {
		        return arguments[0] + arguments[1];
		    } else {
		        return function(y) {
		            return x + y;
		        }
		    }
		}

		console.log(suma(2)(3));
		console.log(suma(2, 3));

		//Segunda forma

		function suma2(x, y) {
		    if (y !== undefined) {
		        return x + y;
		    } else {
		        return function(y) {
		            return x + y
		        }
		    }
		}

		console.log(suma2(2, 3));
		console.log(suma(2)(3));