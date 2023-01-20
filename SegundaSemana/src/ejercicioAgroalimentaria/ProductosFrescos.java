package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */

public class ProductosFrescos extends Productos {

	// Atributos

	String fechaEnvasado;
	String paisOrigen;

	/**
	 * 
	 * Constructor de productos frescos.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * @param fechaEnvasado Contendrá un valor.
	 * @param paisOrigen Contendrá un valor.
	 * 
	 */

	// Constructor

	public ProductosFrescos(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);

		this.fechaEnvasado = fechaEnvasado;
		this.numeroLote = numeroLote;
		this.fechaCaducidad = fechaCaducidad;
		this.paisOrigen = paisOrigen;
	}

	// Getters y Setters

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "La fecha de envasado es " + fechaEnvasado + " y el país de origen es " + paisOrigen + "\n"
				+ "La fecha de caducidad es " + fechaCaducidad + " y el número de lote es " + numeroLote;
	}

}
