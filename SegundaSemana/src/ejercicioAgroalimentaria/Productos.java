package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */

public abstract class Productos {

	// Atributos

	protected String fechaCaducidad;
	int numeroLote;
	
	/**
	 * 
	 * Constructor de productos; superclase.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * 
	 */

	// Constructor

	public Productos(String fechaCaducidad, int numeroLote) {

		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	// Getters y Setters

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
}
