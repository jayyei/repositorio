import java.util.Scanner;

public class Estr_rep_do_while_1_prob {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, suma = 0;
        do{
            System.out.println("Ingrese el valor en la consola");
            valor = entrada.nextInt();
            if(valor!=9999){
                suma = suma + valor;
            }
        }while(valor !=9999);

        System.out.print("El valor ingresado es: \n" + suma + "\n");
        if(suma>0){
            System.out.print("El valor ingresado es positivo");
        } else if(suma < 0 ){
            System.out.print("El valor ingresado es negativo");
        } else {
            System.out.print("El valor ingresado es cero");
        }

    }
}