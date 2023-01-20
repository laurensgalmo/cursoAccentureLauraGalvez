package ejercicioHerencia;

/**
 * Proyecto donde veremos varios ejemplos de cómo funcionan las herencias.
 * 
 * @author laura.galvez.moya
 *
 */

public class Cliente extends Persona {

	// Atributos

	private int numeroCliente;
	private int fechaAlta;

	// Constructores

	public Cliente() {
	}

	public Cliente(String nombre, String direccion, String correo) {
		super(nombre, direccion, correo);
	}

	// Getters y Setters

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getFechaAlta() {
		return fechaAlta;
	}

	// Definición de métodos

	public void setFechaAlta(int fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void verFechaAlta() {
		System.out.println("VER FECHA ALTA");
	}

	// Override

	@Override
	public String aString() {

		return "Nombre del cliente" + getNombre();
	}

}
