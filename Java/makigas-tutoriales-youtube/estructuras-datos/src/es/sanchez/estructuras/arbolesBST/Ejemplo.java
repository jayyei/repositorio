package es.sanchez.estructuras.arbolesBST;

import java.util.Arrays;

public class Ejemplo {

	public static void main(String[] args) {
		Empleado e1 = new Empleado(20, "Pepito Perez", "Ventas", "A-252");
		Empleado e2 = new Empleado(44, "Ana lopez", "Recursos Humanos", "B-198");
		Empleado e3 = new Empleado(18, "Elena nito", "Ventas", "A-241");
		Empleado e4 = new Empleado(33, "Jose Gomez", "Contabilidad", "B-96");
		Empleado e5 = new Empleado(64, "Francisco Perez", "Marketing", "A-69");
		Empleado e6 = new Empleado(55, "Javier Lopez", "Informatica", "B-161");
		Empleado e7 = new Empleado(14, "Julian Quinones", "Informatica", "B-161");
		Empleado e8 = new Empleado(15, "Julio regalado", "Marketing", "B-161");
		Empleado e9 = new Empleado(19, "El vecino incomodo", "Ventas", "B-161");
		
		BST bst = new BST();
		/*System.out.println("Esta vacio " + bst.esVacio() + " - Es Hoja "
				+ bst.esHoja());
		bst.insertar(e1);
		System.out.println(bst.obtener(20));
		System.out.println("Esta vacio " + bst.esVacio() + " - Es Hoja "
				+ bst.esHoja());
		bst.insertar(e2);
		System.out.println("Esta vacio " + bst.esVacio() + " - Es Hoja "
				+ bst.esHoja());*/
		
		Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9).forEach(bst::insertar);
		bst.eliminar(20);
		bst.inorden();
	}

}
