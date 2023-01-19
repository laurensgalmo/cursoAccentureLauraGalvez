package ejercicioCasting;

public class PruebaCast {

	/*
	 * Crear una clase llamada "PruebaCast". Definir una variable "int" e irla
	 * copiando a char, float, double, short, byte. ¿Cuales son implícitos y cuales
	 * son explícitos? ¿Se van a perder datos? ¿En qué casos?
	 */

	public static void main(String[] args) {

		// Variable

		int varNum = 65 ;

		// Cambiamos de un tipo a otro y mostramos por consola

		char caracter = (char) varNum;

		System.out.println(caracter);

		float numeroFloat = (float) varNum;

		System.out.println(numeroFloat);

		double numeroD = (double) varNum;

		System.out.println(numeroD);

		short corto = (short) varNum;

		System.out.println(corto);

		byte numeroB = (byte) varNum;

		System.out.println(numeroB);
		
		/* ----- R E S P U E S T A S -----
		 * Implícito; de hijo a padre. 
		 * Explícito: de padre a hijo, aquí se pierde información.
		 * De padre a hijo se pierden datos porque el espacio de memoria es pequeño.
		 * De hijo a padre, al haber espacio de memoria se guarda correctamente y no hay pérdida de datos.
		 */
	}
}
