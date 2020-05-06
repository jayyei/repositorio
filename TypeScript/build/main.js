var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};
var arreglo = [1, 2, 3, 4, 5, 6, 7];
var villanosArray = ["Omega Rojo", "Dormammu", "Duende verde"];
console.log(villanosArray[0].charAt(0));
var vengador;
var existe; //Si no esta definido el tipo, sera any
var derrotas;
vengador = "Dr Strange";
console.log(vengador.charAt(0));
vengador = 150.5555;
console.log(vengador.toFixed(2));
vengador = true;
console.log(vengador);
//Formas de definir booleanos
var esSuperman = true;
var esBatman;
var esAquaman = true; //No recomandada
//No importa si es mayuscula o minuscula
if (esSuperman) {
    console.log("Estamos salvados!!");
}
else {
    console.log("Ooops!");
}
esSuperman = convertirClark();
function convertirClark() {
    return false;
}
var cualquierValor = "Cualquier cosa";
var largoDelString = cualquierValor.length;
console.log(largoDelString);
var Volumen;
(function (Volumen) {
    Volumen[Volumen["min"] = 1] = "min";
    Volumen[Volumen["medio"] = 5] = "medio";
    Volumen[Volumen["max"] = 10] = "max";
})(Volumen || (Volumen = {}));
var audio = Volumen.medio;
console.log(audio);
console.log(Volumen[1]);
//El enum es un objeto al derecho y al reves osea
//los atributos son los valores
//y a su vez los valores son los atributos para acceder alos mismos
function error(mensaje) {
    throw new Error(mensaje);
}
error("Error");
var avengers = 5;
var villanos;
var otros = 2;
if (avengers > villanos) {
    console.log("Estamos Salvados");
}
else {
    console.log("Estamos muertos");
}
var batman = "Batman";
var linterna = "Linterna verde";
var volcanNegro = 'Volcan Negro';
console.log(batman);
console.log(linterna);
console.log(volcanNegro);
var concatenar = "Los heroes son: " + batman + ", " + linterna + ", " + volcanNegro;
console.log(concatenar);
var heroeTupla = ["Dr. strange", 100, false];
heroeTupla[0] = "String";
heroeTupla[1] = 12;
heroeTupla[2] = true;
heroeTupla.push(false); //Este push lo permite, algo que esta raro
function llamar_batman() {
    console.log("Mostrar la batisenal");
}
var mensaje = llamar_batman();
// Funciones Básicas
function sumarE2(a, b) {
    return a + b;
}
var contar = function (heroes) {
    return heroes.length;
};
var superHeroes = ["Flash", "Arrow", "Superman", "Linterna Verde"];
contar(superHeroes);
//Parametros por defecto
function llamarBatman(llamar) {
    if (llamar === void 0) { llamar = false; }
    if (llamar) {
        console.log("Batiseñal activada");
    }
}
llamarBatman();
// Rest?
function unirheroes() {
    var personas = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        personas[_i] = arguments[_i];
    }
    return personas.join(", ");
}
// Tipo funcion
function noHaceNada(numero, texto, booleano, arreglo) {
}
// Crear el tipo de funcion que acepte la funcion "noHaceNada"
var noHaceNadaTampoco;
function nombreCompletoOpcional(nombre, apellido, capitalizado) {
    if (capitalizado === void 0) { capitalizado = false; }
    return capitalizado ? (nombre + ' ' + apellido).toUpperCase() :
        (nombre + ' ' + apellido).toLowerCase();
}
var nombreOpcional = nombreCompletoOpcional("Barry");
console.log(nombreOpcional);
var heroe = "Flash";
function imprime_heroe() {
    return heroe;
}
var activar_batisenal = function () {
    return "batisenal activada";
};
console.log(imprime_heroe());
console.log(activar_batisenal());
//parametros obligatorios de las funciones
function nombreCompleto(nombre, apellido) {
    return nombre + ' ' + apellido;
}
var nombre = nombreCompleto("Clark", "kent");
console.log(nombre);
function nombreCompletoRest(nombre) {
    var losDemasParametros = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        losDemasParametros[_i - 1] = arguments[_i];
    }
    return nombre + " " + losDemasParametros.join(" ");
}
var superman = nombreCompletoRest("Clark", "Joseph", "Kent");
var ironman = nombreCompletoRest("Anthony", "Edward", "Tony", "Stark");
console.log(superman);
console.log(ironman);
function sumar(a, b) {
    return a + b;
}
function saludar(nombre) {
    return "I'm" + nombre;
}
function salvarMundo() {
    console.log("El mundo esta salvado");
}
var miFuncion;
miFuncion = 10;
miFuncion = sumar;
console.log(miFuncion(5, 5));
miFuncion = saludar;
console.log(miFuncion("Batman"));
miFuncion = salvarMundo;
miFuncion();
var batimovil = {
    carroceria: "Negra",
    modelo: "6x6",
    antibalas: true,
    pasajeros: 4
};
var bumblebee = {
    carroceria: "Amarillo con negro",
    modelo: "4x2",
    antibalas: true,
    pasajeros: 4,
    disparar: function () {
        console.log("Disparando");
    }
};
// Villanos debe de ser un arreglo de objetos personalizados
var villanos = [{
        nombre: "Lex Luthor",
        edad: 54,
        mutante: false
    }, {
        nombre: "Erik Magnus Lehnsherr",
        edad: 49,
        mutante: true
    }, {
        nombre: "James Logan",
        edad: undefined,
        mutante: true
    }];
var charles = {
    poder: "psiquico",
    estatura: 1.78
};
var apocalipsis = {
    lider: true,
    miembros: ["Magneto", "Tormenta", "Psylocke", "Angel"]
};
// Mystique, debe poder ser cualquiera de esos dos mutantes (charles o apocalipsis)
var mystique;
mystique = charles;
mystique = apocalipsis;
var flash = {
    nombre: "Barry Allen",
    edad: 24,
    poderes: ["Puede correr muy rapido", "Viajar por el tiempo"],
    getNombre: function () {
        return this.nombre;
    }
};
var supermancito = {
    nombre: "Klark kent",
    edad: 500,
    poderes: ["Puede correr muy rapido", "Rayos x"],
    getNombre: function () {
        return this.nombre;
    }
};
// al renombrar flash debes de cumprir con todas las propiedades anteriores o de lo contrario marcaria un error
//El orden de las propiedades no importa, lo que si importa es el nombre con su tipo de dato definido en el objeto
var Mutantes = /** @class */ (function () {
    function Mutantes(nombre, nombreReal) {
        this.nombre = nombre;
        this.nombreReal = nombreReal;
    }
    return Mutantes;
}());
var Xmen = /** @class */ (function (_super) {
    __extends(Xmen, _super);
    function Xmen() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Xmen;
}(Mutantes));
var wolverine = new Xmen("Wolverine", "Logan");
//definir clases en typescript
var Avenger = /** @class */ (function () {
    function Avenger(nombre, equipo, nombreReal) {
        this.nombre = "Sin nombre"; // puede ser accesado en cualquier lado del programa
        this.equipo = undefined; // puede ser cambiada en su clase o subclases hijas
        this.nombreReal = undefined; //Solo se pueden cambiar las propiedades dentro de la misma clase
        this.puedePelear = false;
        this.peleasGanadas = 0;
        this.nombre = nombre;
        this.equipo = equipo;
        this.nombreReal = nombreReal;
        console.log("Se ejecuto el constructor");
    }
    Avenger.prototype.bio = function () {
        var mensaje = this.nombre + " " + this.nombreReal + " " + this.equipo;
        console.log(mensaje);
    };
    Avenger.prototype.cambiaEquipoPublico = function (nuevoEquipo) {
        return this.cambiarEquipo(nuevoEquipo);
    };
    Avenger.prototype.cambiarEquipo = function (nuevoEquipo) {
        if (nuevoEquipo === this.equipo) {
            return false;
        }
        else {
            return true;
        }
    };
    return Avenger;
}());
var antman = new Avenger("Antman", "cap", "Scott Lang");
antman.bio();
console.log(antman.cambiaEquipoPublico("cap"));
console.log(antman);
var Apocalipsis = /** @class */ (function () {
    function Apocalipsis(nombre) {
        this.nombre = nombre;
    }
    Apocalipsis.llamarApocalipsis = function () {
        if (!Apocalipsis.instancia) {
            Apocalipsis.instancia = new Apocalipsis("Soy Apocalipsis.. El unico");
        }
        return Apocalipsis.instancia;
    };
    return Apocalipsis;
}());
//let apocalipsisFalso = new Apocalipsis("Soy Apocalipsis !! falso");
var real = Apocalipsis.llamarApocalipsis();
console.log(real);
var Avenger = /** @class */ (function () {
    function Avenger(nombre) {
        this._nombre = nombre;
    }
    Object.defineProperty(Avenger.prototype, "nombre", {
        get: function () {
            if (this._nombre) {
                return this._nombre;
            }
            else {
                return "No tiene un nombre el avenger";
            }
        },
        set: function (nombre) {
            this._nombre = nombre;
        },
        enumerable: true,
        configurable: true
    });
    return Avenger;
}());
var ciclope = new Avenger();
console.log(ciclope.nombre);
ciclope.nombre = "Ciclope";
console.log(ciclope.nombre);
var Avenger = /** @class */ (function () {
    function Avenger(nombre, nombreReal) {
        this.nombre = nombre;
        this.nombreReal = nombreReal;
        console.log("Constructor avenger llamado");
    }
    Avenger.prototype.getNombre = function () {
        console.log("get nombre avenger (protegido)");
        return this.nombre;
    };
    return Avenger;
}());
var Xmen = /** @class */ (function (_super) {
    __extends(Xmen, _super);
    function Xmen(a, b) {
        var _this = this;
        console.log("Constructor Xmen ejecutado");
        _this = _super.call(this, a, b) || this;
        return _this;
    }
    Xmen.prototype.getNombre = function () {
        console.log("get nombre xmen (publico)");
        return _super.prototype.getNombre.call(this);
    };
    return Xmen;
}(Avenger));
var ciclope = new Xmen("Ciclope", "Scott");
console.log(ciclope.getNombre());
var Xmen = /** @class */ (function () {
    function Xmen() {
    }
    Xmen.crearXmen = function () {
        console.log("Se creo usando un metodo estatico");
        return new Xmen();
    };
    Xmen.nombre = "Wolverine";
    return Xmen;
}());
var wolverine2 = Xmen.crearXmen();
console.log(wolverine2);
var Validaciones;
(function (Validaciones) {
    function validarTexto(texto) {
        if (texto.length > 3) {
            return true;
        }
        return false;
    }
    Validaciones.validarTexto = validarTexto;
})(Validaciones || (Validaciones = {}));
var Validaciones;
(function (Validaciones) {
    function validarFecha(fecha) {
        if (isNaN(fecha.valueOf())) {
            return false;
        }
        return true;
    }
    Validaciones.validarFecha = validarFecha;
})(Validaciones || (Validaciones = {}));
/// <reference path="validaciones/textos.ts" />
/// <reference path="validaciones/fechas.ts" />
console.log(Validaciones.validarTexto("Barry Allen"));
define("10-modulos/validaciones/numeros", ["require", "exports"], function (require, exports) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var PI = 3.1416;
    function restar(num1, num2) {
        return num1 - num2;
    }
    exports.default = restar;
});
define("10-modulos/validaciones/textos", ["require", "exports"], function (require, exports) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    exports.MENSAJES = [
        "El texto es muy corto",
        "El texto es muy largo"
    ];
    function obtenerError(numError) {
        return exports.MENSAJES[numError];
    }
    exports.obtenerError = obtenerError;
});
define("10-modulos/app", ["require", "exports", "10-modulos/validaciones/numeros", "10-modulos/validaciones/textos"], function (require, exports, numeros_1, textos) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    console.log(textos.obtenerError(1));
    console.log(numeros_1.default(3, 2));
});
//Aqui presentamos las dos maneras de definir tos tipos de arrays; usando genericos y la otra con la definicion de typescript
var heroes = ["Flash", "Batman", "Superman"];
heroes.push("123");
var villanos = ["Lex luthor", "FlashReverse"];
villanos.push("123");
var Cuadrado = /** @class */ (function () {
    function Cuadrado() {
    }
    Cuadrado.prototype.area = function () {
        return +this.base * +this.altura; //Casteo a number, asi se define en typescript
    };
    return Cuadrado;
}());
var cuadrado = new Cuadrado(); //Antes del metodo de construtor, tu puedes hacer una definicion de los tipos que utilizara la clase en esta instancia
cuadrado.base = 10;
cuadrado.altura = 10;
console.log(cuadrado.area());
//Forma basica de declarar genericos en typescript, muy similar a java nos ayuda a indicar un tipo en la funcion o en la clase
function regresar(arg) {
    return arg;
}
console.log(regresar(15.456789).toFixed(2));
console.log(regresar("Ricardo tapia").toUpperCase());
console.log(regresar(new Date()).getFullYear());
function funcionGenerica(arg) {
    return arg;
}
var deadpool = {
    nombre: "Deadpool",
    nombreReal: "Wade Winston Wilson",
    poder: "Regeneracion"
};
//Se puede definir y declarar el tipo de dato con el que se quiere envolver a la funcion generica de la siguiente manera
console.log(funcionGenerica(deadpool).nombreReal);
console.log(funcionGenerica(deadpool).poder);
//Decorador de clase normal
function consola(constructor) {
    console.log(constructor);
}
//Decorador factory
function imprimirConsola(imprimir) {
    if (imprimir) {
        return consola;
    }
    else {
        return null;
    }
}
var Villano = /** @class */ (function () {
    function Villano(nombre) {
        this.nombre = nombre;
    }
    Villano = __decorate([
        imprimirConsola(true)
    ], Villano);
    return Villano;
}());
function planVillano(constructor) {
    constructor.prototype.imprimirPlan = function () {
        console.log("El plan de " + this.nombre + " es dominar el mundo");
    };
}
function imprimible(constructor) {
    constructor.prototype.imprimir = function () {
        console.log(this);
    };
}
var Villano = /** @class */ (function () {
    function Villano(nombre, poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    Villano = __decorate([
        imprimible,
        planVillano
    ], Villano);
    return Villano;
}());
var lex = new Villano("Lex Luthor", "Control mental");
lex.imprimirPlan(); //Aqui se vuelve a revisar el casteo de datos
lex.imprimir();
//Codigo deprecado: al parecer realizar los writable ya no son viables o ejecutables en estos tiempos actuales
function editable(esEditable) {
    return function (target, nombrePropiedad, descriptor) {
        descriptor.writable = esEditable;
    };
}
var Villano = /** @class */ (function () {
    function Villano(nombre) {
        this.nombre = nombre;
    }
    Villano.prototype.plan = function () {
        console.log("Es dominar el mundo");
    };
    __decorate([
        editable(true)
    ], Villano.prototype, "plan", null);
    return Villano;
}());
var lex = new Villano("Lex luthor");
lex.plan = function () {
    console.log("Su plan es cortar flores");
};
lex.plan();
//Codigo deprecado: al parecer realizar los writable ya no son viables o ejecutables en estos tiempos actuales
function editableProp(esEditable) {
    return function (target, nombrePropiedad) {
        var descriptor = {
            writable: esEditable
        };
        return descriptor;
    };
}
var Villano = /** @class */ (function () {
    function Villano(nombre) {
        this.nombre = nombre;
    }
    Villano.prototype.plan = function () {
        console.log("Es dominar el mundo");
    };
    __decorate([
        editableProp(true)
    ], Villano.prototype, "nombre", void 0);
    return Villano;
}());
var lex = new Villano("Lex luthor");
console.log(lex);
function parametro(target, metodo, index) {
    console.log(target, metodo, index);
}
var Villano = /** @class */ (function () {
    function Villano(nombre) {
        this.nombre = nombre;
    }
    Villano.prototype.imprimir = function (plan, mensaje) {
        if (plan) {
            console.log("El plan es: " + mensaje);
        }
        else {
            console.log(mensaje);
        }
    };
    __decorate([
        __param(1, parametro)
    ], Villano.prototype, "imprimir", null);
    return Villano;
}());
