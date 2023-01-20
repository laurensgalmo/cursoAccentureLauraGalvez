package ejerciciosBucles;

/**
 * En este proyecto se trata de obtener el factorial de un número
 * 
 * @author laura.galvez.moya
 *
 */

public class Factorial {

	public static void main(String[] args) {

		// Calcular el factorial del numero 8

		double factorial = 1;
		double numero = 8;

		while (numero != 0) {
			factorial = factorial * numero;
			numero--;
		}

		System.out.println("El factorial es " + factorial);
	}
}
