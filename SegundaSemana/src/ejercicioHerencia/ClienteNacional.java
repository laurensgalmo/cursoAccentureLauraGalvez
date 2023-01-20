package ejercicioHerencia;

/**
 * Proyecto donde veremos varios ejemplos de cómo funcionan las herencias.
 * 
 * @author laura.galvez.moya
 *
 */

public class ClienteNacional extends Cliente {

	// Atributo

	private String nif;
	
	/**
	 * 
	 * Constructor.
	 * 
	 * @param nombre El parámetro nombre contendrá un valor.
	 * @param direccion El parámetro dirección contendrá un valor.
	 * @param numeroCliente El parámetro numeroCliente contendrá un valor.
	 * @param nif El parámetro nif contendrá un valor. 
	 * 
	 */

	// Constructores

	public ClienteNacional() {
	}

	public ClienteNacional(String nif, String nombre, String direccion, int numeroCliente,
			int fechaAlta) {
		super();
		this.nif = nif;
	}

	// Getters y Setters

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
}
