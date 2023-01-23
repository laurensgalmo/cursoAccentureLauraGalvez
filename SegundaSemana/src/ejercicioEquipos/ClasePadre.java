package ejercicioEquipos;

/**
 * Esta es la Clase Padre de; entrenador, futbolista y masajista.
 * 
 * @author laura.galvez.moya
 *
 */

public abstract class ClasePadre {

	// Atributos en común

	private int id;
	private String nombre;
	private String apellidos;
	private int edad;

	// Constructor

	public ClasePadre(int id, int edad, String nombre, String apellidos) {

		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	// Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Métodos Abstractos

	public abstract void concentrarse();

	public abstract void viajar();

	// toString

	@Override
	public String toString() {
		return "[id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}
