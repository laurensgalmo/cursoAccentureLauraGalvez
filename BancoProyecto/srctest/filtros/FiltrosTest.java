package filtros;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * He modificado la clase Filtro a FiltroCastellano, ya que así podemos
 * organizar mejor el proyecto. Además, para esto mismo, se ha creado una
 * Interface Filtro, para que se pueda usar en cualquier país.
 * 
 * @author laura.galvez.moya
 *
 */

class FiltrosTest {

	final String TITULAR1 = "Este titular es de 21";
	final String TITULAR2 = "Laura";
	final String TITULAR3 = "Este titular va a ser de 40 caracteres o un poco más...";
	final LocalDate LOCAL_DATE = LocalDate.of(2023, 01, 28);
	final LocalDate LOCAL_DATE2 = LocalDate.of(2023, 01, 26);
	final LocalDate LOCAL_DATE3 = LocalDate.of(2021, 01, 25);
	final String FECHA1 = "26-01-2023";
	final String FECHA2 = "26/01/2023";
	final String FECHAERR = "26.01.2023";

	FiltroCastellano filtro = new FiltroCastellano();

	@Test
	void testlongitudMax() {
		assertTrue(filtro.longitudMax(TITULAR1, 40));

	}

	@Test
	void testlongitudMin() {
		assertFalse(filtro.longitudMin(TITULAR2, 10));
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(filtro.cumpleLongitud(TITULAR1, 40, 10));

	}

	@Test
	void testCumpleLongitud40() {
		assertFalse(filtro.cumpleLongitud(TITULAR3, 40, 10));
	}

	@Test
	void fechaMaxima() {
		assertFalse(filtro.fechaMaxima(LOCAL_DATE, LOCAL_DATE2));
	}

	@Test
	void fechaMinima() {
		assertTrue(filtro.fechaMinima(LOCAL_DATE, LOCAL_DATE2));
	}

	@Test
	void fechaAnio() {
		assertTrue(filtro.fechaAños(LOCAL_DATE3, 2023, 2020));
	}
	
	@Test
	
	void fechasCorrectas() throws Exception {
		assertEquals(filtro.fechasCorrectasFormato(FECHA1), LocalDate.of(2023, 01, 26));
		assertEquals(filtro.fechasCorrectasFormato(FECHA2, "dd/MM/yyyy"), LocalDate.of(2023, 01, 26));
		assertNotEquals(filtro.fechasCorrectasFormato(FECHAERR), LocalDate.of(2023, 01, 26));
		assertEquals(filtro.fechasCorrectasFormato(FECHAERR),null);
	}
}
