package Datos;
// al poner abstract en una clase que implementa una interfaz, se puede omitir las definiciones de los mewtodos de la interfaz
public class ImplementacionMysql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Lista.r desde Mysql");
    }
}
