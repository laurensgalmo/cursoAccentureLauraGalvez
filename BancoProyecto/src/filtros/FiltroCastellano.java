package filtros;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Conjunto de rutinas para filtrar datos del proyecto Banco.
 * 
 * @author laura.galvez.moya
 *
 */

public class FiltroCastellano implements FiltroInternacional {

	/**
	 * Nombres de titular >15 y <40 Fecha vto >3 a <5 años Concepto texto ingreso y
	 * gasto >10 a <100
	 */

	public boolean longitudMax(String texto, int longitud) {
		return texto.length() <= longitud;
	}

	public boolean longitudMin(String texto, int longitud) {
		return texto.length() >= longitud;

	}

	public boolean cumpleLongitud(String texto, int lmax, int lmin) {
		return longitudMax(texto, lmax) && longitudMin(texto, lmin);
	}

	public boolean fechaMaxima(LocalDate fecha, LocalDate fechaMax) {
		return fecha.isBefore(fechaMax) || fecha.equals(fechaMax);
	}

	public boolean fechaMinima(LocalDate fecha, LocalDate fechaMin) {
		return fecha.isAfter(fechaMin) || fecha.equals(fechaMin);
	}

	public boolean fechaAños(LocalDate fecha, int anioMax, int anioMin) {
		LocalDate dia = LocalDate.now();
		LocalDate maximaF = dia.plusYears(anioMax);
		LocalDate minimaF = dia.plusYears(anioMin);
		return fechaMaxima(fecha, maximaF) || fechaMinima(fecha, minimaF);
	}

	@Override
	public LocalDate fechasCorrectasFormato(String fecha) throws Exception {
		return fechasCorrectasFormato(fecha, "dd-MM-yyyy");
	}

}
