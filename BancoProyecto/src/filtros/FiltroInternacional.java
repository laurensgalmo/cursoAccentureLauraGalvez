package filtros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public interface FiltroInternacional {

	public boolean longitudMax(String texto, int longitud);

	public boolean longitudMin(String texto, int longitud);

	public boolean cumpleLongitud(String texto, int lmax, int lmin);

	public boolean fechaMaxima(LocalDate fecha, LocalDate fechaMax);

	public boolean fechaMinima(LocalDate fecha, LocalDate fechaMin);

	public boolean fechaAños(LocalDate fecha, int anioMax, int anioMin);

	/**
	 * Ejercicio fecha correcta con formato opcional
	 * 
	 * @param fecha, formato
	 * @return
	 * @throws Exception
	 */

	// Utilizar la sobrecarga de métodos

	LocalDate fechasCorrectasFormato(String fecha) throws Exception;

	public default LocalDate fechasCorrectasFormato(String fecha, String formato) throws Exception {
		DateTimeFormatter dd = DateTimeFormatter.ofPattern(formato);

		try {
			return LocalDate.parse(fecha, dd);
		} catch (DateTimeParseException e) {
		}

		return null;
	}
}
