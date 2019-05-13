import java.util.Scanner;

public class MatrizParalela {
    private Scanner teclado;
    private String[] empleados;
    private int[][] sueldos;
    private int[] total;


    public void cargar(){
        teclado = new Scanner(System.in);
        empleados = new String[4];
        sueldos = new int[4][3];
        for (int f = 0; f < empleados.length; f++){
            System.out.print("Ingrese el nombre del empleado: ");
            empleados[f] = teclado.next();
            for( int c = 0; c < sueldos[f].length; c++){
                System.out.print("Ingrese sueldo: ");
                sueldos[f][c] = teclado.nextInt();
            }
        }
    }

    public void sumarSueldos(){
        total = new int[4];
        for(int f =0; f< sueldos.length; f++){
            int suma = 0;
            for (int c = 0; c < sueldos[f].length; c++){
                suma = suma + sueldos[f][c];
            }
            total[f] = suma;
        }
    }

    public void imprimirTotal(){
        System.out.println("Total de sueldos pagados por empleado. ");
        for(int f =0; f < total.length; f++){
            System.out.println(empleados[f] + " - " + total[f]);
        }
    }

    public void empleadoMayorSueldo(){
        int mayor  = total[0];
        String nombre  = empleados[0];
        for(int f = 0; f < total.length; f++){
            if(total[f] > mayor){
                mayor = total[f];
                nombre = empleados[f];
            }
        }
        System.out.println("El empleado con mayor sueldo es "+ nombre + " que tiene un sueldo de "+ mayor);
    }

    public static void main(String[] args){
        MatrizParalela ma = new MatrizParalela();
        ma.cargar();
        ma.sumarSueldos();
        ma.imprimirTotal();
        ma.empleadoMayorSueldo();
    }

}
