package ejercicios05;

/**
 * Incompleto
 * 
 * @author laura.galvez.moya
 */

import java.util.Random;
import java.util.Scanner;

public class ContraLaMaquina {

	public static void main(String[] args) {

		Random rand = new Random(); // Genero número aleatorio

		int number = rand.nextInt(1000) + 1; // Creo una variable que contiene hasta 100 números posibles

		Scanner input = new Scanner(System.in); // Para usarla con el scanner

		int menor = 1; // Numero mínimo
		int mayor = 100; // Numero máximo
		int numAdivinar; // Numero a adivinar

		System.out.println("[ PIENSA UN NÚMERO ENTRE 1 Y 100 Y PRESIONA ENTER ]"); // Título

		input.nextLine(); // Enter

		/**
		 * Bucle Do...While, con sus respectivas condiciones
		 */

		do {
			numAdivinar = (menor + mayor) / 2;
			System.out.println("¿El número es el " + numAdivinar + "? " + "('mayor', 'menor' o 'fin')");
			String respuesta = input.nextLine();

			if (respuesta.equals("mayor")) {
				menor = numAdivinar + 1;

			} else if (respuesta.equals("menor")) {
				mayor = numAdivinar - 1;

			} else if (respuesta.equals("fin")) {
				System.out.println("¡FIN DE LA PARTIDA! LA MÁQUINA HA ADIVINADO EL NÚMERO");

			}
		} while (!input.nextLine().equals("fin"));
	}
}
