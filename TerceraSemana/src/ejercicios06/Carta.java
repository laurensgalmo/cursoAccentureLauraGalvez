package ejercicios06;

public class Carta {

	private int numeroCarta;
	private String palo;

	public Carta() {

	}

	public int getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(int numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String pp) {
		this.palo = pp;
	}

	@Override
	public String toString() {
		return "Carta [numeroCarta = " + numeroCarta + ", palo = " + palo + "]";
	}
}
