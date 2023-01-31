package ejercicios05;

import java.util.Random;
import java.util.Scanner;

public class AdivinaContraMaquina {

	static Scanner entrada = new Scanner(System.in);
	static boolean gameOver;
	static boolean turnoJugador = true;
	static Random aleatorio;
	static Random randomMaquina;
	static int numeroAleatorio; // Numero a adivinar
	static int numMaquina; // Numero primero que le sale a la maquina

	public static void main(String[] args) {

		System.out.println("---- C O M I E N Z A  E L  J U E G O ----");
		aleatorio = new Random();
		numeroAleatorio = aleatorio.nextInt(100) + 1;
		randomMaquina = new Random();
		numMaquina = randomMaquina.nextInt(100) + 1;

		while (!gameOver) {
			if (turnoJugador) {
				contraMaquina();
			} else {
				adivinaNumero();
			}
		}
	}

	public static void adivinaNumero() {
		System.out.println("[ A D I V I N A  E L  N Ú M E R O ]"); // Título

		int respuesta = entrada.nextInt();

		if (respuesta != numeroAleatorio && !gameOver) {
			if (numeroAleatorio < respuesta) {
				System.out.println("menor");
			} else if (numeroAleatorio > respuesta) {
				System.out.println("mayor");
			}
		} else {
			System.out.println("¡FIN DE LA PARTIDA! HE GANADO");
			gameOver = true;
			System.exit(0);
		}
		entrada.nextLine();
		turnoJugador = true;

	}

	public static void contraMaquina() {
		System.out.println("[ PIENSA UN NÚMERO ENTRE 1 Y 100 ]"); // Título

		System.out.println("¿El número es el " + numMaquina + "? " + "('mayor', 'menor' o 'fin')");
		String respuesta = entrada.nextLine();

		Random aleatorio = new Random();
		int numOperacion = aleatorio.nextInt(10) + 1;

		if (!respuesta.equals("fin") && !gameOver) {
			if (respuesta.equals("mayor")) {
				numMaquina = numMaquina + numOperacion;

			} else if (respuesta.equals("menor")) {
				numMaquina = numMaquina - numOperacion;
			}

		} else {
			System.out.println("¡FIN DE LA PARTIDA! LA MÁQUINA HA ADIVINADO EL NÚMERO");
			gameOver = true;
			System.exit(0);
		}
		System.out.println("Presiona enter...");
		entrada.nextLine();
		turnoJugador = false;
	}

}
