package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 *
 */

public class MainFormas {

	public static void main(String[] args) {

		Circulo circulo = new Circulo("círculo", 5);
		Triangulo triangulo = new Triangulo("triangulo", 5, 10);
		Cuadrado cuadrado = new Cuadrado("cuadrado", 5);

		System.out.println(circulo);
		System.out.println(triangulo);
		System.out.println(cuadrado);

	}

}
