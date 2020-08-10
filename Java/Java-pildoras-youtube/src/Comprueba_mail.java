import javax.swing.*;

public class Comprueba_mail {
    public static void main(String[] args){
        int arroba = 0;
        int punto = 0;
        String mail = JOptionPane.showInputDialog("Introduce tu email");

        for (int i = 0; i < mail.length()-1; i++) {
            if (mail.charAt(i) == '@') {
                arroba++;
            }else if (mail.charAt(i) == '.'){
                punto++;
            }

        }
            if(arroba == 1  && punto == 1) {
                System.out.println("El correo es correcto");
            } else if (arroba != 1 || punto !=1) {
                System.out.println("El correo es erroneo");
            }

            }
        }




