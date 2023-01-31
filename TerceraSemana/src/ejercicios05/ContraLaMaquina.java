package ejercicios05;

/**
 * Incompleto
 * 
 * @author laura.galvez.moya
 */

import java.util.Random;
import java.util.Scanner;

public class ContraLaMaquina {

	static boolean gameOver;

	public static void main(String[] args) {

		System.out.println("[ C O M I E N Z A  E L  J U E G O ]");
		System.out.println();

		boolean turnoJugador = true;

		while (!gameOver) {
			if (turnoJugador) {
				adivinaNumero();
			} else {
				contraMaquina();
			}
		}
	}

	public static void contraMaquina() {

		System.out.println("[ PIENSA UN NÚMERO ENTRE 1 Y 100 Y PRESIONA ENTER ]"); // Título

		Scanner input = new Scanner(System.in); // Para usarla con el scanner

		int menor = 1; // Numero mínimo
		int mayor = 100; // Numero máximo
		int numAdivinar; // Numero a adivinar

		input.nextLine(); // Enter

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
				gameOver = true;

			}
		} while (!input.nextLine().equals("fin"));

	}

	public static void adivinaNumero() {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int numAdivinar;
		int numero = random.nextInt(100) + 1;

		System.out.println("[ A D I V I N A  E L  N Ú M E R O ]"); // Título del juego

		do {
			numAdivinar = scan.nextInt();

			if (numAdivinar < numero) {
				System.out.println("menor");
			} else if (numAdivinar > numero) {
				System.out.println("mayor");
			}
		} while (numAdivinar != numero);
		gameOver = true;
		System.out.println("¡CORRECTO!");

	}
}
