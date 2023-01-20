package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria
 * 
 * @author laura.galvez.moya
 *
 */

public class CongeladosAire extends ProductosCongelados {

	// Atributos

	int nitrogeno;
	int oxigeno;
	int dioxidoC;
	int vaporAgua;
	
	/**
	 * 
	 * Constructor de productos congelados; congelados por aire.
	 * 
	 * @param fechaCaducidad Contendrá un valor.
	 * @param numeroLote Contendrá un valor.
	 * @param temperatura Contendrá un valor.
	 * @param oxigeno Contendrá un valor.
	 * @param dioxidoC Contendrá un valor.
	 * @param vaporAgua Contendrá un valor.
	 * @param nitrogeno Contendrá un valor.
	 * 
	 */

	// Constructor

	public CongeladosAire(String fechaCaducidad, int numeroLote, int temperatura, int oxigeno, int dioxidoC,
			int vaporAgua, int nitrogeno) {
		super(fechaCaducidad, numeroLote, temperatura);

		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxidoC = dioxidoC;
		this.vaporAgua = vaporAgua;
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.temperatura = temperatura;
	}

	// Getters y Setters

	public int getNitrogeno() {
		return nitrogeno;
	}

	public void setNitrogeno(int nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public int getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(int oxigeno) {
		this.oxigeno = oxigeno;
	}

	public int getDioxidoC() {
		return dioxidoC;
	}

	public void setDioxidoC(int dioxidoC) {
		this.dioxidoC = dioxidoC;
	}

	public int getVaporAgua() {
		return vaporAgua;
	}

	public void setVaporAgua(int vaporAgua) {
		this.vaporAgua = vaporAgua;
	}

	@Override
	public String toString() {
		return "Nivel de Nitrógeno =  " + nitrogeno + ", nivel de oxigeno = " + oxigeno + ", nivel de CO2 = " + dioxidoC
				+ ", nivel de temperatura = " + vaporAgua + "\n" + "La fecha de caducidad es " + fechaCaducidad
				+ " y el número de lote es " + numeroLote;
	}
}
