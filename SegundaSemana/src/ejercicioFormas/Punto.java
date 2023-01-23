package ejercicioFormas;

/**
 * Añadimos nueva clase llamada Punto.
 * 
 * @author laura.galvez.moya
 *
 */

public class Punto {
	// Atributo

	private int x;
	private int y;

	// Constructor

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getters y Setters

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Este método lo utilizaremos para invertir las coordenadas.
	 */

	public void cambioDeCoordenadas() {

		int cambio = this.x;
		this.x = this.y;
		this.y = cambio;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
