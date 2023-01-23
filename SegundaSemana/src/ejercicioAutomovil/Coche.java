package ejercicioAutomovil;

public abstract class Coche extends Automoviles implements Para4x4 {

	// Atributos

	private String color;
	private int numPuertas;

	private boolean p4x4;

	// Constructor

	public Coche(int numMarchas, int velocidadMax, String color, int numPuertas) {
		super(numMarchas, velocidadMax);
		this.color = color;
		this.numPuertas = numPuertas;

	}

	// Getters y Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + "[color=" + color + ", numPuertas=" + numPuertas + "]";
	}
}
