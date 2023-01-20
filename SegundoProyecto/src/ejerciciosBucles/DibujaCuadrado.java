package ejerciciosBucles;

/**
 * En este programa se trata de dibujar un cuadrado
 * 
 * @author laura.galvez.moya
 *
 */

public class DibujaCuadrado {

	public static void main(String[] args) {

		// Dibuja un cuadrado, como en la imagen que acompaña, con ocho * de lado:

		int valor = 8;

		for (int vert = 1; vert <= valor; vert++) { // Hacemos la vertical.

			for (int hori = 1; hori <= valor; hori++) { // Con for anidado, la horizontal y añadimos el *.

				System.out.print(" * ");
			}

			System.out.println(""); // Salto de linea para que deje pasar a la siguiente
		}
	}
}
