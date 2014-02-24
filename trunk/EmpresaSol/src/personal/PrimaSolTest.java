package personal;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimaSolTest {

	@Test
	public void calculalaPrimatestc1() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",3,"S");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 400, prima);
	}

	@Test
	public void calculalaPrimatestc2() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",30,"S");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 600, prima);
	}
	
	@Test
	public void calculalaPrimatestc3() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",2,"N");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 100, prima);
	}

	@Test
	public void calculalaPrimatestc4() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",200,"N");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 150, prima);
	}
	
	@Test
	public void calculalaPrimatestc5() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",3000,"S");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 0, prima);
		
	}

	@Test
	public void calculalaPrimatestc6() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",-5,"S");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 0, prima);
		
	}

	@Test
	public void calculalaPrimatestc7() {
		int prima;
		
		EmpleatSol empleado = new EmpleatSol("Aurora","00256",3,"M");
		prima = PrimaSol.calculalaPrima(empleado);
		assertEquals("Error en calcularPrima!", 0, prima);
		
	}

}
