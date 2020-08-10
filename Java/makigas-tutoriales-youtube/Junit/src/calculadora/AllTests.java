package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ //Para correr pruebas en un orden especifico
	AssertTest.class, 
	CalculadoraParametroTest.class, 
	CalculadoraTest.class })
public class AllTests {

}
