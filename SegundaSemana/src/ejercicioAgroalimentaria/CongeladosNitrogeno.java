package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */

public class CongeladosNitrogeno extends ProductosCongelados {

	// Atributos

	String metodoCongelacion;
	String tiempoExpo;
	
	/**
	 * 
	 * Constructor de productos congelados; congelados por nitrógeno.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * @param temperatura Contendrá un valor.
	 * @param metodoCongelacion Contendrá un valor.
	 * @param tiempoExpo Contendrá un valor.
	 * 
	 */

	// Constructor

	public CongeladosNitrogeno(String fechaCaducidad, int numeroLote, int temperatura, String metodoCongelacion,
			String tiempoExpo) {
		super(fechaCaducidad, numeroLote, temperatura);

		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.temperatura = temperatura;
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExpo = tiempoExpo;
	}

	// Getters y Setters

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public String getTiempoExpo() {
		return tiempoExpo;
	}

	public void setTiempoExpo(String tiempoExpo) {
		this.tiempoExpo = tiempoExpo;
	}

	@Override
	public String toString() {
		return "Método de congelación = " + metodoCongelacion + ", donde su tiempo de exposición a sido de "
				+ tiempoExpo + "\n" + "La fecha de caducidad es " + fechaCaducidad + " y el número de lote es "
				+ numeroLote;
	}

}
