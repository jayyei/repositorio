import java.util.Scanner;

public class VectoresOrdenarParalelo {
    private Scanner teclado;
    private String[] paises;
    private int[] habitantes;


    public void cargar (){
        teclado = new Scanner(System.in);
        paises = new String[5];
        habitantes = new int [5];
        System.out.println("Carga de paises y habitantes");
        for (int f = 0; f < paises.length; f++){
            System.out.println("Ingrese el nombre del pais");
            paises[f] = teclado.next();
            System.out.println("Ingrese el numero de habitantes");
            habitantes[f] = teclado.nextInt();
        }
    }

    public void ordenarPorNombre(){
        for (int k = 0; k < paises.length; k++){
            for(int f = 0; f < paises.length -1 - k; f++){
                if(paises[f].compareToIgnoreCase(paises[f+1])>0){
                    String auxpais = paises[f];
                    paises[f] = paises[f+1];
                    paises[f+1] = auxpais;
                    int auxhabitante = habitantes[f];
                    habitantes[f] = habitantes[f+1];
                    habitantes[f+1] = auxhabitante;
                }
            }
        }
    }

    public void ordenarPorHabitante(){
        for (int k = 0; k < paises.length; k++){
            for (int f = 0; f < paises.length - 1 - k; f++){
                if(habitantes[f]<habitantes[f+1]){
                    String auxpais = paises[f];
                    paises[f] = paises[f+1];
                    paises[f+1] = auxpais;
                    int auxhabitante = habitantes[f];
                    habitantes[f] = habitantes[f+1];
                    habitantes[f+1] = auxhabitante;
                }
            }
        }
    }

    public void imprimir(){
        for(int f = 0; f < paises.length; f++){
            System.out.println(paises[f] + " - " + habitantes[f]);
        }
    }

    public static void main (String [] args){
        VectoresOrdenarParalelo pv = new VectoresOrdenarParalelo();
        pv.cargar();
        pv.ordenarPorNombre();
            System.out.println("Ordenados alfabeticamente ");
            pv.imprimir();
        pv.ordenarPorHabitante();
            System.out.println("Ordenados por el numero de habitantes ");
            pv.imprimir();
    }

}
