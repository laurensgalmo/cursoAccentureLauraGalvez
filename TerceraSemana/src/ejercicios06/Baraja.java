package ejercicios06;

import java.util.HashSet;
import java.util.Set;

public class Baraja {

	static final String POKER = "POKER";
	static final String[] PALOS = { "picas", "diamantes", "treboles", "corazones" };
	private Set<Carta> baraja = new HashSet<>();

	public Baraja(String tipo) {
		String[] palo = PALOS;
		for (String pp : palo) {
			for (int i = 1; i < 14; i++) {
				Carta cc = new Carta();
				cc.setNumeroCarta(i);
				cc.setPalo(pp);
				baraja.add(cc);
			}
		}
	}

	public Set<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(Set<Carta> baraja) {
		this.baraja = baraja;
	}

	public static String getPoker() {
		return POKER;
	}

	public static String[] getPalos() {
		return PALOS;
	}

}
