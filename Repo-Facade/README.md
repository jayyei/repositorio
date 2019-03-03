# Facade
## Uso

Cuando quieres acoplar metodos y/o atributos de distintas clases, lo puedes hacer mediante una clase intermediaria "Facade" que lo unico que hace es instanciar las subclases y utilizar metodos de los objetos instanciados en algun metodo declarado en la clase Facade

## Descripción
Se tienen dos subclases llamadas flight y Hotel las cuales poseen metodos generales pero implementados de distinta manera, en la clase Facade lo que se hace es instanciar los objetos de las subclases y utilizar los metodos de los objetos instanciados para que al momento de crear un objeto de la clase Facade en la clase principal se puede integrar los metodos necesarios de subclases sin necesidad de instanciar mas que un objeto.

![Esquema](https://refactoring.guru/images/patterns/diagrams/facade/structure.png)

