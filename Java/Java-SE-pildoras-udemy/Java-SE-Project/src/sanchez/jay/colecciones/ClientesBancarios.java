package sanchez.jay.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClientesBancarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Antonio Lopez", "0001", 20000);
		Cliente cliente2 = new Cliente("Rafael gomez", "0002", 15000);
		Cliente cliente3 = new Cliente("Ana Martin", "0003", 20000);
		Cliente cliente4 = new Cliente("Juan diaz", "0004", 20);
		Cliente cliente5 = new Cliente("Antonio Lopez", "0001", 20000);
		
		//Una coleccion  no se puede instanciar, se instancian las clases que las implementan
		Set<Cliente> clientesDelBanco = new HashSet<Cliente>(); 
		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		clientesDelBanco.add(cliente5);
		
		//Error de concurrencia ConcurrentModificationException: No se permite aquello que estas leyendo al mismo tiempo eliminarlo de la coleccion
		/*for(Cliente cliente : clientesDelBanco) { // Eliminar elementos mediante un bucle forEach no es tan sencillo
			if(cliente.getNombre().equals("Ana Martin")) {
				clientesDelBanco.remove(cliente);
			}
		}*/
		
		
		Iterator<Cliente> it = clientesDelBanco.iterator(); //Todas las colecciones heredan de Iterable, todos aquellos que implementen la interfaz iterable pueden con el metodo iterator() devolver un iterador de tipo T que se debe de alamacenar en un tipo Iterator
		while(it.hasNext()) {
			String nombreCliente = it.next().getNombre();
			if(nombreCliente.equals("Ana Martin")) {
				it.remove();
			}
		}
		
		for (Cliente cliente : clientesDelBanco) {
			System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() 
			+ " " + cliente.getSaldo());
		}
		
		/*Iterator<Cliente> it = clientesDelBanco.iterator();
		while(it.hasNext()) {
			Cliente cliente = it.next();
			System.out.println(cliente.getNombre());
		}*/
		
		
	}

}
