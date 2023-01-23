package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 */

public class Cuadrado extends Geometria {

	// Atributos

	int lado;

	/**
	 * El constructor contiene un String nombre heredado de Geometría y su atributo
	 * lado.
	 * 
	 * @param nombre
	 * @param lado
	 */

	// Constructor

	public Cuadrado(String nombre, int lado, int alto, int ancho) {
		super(nombre, alto, ancho);

		this.lado = lado; // A = cuadrado de la longitud del lado
	}

	// Getters y Setters

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String dibujar() {

		return "Dibujando cuadrado de lado " + lado;
	}

	@Override
	public int area() {
		return lado * lado;
	}

	@Override
	public String toString() {
		return "El área del " + this.getNombre() + " con lado " + lado + " es igual a " + this.area()
				+ ", el ancho es de " + ancho + " y por último, el alto es " + alto + "\n" + this.dibujar();
	}
}
