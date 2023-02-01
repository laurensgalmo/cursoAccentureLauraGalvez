package ejercicios06;

import java.util.Iterator;
import java.util.Set;

public class Juego {

	static int NUM_CARTAS = 5;
	static String TIPO_BARAJA = Baraja.POKER;
	static Baraja bar;
	static Set<Carta> baraja;
	static Set<Jugador> jugadores;

	public static void main(String[] args) {

		// Baraja
		bar = new Baraja(TIPO_BARAJA);
		baraja = bar.getBaraja();
		baraja.forEach(System.out::println);

		// Jugadores, generar métodos
		// jugadores = recibirJugadores();
		// repartirBarajaJugadores(bajara, jugadores);
		visualizaTodo(jugadores);

	}

	public static void visualizaTodo(Set<Jugador> jugadores) {
		for (Iterator<Jugador> player = jugadores.iterator(); player.hasNext();) {
			visualizaAJugadores(player.next());
		}
	}

	public static void visualizaAJugadores(Jugador jugador) {
		System.out.println("Jugador " + jugador.getNombre());
		jugador.getMano().forEach(System.out::println);
	}
}
