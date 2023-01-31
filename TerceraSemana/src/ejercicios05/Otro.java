package ejercicios05;

import java.util.Scanner;
import java.util.Random;

public class Otro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(100) + 1;
		int intentosJugador = 0;
		int intentosMaquina = 0;
		int numeroJugador = 0;
		int numeroMaquina = 0;
		boolean turnoJugador = true;
		System.out.println("Comienza el juego de adivinar el número.");
		System.out.println(
				"Tanto tú como la máquina se intercalarán en la tarea de adivinar el número generado aleatoriamente (1-100).");
		while (numeroJugador != numeroAleatorio && numeroMaquina != numeroAleatorio) {
			if (turnoJugador) {
				System.out.print("Tu turno: adivina el número (1-100): ");
				numeroJugador = entrada.nextInt();
				intentosJugador++;
				if (numeroJugador < numeroAleatorio) {
					System.out.println("El número es más alto.");
				} else if (numeroJugador > numeroAleatorio) {
					System.out.println("El número es más bajo.");
				} else {
					System.out.println("¡Correcto! Lo adivinaste en " + intentosJugador + " intentos.");
					break;
				}
				turnoJugador = false;
			} else {
				System.out.println("Turno de la máquina.");
				numeroMaquina = aleatorio.nextInt(100) + 1;
				intentosMaquina++;
				System.out.println("La máquina ha adivinado " + numeroMaquina + ".");
				if (numeroMaquina == numeroAleatorio) {
					System.out.println("La máquina ha adivinado correctamente en " + intentosMaquina + " intentos.");
					break;
				}
				turnoJugador = true;
			}
		}

	}

}
