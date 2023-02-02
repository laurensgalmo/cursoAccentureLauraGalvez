package ejercicios06;

import java.util.HashSet;
import java.util.Set;

public class Juego {

	static final int NUM_CARTAS = 5;
	static String TIPO_BARAJA = Baraja.POKER;
	static Baraja bar;
	static Set<Carta> baraja;
	static Set<Jugador> jugadores;

	public static void main(String[] args) {

		// Baraja

		bar = new Baraja(TIPO_BARAJA);
		baraja = bar.getBaraja();
		baraja.forEach(System.out::println);

		// Jugadores

		Jugador jugador1 = new Jugador();
		jugador1.setNombre("David");
		jugador1.setEdad(26);

		Jugador jugador2 = new Jugador();
		jugador1.setNombre("Marc");
		jugador1.setEdad(44);

		Jugador jugador3 = new Jugador();
		jugador1.setNombre("Maria");
		jugador1.setEdad(31);

		Jugador jugador4 = new Jugador();
		jugador1.setNombre("Pau");
		jugador1.setEdad(60);

		// Añadir jugadores a una lista

		jugadores = new HashSet<>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		jugadores.add(jugador4);

		// Recorremos la lista de jugadores

		for (Jugador ju : jugadores) {

		}
	}

	// Repartir 5 cartas de la baraja (manos) a 4 jugadores

	public static void repartirCartas() {

	}
}
