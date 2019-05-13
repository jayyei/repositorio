import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String cadena1, cadena2;
        System.out.println("Ingrese la primera cadena: ");
        cadena1 = teclado.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        cadena2 = teclado.nextLine();

        if(cadena1.equals(cadena2)== true ){
            System.out.println(cadena1 + " Es exactamente igual a " + cadena2);
        } else{
            System.out.println(cadena1 + " No es  igual a " + cadena2);
        }

        if(cadena1.equalsIgnoreCase(cadena2) == true ){
            System.out.println(cadena1+" es igual a "+cadena2+" sin tener en cuenta mayúsculas/minúsculas");
        } else {
            System.out.println(cadena1+" no es igual a "+ cadena2 + " sin tener en cuenta mayúsculas/minúsculas");
        }
        if(cadena1.compareTo(cadena2) == 0){
            System.out.println(cadena1 + " Es exactamente igual a " + cadena2);
        } else {
            if (cadena1.compareTo(cadena2) > 0){
                System.out.println(cadena1 + " es alfabeticamente mayor a " + cadena2);
            } else {
                System.out.println(cadena1 + " no es alfabeticamente mayor a " + cadena2);
            }
        }

        char caracter = cadena1.charAt(0);
        System.out.println( " El primer caracter de la primera cadena es: " + caracter);

        int largo = cadena1.length();
        System.out.println("La longitud de la cadena 1 es :" + largo);

        String cadena3 = cadena1.substring(0,3);
        System.out.println("Los primeros tres caracteres de la cadena 1 son: " + cadena3);

        int posicion = cadena1.indexOf(cadena2);
        if(posicion == -1){
            System.out.println(cadena2 + " no esta contenida en  " + cadena1);
        } else {
            System.out.println(cadena2 + " Esta contenida en " + cadena1 + " a partir de la posicion de " + posicion);
        }

        System.out.println(cadena1 + " convertido a mayusculas es: " + cadena1.toUpperCase());
        System.out.println(cadena1 + " convertido a minusculas es: " + cadena1.toLowerCase());
    }
}
