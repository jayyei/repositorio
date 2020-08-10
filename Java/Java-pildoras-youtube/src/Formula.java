import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Formula extends JFrame implements ActionListener {
    private JTextField tf1;
    private JButton boton1;

    public Formula(){
        setLayout(null);
        tf1 = new JTextField("{2*(4-5)-{3*4}-[4-5]}");
        tf1.setBounds(10, 10, 230, 30);
        add(tf1);
        boton1 = new JButton("Verificar formula. ");
        boton1.setBounds(10,70,180,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            if (balanceada()) {
                setTitle("Está correctamente balanceada.");
            } else {
                setTitle("No está correctamente balanceada.");
            }
        }
    }

    public boolean balanceada(){
        Stack<Character> pila1 = new Stack<Character>();
        String cadena = tf1.getText();
        for(int f = 0; f < cadena.length(); f++){
            if(cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{'){
                pila1.push(cadena.charAt(f));
            } else if (cadena.charAt(f) == ')' || cadena.charAt(f) == ']' || cadena.charAt(f) == '}'){
                if(pila1.isEmpty()){
                    return false;
                } else if (cadena.charAt(f) == ')' && pila1.pop() != '('){
                    return false;
                } else if (cadena.charAt(f) == ']' && pila1.pop() != '['){
                    return false;
                } else if (cadena.charAt(f) == '}' && pila1.pop() != '{'){
                    return false;
                }
            }
        }
        if (pila1.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] ar) {
        Formula formula1 = new Formula();
        formula1.setBounds(0, 0, 400, 160);
        formula1.setVisible(true);
        formula1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




}
