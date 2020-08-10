package beans;

import java.io.Serializable;
// implementa la interfaz serialiable
public class personaBean implements Serializable {

    //2 cada propiedad es de tipo private
    private String nombre;
    private int edad;

    //3 siempre tiene un constructor sin argumentos
    public personaBean() {
    }


//4 constructor del javabean (no requerido)

    public personaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //4 por cada propiedad se realiza un get y set o los que sean necesarios
}