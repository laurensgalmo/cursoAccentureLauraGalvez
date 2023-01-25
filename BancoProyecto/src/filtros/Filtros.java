package filtros;

import java.time.LocalDate;

/**
 * Conjunto de rutinas para filtrar datos del proyecto Banco.
 * 
 * @author laura.galvez.moya
 *
 */

public class Filtros {

	/**
	 * Nombres de titular >15 y <40 Fecha vto >3 a <5 años Concepto texto ingreso y
	 * gasto >10 a <100
	 */

	public static boolean longitudMax(String texto, int longitud) {
		return texto.length() <= longitud;
	}

	public static boolean longitudMin(String texto, int longitud) {
		return texto.length() >= longitud;

	}

	public static boolean cumpleLongitud(String texto, int lmax, int lmin) {
		return longitudMax(texto, lmax) && longitudMin(texto, lmin);
	}

	public static boolean fechaMaxima(LocalDate fecha, LocalDate fechaMax) {
		return fecha.isBefore(fechaMax) || fecha.equals(fechaMax);
	}

	public static boolean fechaMinima(LocalDate fecha, LocalDate fechaMin) {
		return fecha.isAfter(fechaMin) || fecha.equals(fechaMin);
	}

	public static boolean fechaAños(LocalDate fecha, int anioMax, int anioMin) {
		LocalDate dia = LocalDate.now();
		LocalDate maximaF = dia.plusYears(anioMax);
		LocalDate minimaF = dia.plusYears(anioMin);
		return fechaMaxima(fecha, maximaF) || fechaMinima(fecha, minimaF);
	}

}
