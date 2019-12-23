package sanchez.jay.colecciones;

import java.util.HashSet;

public class ClientesBancarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Antonio Lopez", "0001", 20000);
		Cliente cliente2 = new Cliente("Rafael gomez", "0002", 15000);
		Cliente cliente3 = new Cliente("Ana Martin", "0003", 20000);
		Cliente cliente4 = new Cliente("Juan diaz", "0004", 20);
		
		//Una coleccion  no se puede instanciar, se instancian las clases que las implementan
		HashSet<Cliente> clientesDelBanco = new HashSet<Cliente>(); 
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() 
			+ " " + cliente.getSaldo());
		}
		
	}

}
