package ProgramacionFuncional.metodosReferenciados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Numeros {

	public static boolean esMayorQueCincuenta(int n1, int n2) {
		return (n1 + n2) > 50;
	}
	
	public static List<Integer> encontrarNumeros(List<Integer> l, 
			BiPredicate<Integer, Integer>p){
		//Creamos un objeto ArrayList
		List<Integer> nuevaLista = new ArrayList<>();
		 for(Integer i: l) {
			 //realizar el testeo en base a la implementacfion de test del objeto BiPredicate pasado 
			 //argumento
			 if(p.test(i, i+10)) {
				 nuevaLista.add(i);
			 }
		 }
		 return nuevaLista;
	}
	
	List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);
	
	//Mediante una clase anonima
	List<Integer> numerosEncontrados1 = encontrarNumeros(list, new BiPredicate<Integer, Integer>() {

		@Override
		public boolean test(Integer integer1, Integer integer2) {
			return Numeros.esMayorQueCincuenta(integer1, integer2);
		}
		
	} );
	
	//mediante una expresion lambda
	List<Integer> numerosEncontrados2 = encontrarNumeros(list, (i1, i2)-> Numeros.esMayorQueCincuenta(i1, i2));
	
	//Mediante un metodo referenciado aun metodo estatico
	
	List<Integer> numerosEncontrados3 = encontrarNumeros(list, Numeros::esMayorQueCincuenta);
	
	public static void main(String[] args) {
		Numeros n = new Numeros();
		System.out.println("Mediante classes anonimas");
		for (Integer integer : n.numerosEncontrados1) {
			System.out.print(integer + " ");
		}
		System.out.println("Mediante expresion lambda");
		for (Integer integer : n.numerosEncontrados2) {
			System.out.print(integer + " ");
		}
		System.out.println("Mediante metodos referenciados");
		for (Integer integer : n.numerosEncontrados3) {
			System.out.print(integer + " ");
		}
		
		
	}
}
