package ejercicios02;

/**
 * Programa que pide por teclado los siguientes datos: nombre, apellidos
 * NOTA: Grabar un fichero con la estructura Nombre = xxx Apellido = xxx
 * 
 * @author laura.galvez.moya
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroNombreApellido {

	public static void main(String[] args) {

		// Pedir por teclado

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca nombre: ");
		String nombre = scan.nextLine();

		System.out.println("Introduzca apellido: ");
		String apellido = scan.nextLine();

		// FileWriter, escribir en fichero

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("c:/ficheroLaura.txt");
			pw = new PrintWriter(fichero);
			pw.println("Mi nombre es:  " + nombre);
			pw.println("Mi apellido es:  " + apellido);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != fichero) {
					fichero.close(); // Es importante cerrar el fichero
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
