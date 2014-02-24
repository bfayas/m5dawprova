package fact;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaFactorialTest {

	@Test
	public void calacfactest1() {
		CalculaFactorial f = new CalculaFactorial();
		assertEquals("Error en calcfac!", 5040, f.calcfac(7));
	}

	@Test
	public void calacfactest2() {
		CalculaFactorial f = new CalculaFactorial();
		assertEquals("Error en calcfac!", 0, f.calcfac(-7));
		
	}

}
