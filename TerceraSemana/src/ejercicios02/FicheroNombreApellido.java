package ejercicios02;

/**
 * Programa que pide por teclado los siguientes datos: nombre, apellidos
 * Grabar un fichero con la estructura Nombre = xxx Apellido = xxx
 * 
 * @author laura.galvez.moya
 */

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroNombreApellido {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca nombre: ");
		String nombre = scan.nextLine();

		System.out.println("Introduzca apellido: ");
		String apellido = scan.nextLine();

		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("c:/ficheroLaura.txt");
			pw = new PrintWriter(fichero);

			// for (int i = 0; i < 10; i++)
			pw.println("Mi nombre es:  " + nombre);
			pw.println("Mi apellido es:  " + apellido);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
