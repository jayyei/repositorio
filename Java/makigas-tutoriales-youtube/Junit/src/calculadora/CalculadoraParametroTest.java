package calculadora;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class) //Se utiliza para comenzar a usar las pruebas parametrizadas, es decir poder utilizar el constructor de la clase y tomar sus parametros para las pruebas, esto llamara al metodo que tenga la anotacion @parameters y asi conseguira la lista de parametros
public class CalculadoraParametroTest {
	
	@Parameters //a partir del metodo que marque esta anotacion se obtendra una lista de objetos que en cada uno de ellos tendremos la coleccion de parametros para cada prueba parametrizada
	public static Iterable<Object[]> getData(){
		List<Object []> obj = new ArrayList<>();
		obj.add(new Object[] {3,1,4});
		obj.add(new Object[] {2,3,5});
		obj.add(new Object[] {3,3,6});
		/* return Arrays.asList( new Object[][] {
	    	{3,1,4}, {2,3,5}, {3,3,6}
	    }*/
		return obj;
	}
	
	private int a, b, exp;

	public CalculadoraParametroTest(int a, int b, int exp) { //Junit llamara a su propio constructor
		System.out.println("Clase instanciada ");
		this.a =a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	public void testAdd() {
		System.out.println("Metodo generado");
		Calculadora cal = new Calculadora();
		int result = cal.add(a,b);
		assertEquals(exp, result);
	}

}
