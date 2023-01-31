package ejercicios04;

/**
 * Presenta numero
 * 
 * @author laura.galvez.moya
 *
 */

public class PresentaNumero implements Runnable {

	Buffer buf;

	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	@Override
	public void run() {
		while (true) {

			buf.setDisponible(false);
		}
	}
}
