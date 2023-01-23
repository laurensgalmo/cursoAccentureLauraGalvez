package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 */

public class Triangulo extends Geometria {

	// Atributos

	int base;
	int altura;

	/**
	 * El constructor contiene un String nombre heredado de Geometría y sus
	 * atributos base, altura.
	 * 
	 * @param nombre
	 * @param base
	 * @param altura
	 */

	// Constructor

	public Triangulo(String nombre, int base, int altura, int alto, int ancho) {
		super(nombre, alto, ancho);

		this.base = base;
		this.altura = altura; // A = base por la altura dividido por dos
	}

	// Getters y Setters

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void dibujar(int base, int altura) {

		System.out.println("...dibujando triángulo con base " + base + " y altura " + altura);
	}

	public int calcularArea(int base, int altura) {

		int area = base * altura / 2;
		System.out.println("El area del triangulo es de " + area);
		return area;

	}

	@Override
	public String dibujar() {
		return "Dibujando triángulo de base " + base + " y altura " + altura;
	}

	@Override
	public int area() {
		return base * altura / 2;
	}

	@Override
	public String toString() {
		return "El área del " + this.getNombre() + " con base " + base + " y altura " + altura
				+ " entre dos, es igual a " + this.area() + ", el ancho es de " + ancho + " y por último, el alto es "
				+ alto + "\n" + this.dibujar();

	}
}
