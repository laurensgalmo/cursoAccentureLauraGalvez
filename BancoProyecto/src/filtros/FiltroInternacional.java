package filtros;

import java.time.LocalDate;

public interface FiltroInternacional {

	public boolean longitudMax(String texto, int longitud);

	public boolean longitudMin(String texto, int longitud);

	public boolean cumpleLongitud(String texto, int lmax, int lmin);

	public boolean fechaMaxima(LocalDate fecha, LocalDate fechaMax);

	public boolean fechaMinima(LocalDate fecha, LocalDate fechaMin);

	public boolean fechaAños(LocalDate fecha, int anioMax, int anioMin);

}
