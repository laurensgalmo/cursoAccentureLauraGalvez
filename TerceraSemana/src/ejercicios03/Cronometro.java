package ejercicios03;

/**
 * Este código crea un bucle que imprime la hora (en formato horas, minutos y
 * segundos) y luego duerme el hilo por 1 segundo antes de continuar con la
 * siguiente iteración del bucle.
 * 
 * @author laura.galvez.moya
 *
 */

public class Cronometro {

	public static void main(String[] args) throws InterruptedException {

		for (int h = 0; h < 24; h++) {
			for (int min = 0; min < 60; min++) {
				for (int s = 0; s < 60; s++) {
					System.out.println(String.format("%02d:%02d:%02d", h, min, s));
					Thread.sleep(1000);
				}
			}
		}
	}
}
