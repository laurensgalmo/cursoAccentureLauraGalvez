package ejercicios01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Este programa hace una lectura de un fichero
 * 
 * @author laura.galvez.moya
 *
 */

public class LecturaFichero {

	public static void main(String[] args) throws IOException {

		// Ruta de tu fichero txt

		File fichero = new File("C:\\Users\\laura.galvez.moya\\Desktop\\fichero.txt.txt");

		try (Scanner scan = new Scanner(fichero)) {
			scan.useDelimiter("\n"); // Cada vez que encuentre un salto de línea, entra en bucle

			while (scan.hasNext()) {
				String cadena = scan.next();
				System.out.println(cadena + " ");
			}
		} catch (Exception e) {
			e.printStackTrace(); // Muestra el error
		}

	}

}
