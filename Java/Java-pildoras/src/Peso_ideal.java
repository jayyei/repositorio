import javax.swing.*;

public class Peso_ideal {
    public static void main(String [] args){
        String genero ="";

        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        }while((genero.equalsIgnoreCase("H")  || genero.equalsIgnoreCase("M") ) == false );

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura por favor"));

        int peso;
        if(genero.equalsIgnoreCase("H")){
            peso = altura -110;
        } else {
            peso = altura -120;
        }
        System.out.println("Tu peso ideal deberia de ser: " + peso + " Kgs");
    }
}
