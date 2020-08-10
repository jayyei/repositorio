package Datos;
// Se pueden hacer implements de muchas interfaces
public class ImplementacionOracle implements AccesoDatos {
    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Lista.r desde Oracle");
    }
}
