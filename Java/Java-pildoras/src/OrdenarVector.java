import java.util.Scanner;

public class OrdenarVector {
    private Scanner teclado;
    private int[] sueldos;
    private String[] paises;

    public void cargar() {
        teclado = new Scanner (System.in);
        sueldos = new int[5];
        paises = new String[5];
        for (int f = 0; f < sueldos.length; f++){
            System.out.print("Ingrese el sueldo: ");
            sueldos[f] = teclado.nextInt();
            System.out.print("Ingrese el pais: ");
            paises[f] = teclado.next();
        }
    }

    public void ordenar(){
        for (int k = 0; k < sueldos.length; k ++){
            for ( int f = 0; f < sueldos.length - 1; f ++){
                if( sueldos[f] > sueldos[f+1]){
                    int aux = sueldos[f];
                    sueldos[f]=sueldos[f+1];
                    sueldos[f+1] = aux;
                }

                if( paises[f].compareTo(paises[f+1])>0){
                    String auxiliar = paises[f];
                    paises[f] = paises[f+1];
                    paises[f+1] = auxiliar;
                }
            }
        }
    }

    public void imprimir(){
        System.out.println("Sueldos ordenados de menor a mayor");
        for( int f = 0; f < sueldos.length; f++){
            //System.out.println(sueldos[f]);
            System.out.println(paises[f]);
        }
    }

    public static void main (String[] args) {
        OrdenarVector pv = new OrdenarVector();
        pv.cargar();
        pv.ordenar();
        pv.imprimir();
    }
}
