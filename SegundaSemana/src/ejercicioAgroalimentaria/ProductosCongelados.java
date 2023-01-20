package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */

public class ProductosCongelados extends Productos {

	// Atributos

	int temperatura;
	
	/**
	 * 
	 * Constructor de productos congelados.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * @param temperatura Contendrá un valor.
	 * 
	 */

	// Constructor

	public ProductosCongelados(String fechaCaducidad, int numeroLote, int temperatura) {
		super(fechaCaducidad, numeroLote);

		this.temperatura = temperatura;
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	// Getters y Setters

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "La temperatura recomendada de congelación es de " + temperatura + "\n" + "La fecha de caducidad es "
				+ fechaCaducidad + " y el número de lote es " + numeroLote;
	}

}
