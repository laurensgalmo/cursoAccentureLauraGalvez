package ejercicioAutomovil;

public class Camion extends Automoviles {

	// Atributos

	private int pesoMax;
	private float precio;

	// Constructor

	public Camion(int numMarchas, int velocidadMax, int pesoMax, float precio) {
		super(numMarchas, velocidadMax);
		this.pesoMax = pesoMax;
		this.precio = precio;

	}

	// Getters y Setters

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	// toString

	@Override
	public String toString() {
		return "Camion [pesoMax=" + pesoMax + ", precio=" + precio + "]" + super.toString();
	}

}
