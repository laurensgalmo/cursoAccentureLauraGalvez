package ejercicioFormas;

/**
 * Creación de clases cuadrado, circulo, triangulo.
 * 
 * @author laura.galvez.moya
 *
 */

public class MainFormas {

	public static void main(String[] args) {

		/*
		 * Circulo circulo = new Circulo("círculo", 5, 7, 7); 
		 * Triangulo triangulo = new Triangulo("triangulo", 5, 10, 7, 7);
		 * Cuadrado cuadrado = new Cuadrado("cuadrado", 5, 7, 7);
		 * 
		 * System.out.println(circulo); System.out.println();
		 * System.out.println(triangulo); System.out.println();
		 * System.out.println(cuadrado);
		 */

		Punto punto = new Punto(6, 2);
		Geometria geo = new Geometria();
		geo.setPuntito(punto);
		geo.getPuntito().cambioDeCoordenadas();
		System.out.println("[Invertimos el punto] " + geo.toString());

	}

}
