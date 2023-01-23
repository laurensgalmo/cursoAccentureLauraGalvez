package ejercicioAutomovil;

/**
 * Clase que implementa la interface Iabd, además de ser automoviles, es Iabd.
 * 
 * @author laura.galvez.moya
 *
 */

public abstract class Automoviles implements Iabd {

	// Atributos

	private int numMarchas;
	private int velocidadMax;

	// Constructor

	public Automoviles(int numMarchas, int velocidadMax) {
		this.numMarchas = numMarchas;
		this.velocidadMax = velocidadMax;

		//

		AccesoBD dao = new AccesoBD();
		dao.AccesoGrabacion(this);

	}

	// Getters y Setters

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	// Métodos de la interface
	@Override
	public void leer() {

	}

	@Override
	public void grabar() {

	}

	// toString

	@Override
	public String toString() {
		return "[numMarchas=" + numMarchas + ", velocidadMax=" + velocidadMax + "]";
	}

}
