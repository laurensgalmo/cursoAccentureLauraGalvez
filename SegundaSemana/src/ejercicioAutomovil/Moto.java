package ejercicioAutomovil;

public class Moto extends Automoviles {

	// Atributos

	private int deposito;

	// Constructor

	public Moto(int numMarchas, int velocidadMax, int numChasis, int deposito) {
		super(numMarchas, velocidadMax);
		this.deposito = deposito;
	}

	// Getters y Setters
	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	// toString

	@Override
	public String toString() {
		return "Moto [deposito=" + deposito + "]" + super.toString();
	}

}
