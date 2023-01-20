package ejerciciosBucles;

/**
 * Calcular cuantos números primos hay entre 1 y 100, y cuales son.
 * 
 * @author laura.galvez.moya
 *
 */

public class NumerosPrimos {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (noEsPrimo(i)) {
				System.out.println(i + " es primo");
			}
		}
	}

	/**
	 * Método para calcular números primos
	 */

	public static boolean noEsPrimo(int numero) {

		// Para que el bucle siga su curso, primero hacemos un if; evitaremos la
		// entrada de los primeros números NO PRIMOS

		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}

		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}
}