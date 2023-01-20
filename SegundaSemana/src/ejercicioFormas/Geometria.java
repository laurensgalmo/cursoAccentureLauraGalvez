package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 */

public abstract class Geometria {

	// Atributos

	private String nombre;

	/**
	 * El constructor contiene un String nombre que heredarán las subclases. radio.
	 * 
	 * @param nombre
	 * 
	 */

	// Constructor

	public Geometria(String nombre) {
		this.nombre = nombre;

	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Métodos abstractos.
	 * 
	 * @return
	 */

	abstract public String dibujar();

	abstract public int area();
}
