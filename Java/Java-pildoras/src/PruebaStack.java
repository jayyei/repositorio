import java.util.Stack;

public class PruebaStack {
    public static void main(String[] args){
        Stack<String> pila = new Stack<String>();
        System.out.println("Insertamos tres elementos en la pila: Juan, ana y luis ");
        pila.push("Juan");
        pila.push("Ana");
        pila.push("Luis");
        System.out.println("Cantidad de elementos en la pila " + pila.size());
        System.out.println(("Extraemos un elemento de la pila " + pila.pop()));
        System.out.println("Cantidad de elementos en la pila " + pila.size());
        System.out.println("Consultamos un elemento de la pila sin extraerlo " + pila.peek());
        System.out.println("Cantidad de elementos en la pila " + pila.size());

        System.out.println("Extraemos uno a uno cada elemento de la pila sin extraerlo");
        while(!pila.isEmpty()){
            System.out.println(pila.pop() + "- \n" );
        }

        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(70);
        pila2.push(120);
        pila2.push(6);
        System.out.println("Imprimimos la lista de enteros ");
        for(Integer elemento: pila2){
            System.out.println(elemento + "-\n");
        }

        System.out.println("Borramos toda la lista ");
        pila2.clear();
        System.out.println("Cantidad de elementos en la pila de enteros:" + pila2.size());

    }
}
