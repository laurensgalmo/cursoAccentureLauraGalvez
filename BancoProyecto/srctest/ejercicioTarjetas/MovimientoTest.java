package ejercicioTarjetas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	final Double IMPORTE = 9.0;
	final String CONCEPTO = "Esto es un nuevo movimiento de prueba";
	final LocalDate FECHA = LocalDate.of(2021, 02, 12);
	static Movimiento mov;

	@BeforeEach
	void creacion() {
		mov = new Movimiento();
	}

	@Test
	void testGetMiConcepto() {
		mov.setMiConcepto(CONCEPTO);
		assertEquals(CONCEPTO, mov.getMiConcepto());
	}

	@Test
	void testGetMiFecha() {
		mov.setMiFecha(FECHA);
		assertEquals(FECHA, mov.getMiFecha());
	}

	@Test
	void testGetMiImporte() {
		mov.setMiImporte(IMPORTE);
		assertEquals(IMPORTE, mov.getMiImporte());
	}

}
