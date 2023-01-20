package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */


public class ProductosRefrigerados extends Productos {

	// Atributos

	int codigo;
	
	/**
	 * 
	 * Constructor de productos refrigerados.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * @param codigo Contendrá un valor.
	 * 
	 */

	// Constructor

	public ProductosRefrigerados(String fechaCaducidad, int numeroLote, int codigo) {
		super(fechaCaducidad, numeroLote);

		this.codigo = codigo;
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	// Getters y Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "El código del organismo de supervisión alimentaria es " + codigo + "\n" + "La fecha de caducidad es "
				+ fechaCaducidad + " y el número de lote es " + numeroLote;
	}
}
