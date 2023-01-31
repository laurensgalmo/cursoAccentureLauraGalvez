package ejercicios02;

/**
 * A continuación, nueva clase capaz de leer el fichero
 * Presentar por pantalla los datos leídos con formato XXX YYY 
 * 
 * @author laura.galvez.moya
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) throws IOException {

		// Lectura de fichero

		File archivo = new File("C:\\ficheroLaura.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr); // Lectura por línea

		String nombre = "";
		String apellido = "";
		String linea = "";

		while ((linea = br.readLine()) != null) {

			String dato[] = linea.split("=");

			if (dato[0].equals("NOMBRE")) {
				nombre = dato[1];
			}
			if (dato[0].equals("APELLIDO")) {
				apellido = dato[1];
			}
			
		}
		System.out.println(nombre + " " + apellido);
	}
}
