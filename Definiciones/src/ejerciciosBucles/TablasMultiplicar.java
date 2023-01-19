package ejerciciosBucles;

public class TablasMultiplicar {

	public static void main(String[] args) {

		// Presentar en consola las tablas de multiplicar del 1 al 10.

		for (int tabla = 1; tabla <= 10; tabla++) { // Primero, hacemos un for para crear las tablas del 1-10.

			System.out.print("TABLA DEL " + tabla);
			System.out.print("\n------------\n");

			for (int i = 1; i <= 10; i++) { // Segundo, hacemos un for anidado para que se multiplique del 1 al 10.

				System.out.println(tabla + " x " + i + " = " + tabla * i); // Tercero, mostrar por consola.
			}
		}
	}
}
