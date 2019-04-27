import javax.swing.*;

public class Comprueba_mail {
    public static void main(String[] args){
        boolean arroba = false;
        String mail = JOptionPane.showInputDialog("Introduce tu email");

        for (int i = 0; i == mail.length()-1; i++){
            if(mail.charAt(i) == '@'){
                arroba= true;
            }
            if(arroba) {
                System.out.println("El correo es correcto");
            } else {
                System.out.println("El correco es erroneo");
            }
        }
    }
}
