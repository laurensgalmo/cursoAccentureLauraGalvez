package ejerciciosJava03;

public class Datos2 {

	/*
	 * Modificar el programa, guardándolo con el nombre Datos2, y haciendo que las
	 * variables puedan ser vistas por cualquier método de la clase.
	 */

	// UN METODO STATIC ACCEDE A ATRIBUTOS STATIC
	// UN METODO NO STATIC PUEDE ACCEDER A TODOS

	static int dia = 10;
	static String nDni = "57433222";
	static float precio;
	static final boolean ACTIVO = true;

	public static void main(String[] args) {

		precio = 135.12F;

		System.out.println("Dia: " + dia);
		System.out.println("DNI: " + nDni);
		System.out.println("Precio: " + precio);
		System.out.println("Activo?: " + ACTIVO);

	}

}
