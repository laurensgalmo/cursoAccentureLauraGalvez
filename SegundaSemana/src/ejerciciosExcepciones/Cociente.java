package ejerciciosExcepciones;

/**
 * Programa para practicar las excepciones Primero; realizamos la operación.
 * Segundo; en vez de procesar el error, lo pase hacia el módulo llamador.
 * Tercero; en lugar de imprimir el mensaje, lo lance como expeción, NO COMO
 * ERROR.
 * 
 * @author laura.galvez.moya
 *
 */

public class Cociente {

	public static void main(String args[]) throws Exception {

		// Variables

		int a = 0;
		int b = 300;

		// Gestion de excepciones con try-catch-finally, aunque no usaremos catch en
		// esta ocasión

		try {
			int cociente = b / a;
			System.out.println(cociente);
		} catch (ArithmeticException co) {
			System.out.println("Se ha producido un error");
			co.printStackTrace(); // método muy útil para diagnosticar expeciones, el cual imprime el error
			throw (new Exception());

		} finally {
			System.out.println("Programa finalizado");
		}

	}

}
