package ejerciciosJava03;

/**
 * Escribe la clase Datos, en la misma, define las siguientes variables: dia,
 * con un valor inicial de 10 nDni, para números de DNI, con un valor inicial de
 * 57.433.222 precio para valores numéricos con dos decimales una constante con
 * nombre «ACTIVO», y con valor true carga la variable precio con el valor
 * 135.12 Preséntalo todo en consola; parte 1.
 * 
 * @author laura.galvez.moya
 */

public class Datos {

	public static void main(String[] args) {

		// TODOS ESTOS CAMPOS SOLO SON VISIBLES PARA MAIN

		int dia = 10;
		String nDni = "57433222";
		float precio;
		final boolean ACTIVO = true;

		precio = 135.12F;

		System.out.println("Dia: " + dia);
		System.out.println("DNI: " + nDni);
		System.out.println("Precio: " + precio);
		System.out.println("Activo?: " + ACTIVO);
	}
}
