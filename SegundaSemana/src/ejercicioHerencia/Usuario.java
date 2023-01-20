package ejercicioHerencia;

/**
 * Proyecto donde veremos varios ejemplos de cómo funcionan las herencias.
 * 
 * @author laura.galvez.moya
 *
 */

public class Usuario extends Persona {

	// Atributos

	int codigoUsuario;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param nombre    El parámetro nombre contendrá un valor.
	 * @param direccion El parámetro dirección contendrá un valor.
	 * @param correo    El parámetro correo contendrá un valor.
	 * 
	 */
	
	// Constructores

	public Usuario() {
	}

	public Usuario(String nombre, String direccion, String correo) {
		super(nombre, direccion, correo);
	}

	// Getters y Setters

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	// Definición de métodos

	public void autorizar() {

		System.out.println("AUTORIZAR USUARIO");
	}
	
	/**
	 * El siguiente método se encarga de crear un usuario.
	 */
	@Override

	public void crear() {

		System.out.println("CREAR USUARIO");

	}
	
	/**
	 * El siguiente método se encarga de mostrar por consola el mensaje.
	 */

	@Override

	public String aString() {

		return "Código de usuario" + getCodigoUsuario();
	}
}
