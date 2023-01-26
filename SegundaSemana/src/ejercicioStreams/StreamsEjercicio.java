package ejercicioStreams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Ejercicio Streams, conseguir los números pares.
 * 
 * @author laura.galvez.moya
 *
 */

public class StreamsEjercicio {

	public static void main(String[] args) {

		// Creamos un Array de tipo int, donde encontramos números del 1 al 9

		int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Estructura Stream para obtener los números pares del Array numeros

		int[] numerosPares = Arrays.stream(numeros).filter(n -> n % 2 == 0).toArray();

		// Mostramos por consola el resultado

		Arrays.stream(numerosPares).forEach(System.out::println);

		// Otro ejercicio de prueba

		long contador = Arrays.stream(numeros).filter(n -> n % 2 == 0).count();

		System.out.println("_____________________");
		System.out.println();
		System.out.println("C O N T A D O R :  " + contador);
		System.out.println("_____________________");

		Random rand = new Random();

		Stream.generate(() -> rand.nextInt(100)).limit(20).forEach(System.out::println);
	}
}
