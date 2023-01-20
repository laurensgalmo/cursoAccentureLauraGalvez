package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */

public class CongeladosAgua extends ProductosCongelados {

	// Atributos

	int info;
	
	/**
	 * 
	 * Constructor de productos congelados; congelados por agua.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * @param temperatura Contendrá un valor.
	 * @param info Contendrá un valor.
	 * 
	 */

	// Constructor

	public CongeladosAgua(String fechaCaducidad, int numeroLote, int temperatura, int info) {
		super(fechaCaducidad, numeroLote, temperatura);

		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.temperatura = temperatura;
		this.info = info;
	}

	// Getters y Setters

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Gramos de sal por litros de agua = " + info + "\n" + "La fecha de caducidad es " + fechaCaducidad
				+ " y el número de lote es " + numeroLote;
	}

}
