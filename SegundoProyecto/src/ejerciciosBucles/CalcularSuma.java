package ejerciciosBucles;

/**
 * Calcular la suma de los primeros 10 números múltiplos de 5.
 * 
 * @author laura.galvez.moya
 *
 */

public class CalcularSuma {

	final static int NUM = 5;

	public static void main(String[] args) {

		// Variables

		int contador = 0; //Inicializamos a 0, hasta que llegue a 10
		int serie = 1;
		int suma = 0;

		// Usaremos bucle while con un if else anidado

		while (contador < 10) {

			if (serie % NUM == 0) {

				++contador;
				System.out.println("Este número es múltiplo de 5: " + serie);
				suma += serie;
				++serie;
				
			}else {
				++serie;
			}
		}

		System.out.println("La suma total es: " + suma);

	}
}
