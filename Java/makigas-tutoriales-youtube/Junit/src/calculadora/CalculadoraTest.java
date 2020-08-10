package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculadoraTest {

		//fail("Not yet implemented"); //Si haces una llamada al metodo fail la prueba fallara 
	/*
	@Test
	public void testSuma() {
		int resultado = new Calculadora().add(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
		int resultado =  new Calculadora().sub(3, 2);
		int esperado = 1;
		assertEquals((long)esperado, (long)resultado);
	}*/
	
	//@Before y after son metodos a ejecutar antes y despues de una prueba unitaria\
	
	static Calculadora calc;
	
	
	@BeforeClass //Solo se ejecutara una vez, no una vez por cada prueba
	public static void beforeClass() {
		System.out.println("before class()");
		calc = new Calculadora();
	}
	
	@Before //Se ejecuta este codigo antes de cada prueba unitaria
	public void before() {
		System.out.println("before()");
		calc.setAns(0);
	}
	
	@After //Se ejecuta este codigo despues de cada prueba unitaria
	public void after() {
		System.out.println("after()");
	}
	
	@AfterClass //se ejecutara una vez al finalizar todas las pruebas
	public static void afterClass() {
		calc.setAns(0);
		System.out.println("After class()");
	}
	
	@Test
	public void testSum() {
		System.out.println("Prueba 1");
		int resultado = calc.add(3,2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("Prueba 2");
		calc.add(3,2);
		int resultado = calc.getAns();
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDiv() {
		calc.div(5, 2);
	}
	
	@Test(expected = ArithmeticException.class) //Cuando alguna parte de codigo a testear es normal que arroje una excepcion entonces la prueba unitaria podra ser valida si se esperase una excepcion arrojada
	public void testDivZero() { //Solo para hacer que la prueba funcione bien
		calc.div(5, 0);
	}
	
	@Test(timeout = 1000) //Para indicar si una prueba fallo debido a que no finalizo en cierto tiempo
	public void testAlgoritmoErrorOptimo() {
		calc.operacionOptima();
	}
	
	@Test(timeout = 2000) //Para indicar si una prueba fallo debido a que no finalizo en cierto tiempo
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}
	@Test(timeout = 2000) //Para indicar si una prueba fallo debido a que no finalizo en cierto tiempo
	public void testAlgoritmoForOptimo() {
		calc.operacionForOptima();
	}
}
