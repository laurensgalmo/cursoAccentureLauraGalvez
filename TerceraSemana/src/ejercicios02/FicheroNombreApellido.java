package ejercicios02;

/**
 * Programa que pide por teclado los siguientes datos: nombre, apellidos
 * NOTA: Grabar un fichero con la estructura Nombre = xxx Apellido = xxx
 * 
 * @author laura.galvez.moya
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroNombreApellido {

	public static void main(String[] args) throws IOException {

		FileWriter fichero = new FileWriter("C:\\ficheroLaura.txt");
		String nombre;
		String apellido;

		// Pedir por teclado

		try (Scanner scan = new Scanner(System.in);) {

			System.out.println("Introduzca nombre: ");
			nombre = scan.nextLine();

			System.out.println("Introduzca apellido: ");
			apellido = scan.nextLine();

		}

		PrintWriter ww = new PrintWriter(fichero);
		ww.println("NOMBRE=" + nombre);
		ww.println("APELLIDO=" + apellido);
		ww.close();
	}
}
