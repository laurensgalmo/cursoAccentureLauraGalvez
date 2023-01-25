package filtros;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FiltrosTest {

	final String TITULAR1 = "Este titular es de 21";
	final String TITULAR2 = "Laura";
	final String TITULAR3 = "Este titular va a ser de 40 caracteres o un poco más...";
	final LocalDate LOCAL_DATE = LocalDate.of(2023, 01, 28);
	final LocalDate LOCAL_DATE2 = LocalDate.of(2023, 01, 26);
	final LocalDate LOCAL_DATE3 = LocalDate.of(2021, 01, 25);

	@Test
	void testlongitudMax() {
		assertTrue(Filtros.longitudMax(TITULAR1, 40));

	}

	@Test
	void testlongitudMin() {
		assertFalse(Filtros.longitudMin(TITULAR2, 10));
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(Filtros.cumpleLongitud(TITULAR1, 40, 10));

	}

	@Test
	void testCumpleLongitud40() {
		assertFalse(Filtros.cumpleLongitud(TITULAR3, 40, 10));
	}

	@Test
	void fechaMaxima() {
		assertFalse(Filtros.fechaMaxima(LOCAL_DATE, LOCAL_DATE2));
	}

	@Test
	void fechaMinima() {
		assertTrue(Filtros.fechaMinima(LOCAL_DATE, LOCAL_DATE2));
	}

	@Test
	void fechaAnio() {
		assertTrue(Filtros.fechaAños(LOCAL_DATE3, 2023, 2020));
	}

}
