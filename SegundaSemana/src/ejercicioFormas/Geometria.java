package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 */

public class Geometria {

	// Atributos

	private String nombre;
	protected int alto;
	protected int ancho;

	Punto puntito; // Creamos objeto, cargamos getter y setter

	/**
	 * El constructor contiene un String nombre que heredarán las subclases. radio.
	 * 
	 * @param nombre
	 * 
	 */

	// Constructor

	public Geometria(String nombre, int alto, int ancho) {
		this.nombre = nombre;
		this.alto = alto;
		this.ancho = ancho;

	}

	// Añadimos un segundo constructor

	public Geometria() {
		// TODO Auto-generated constructor stub
	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	// Añadimos los getters y setters de la clase Punto del segundo ejercicio de
	// Formas

	public Punto getPuntito() {
		return puntito;
	}

	public void setPuntito(Punto puntito) {
		this.puntito = puntito;
	}

	/**
	 * Métodos abstractos.
	 * 
	 * @return
	 */

	public String dibujar() {
		return null;
	}

	public int area() {
		return 0;
	}

	@Override
	public String toString() {
		return "" + puntito;
	}

}
