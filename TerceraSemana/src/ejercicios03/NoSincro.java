package ejercicios03;

public class NoSincro implements Runnable {

	static Integer n = 1; // Al usar sincronized, necesitamos que sean CLASES
	private String mensaje;

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			// PARA SINCRONIZAR:
			synchronized (n) {
				System.out.println(mensaje + " " + n);
				n++;
			}

			// SIN SINCRONIZAR:
			// System.out.println(mensaje + " " + n);
			// n++;
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
