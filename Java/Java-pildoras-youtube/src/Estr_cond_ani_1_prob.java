import java.util.Scanner;

public class Estr_cond_ani_1_prob {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        short dato1 = entrada.nextShort();
        System.out.println("Introduce el segundo numero");
        short dato2 = entrada.nextShort();
        System.out.println("Introduce el tercer numero");
        short dato3 = entrada.nextShort();

        if(dato1 > dato2){
            if(dato1 > dato3){
                System.out.println("El mayor es " + dato1);
            }else{
                System.out.println("El mayor es " + dato3);
            }
        } else{
            if(dato2 > dato3){
                System.out.println("El mayor es " + dato2);
            }else{
                System.out.println("El mayor es " + dato3);
            }
        }
    }
}
