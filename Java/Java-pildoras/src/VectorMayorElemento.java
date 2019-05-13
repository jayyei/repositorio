import java.util.Scanner;

public class VectorMayorElemento {
    private Scanner teclado;
    private String[] nombres;
    private float[] sueldos;

    public void cargar(){
        teclado = new Scanner(System.in);
        nombres = new String[5];
        sueldos = new float[5];
        for(int f = 0; f < nombres.length; f++){
            System.out.print("Ingrese el nombre del empleado: ");
            nombres[f] = teclado.next();
            System.out.print("Ingrese el sueldo: ");
            sueldos[f] = teclado.nextFloat();
        }
    }

    public void mayorSueldo(){
        float menor;
        int posicion;
        boolean repetido = false;
        menor = sueldos[0];
        posicion = 0;
        for( int f = 1; f < nombres.length; f ++){
            if (sueldos[f] < menor){
                menor = sueldos[f];
                posicion = f;
            }
            if (sueldos[f] == menor){
                repetido = true;
            }
        }
        System.out.println("El empleado con menor sueldo es " + nombres[posicion]);
        System.out.println("Tiene un sueldo de " + menor);

        if(repetido){
            System.out.println("El menor salario se repite");
        }
    }

    public static void main(String[] args){
        VectorMayorElemento pv = new VectorMayorElemento();
        pv.cargar();
        pv.mayorSueldo();
    }
}
