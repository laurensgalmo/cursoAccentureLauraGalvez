package ejercicioTarjetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	final double DINERO = 12.12;
	final String CONCEPTO = "Esto es un movimiento en la cuenta";
	static Cuenta cuenta;

	@BeforeEach
	void creacionCuenta() {
		cuenta = new Cuenta();
	}

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimientoStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testAddMovimientoMovimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testRetirarDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarStringDouble() throws Exception{
		cuenta.ingresar(DINERO);
		cuenta.retirar(CONCEPTO, DINERO);
		assertEquals(DINERO, cuenta.getSaldo());
		
		
	}

	@Test
	void testRetirarStringDouble() {
		fail("Not yet implemented");
	}


	@Test
	void testVerTodosLosMovimientos() {
		fail("Not yet implemented");
	}

}
