package ejercicioAutomovil;

public class ModelosCoche extends Coche {

	// Atirbutos

	private String modelo;

	// Constructor

	public ModelosCoche(int numMarchas, int velocidadMax, int numChasis, String color, int numPuertas, String modelo) {
		super(numMarchas, velocidadMax, color, numPuertas);
		this.modelo = modelo;
	}

	// Getters y Setters

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void activarReductora(boolean activar) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "ModelosCoche [modelo=" + modelo + "]" + super.toString();
	}
	
	

}
