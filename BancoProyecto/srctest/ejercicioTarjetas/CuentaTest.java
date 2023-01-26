package ejercicioTarjetas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import filtros.FiltroCastellano;

class CuentaTest {
	static Cuenta cuenta;

	// CORRECTO
	final double DINERO = 12.12;
	final String NUMERO_CUENTA = "12345678910112131415";
	final String TITULAR = "Laura Galvez Moya";
	final String CONCEPTO = "Esto es un movimiento en la cuenta";
	// INCORRECTO

	@BeforeEach
	void inicio() {
		// FiltroCastellano filtro = new FiltroCastellano();
		cuenta = new Cuenta(NUMERO_CUENTA, TITULAR);
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
	void testRetirarDouble() throws Exception {
		cuenta.ingresar(DINERO);
		cuenta.retirar(DINERO);
		assertEquals(DINERO, cuenta.getSaldo());
	}

	@Test
	void testIngresarStringDouble() {

	}

	@Test
	void testRetirarStringDouble() throws Exception {
		cuenta.ingresar(DINERO);
		cuenta.retirar(CONCEPTO, DINERO);
		assertEquals(DINERO, cuenta.getSaldo());
	}

	@Test
	void testVerTodosLosMovimientos() {
		fail("Not yet implemented");
	}

}
