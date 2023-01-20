package ejercicioHerencia;

/**
 * Proyecto donde veremos varios ejemplos de cómo funcionan las herencias.
 * 
 * @author laura.galvez.moya
 *
 */

public class ClienteExportacion extends Cliente {

	// Atributo

	private String vat;
	
	/**
	 * 
	 * Constructor.
	 * 
	 * @param nombre El parámetro nombre contendrá un valor.
	 * @param correo El parámetro correo contendrá un valor.
	 * @param vat El parámetro vat contendrá un valor.
	 * 
	 */

	// Constructores

	public ClienteExportacion() {

	}

	public ClienteExportacion(String vat, String correo, String nombre) {
		super();
		this.setVat(vat);
		this.setCorreo(correo);
		this.setNombre(nombre);
	}
	// Getters y Setters

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}
}
