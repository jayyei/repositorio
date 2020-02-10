package ProgramacionFuncional.predicados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PruebaPredicados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> listaPersonas = new ArrayList<>();
		Persona p1 = new Persona("pepe", "perez", 20);
		Persona p2 = new Persona("angel", "sanchez", 20);
		Persona p3 = new Persona("pepe", "blanco", 20);

		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		listaPersonas.stream().forEach(p-> System.out.println(p.getNombre()));
		System.out.println();
		//Creamos un predicado que se encargue de definir una condicion que permite filtrar
		//la lista
		Predicate<Persona> predicadoNombre = p->p.getNombre().equals("pepe"); //con la expresion lambda reduces y evitas las implementaciones de las interfaces funcionales que pide cada stream o predicado, es decir, en vez de generar la clase anonima e implementar el metodo de la interfaz funcional 
		
		Predicate<Persona> predicadoNombre2 = new Predicate<Persona>() {

			@Override
			public boolean test(Persona persona) {
				// TODO Auto-generated method stub
				return persona.equals("pepe");
			}
		};
		
		listaPersonas.stream()
					  .filter(predicadoNombre)
					  .forEach(new Consumer<Persona>() {

						@Override
						public void accept(Persona persona) {
							// TODO Auto-generated method stub
							System.out.println(persona.getApellidos());
						}});
		
		Predicate<Persona> predicado1 = p -> p.getEdad() > 18;
		Predicate<Persona> predicado2 = p ->p.getEdad() < 35;
		Predicate<Persona> predicado3 = predicado1.and(predicado2);
		
		Predicate<Persona> predicado4 = p->p.getEdad() > 65;
		Predicate<Persona> predicado5 = predicado4.or(predicado3);
		
		//metodo default negate

		Predicate<Persona> predicado6 = p->p.getEdad() > 65;
		Predicate<Persona> predicado7 = predicado4.or(predicado6).negate();
		System.out.println("\nUltimos filtros");
		listaPersonas.stream()
				.filter(predicado7)
				.forEach(p->System.out.println(p.getNombre()));

		}
}
