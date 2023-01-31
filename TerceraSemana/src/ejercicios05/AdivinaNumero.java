package ejercicios05;

/**
 * Juego de adivinar un número aleatrorio
 * 
 * @author laura.galvez.moya
 */

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {

		Random random = new Random(); // Genero número aleatorio

		int numero = random.nextInt(100) + 1; // Creo una variable que contiene hasta 100 números posibles

		Scanner scan = new Scanner(System.in);
		int numAdivinar; // Para usarla con el scanner

		System.out.println("[ A D I V I N A  E L  N Ú M E R O ]"); // Título del juego

		/**
		 * Mientras el numero a adivinar sea distinto al número introducido, que haga la
		 * secuencia del Do, donde encontraremos las condiciones a seguir
		 */

		do {
			numAdivinar = scan.nextInt();

			if (numAdivinar < numero) {
				System.out.println("menor");
			} else if (numAdivinar > numero) {
				System.out.println("mayor");
			}
		} while (numAdivinar != numero);

		System.out.println("¡CORRECTO!");

	}
}
