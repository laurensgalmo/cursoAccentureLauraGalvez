package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 */

public class Circulo extends Geometria {

	// Atributos

	private int radio;

	/**
	 * El constructor contiene un String nombre heredado de Geometría y su atributo
	 * radio.
	 * 
	 * @param nombre
	 * @param radio
	 */

	// Constructor

	public Circulo(String nombre, int radio, int ancho, int alto) {
		super(nombre, ancho, alto);
		this.radio = radio; // A = π r²
	}

	// Getters y Setters

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * Métodos heredados de Geometría; dibujaremos las figuras y calcularemos su
	 * área.
	 */
	@Override
	public String dibujar() {

		return "Dibujando círculo de radio " + radio;
	}

	@Override
	public int area() {

		return (int) (Math.PI * radio * radio);
	}

	@Override
	public String toString() {
		return "El área del " + this.getNombre() + " con radio " + radio + " es igual a " + this.area()
				+ ", el ancho es de " + ancho + " y por último, el alto es " + alto + "\n" + this.dibujar();
	}

}
