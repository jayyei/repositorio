import java.util.Scanner;

public class Estr_cond_ani_2_prob {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero bastardo");
        Short dato = entrada.nextShort();
        if(dato != null){
            if (dato > 0){
                System.out.println("Es positivo");
            }else{
                System.out.println("Es negativo");
            }
        }else {
            System.out.println("Es nullo");
        }
    }
}
