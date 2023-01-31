package ejercicios04;

/**
 * Esta clase intercambiará la información.
 * 
 * Una variable numero para guardar el numero. Una variable booleana para
 * indicar si ya está generado (true) / si ya ha sido utilizado (false)
 * 
 * @author laura.galvez.moya
 *
 */

public class Buffer {

	/*private boolean disponible;
	private int numero;

	boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}*/
	
	private boolean disponible;
	private int numero;

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public synchronized int getNumero() {
		while (!this.isDisponible()) {
			System.out.println("Esperando numero-");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setDisponible(false);
		this.notifyAll();
		return numero;
	}

	public synchronized void setNumero(int numero) {
		while (this.isDisponible()) {
			System.out.println("Esperando espacio...");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.numero = numero;
		setDisponible(true);
		this.notify();
	}
}
