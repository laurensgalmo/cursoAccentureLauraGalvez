package ejercicioHerencia;

/**
 * Proyecto donde veremos varios ejemplos de cómo funcionan las herencias.
 * 
 * @author laura.galvez.moya
 *
 */

public abstract class Persona implements Interface {

	// Atributos

	private String nombre;
	private String direccion;
	private String correo;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param nombre El parámetro nombre contendrá un valor.
	 * @param direccion El parámetro dirección contendrá un valor.
	 * @param correo El parámetro correo contendrá un valor.
	 * 
	 */

	// Constructores

	public Persona() {
	}

	public Persona(String nombre, String direccion, String correo) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * El siguiente método se encarga de crear.
	 */
	// Definición de métodos

	public void crear() {
		System.out.println("CREAR USUARIO");

	}

	/**
	 * El siguiente método se encarga de borrar.
	 */

	public void borrar() {

	}

	/**
	 * El siguiente método se encarga de enviar mensaje.
	 */

	public void enviarMensaje() {

	}

	// Definición método abstract

	abstract String aString();

}
