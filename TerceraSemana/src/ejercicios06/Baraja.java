package ejercicios06;

import java.util.HashSet;
import java.util.Set;

public class Baraja {

	Set<Carta> baraja = new HashSet<>();

	public Baraja() {

		String[] palo = { "copas", "bastos", "oros", "espadas" };

		for (String pp : palo) {
			for (int i = 1; i < 13; i++) {
				Carta cc = new Carta();
				cc.setNumeroCarta(i);
				cc.setPalo(pp);
				baraja.add(cc);
			}
		}
	}
}
