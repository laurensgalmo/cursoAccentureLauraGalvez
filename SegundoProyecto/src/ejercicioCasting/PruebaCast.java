package ejercicioCasting;

/**
 * Crear una clase llamada "PruebaCast". Definir una variable "int" e irla
 * copiando a char, float, double, short, byte. ¿Cuales son implícitos y cuales
 * son explícitos? ¿Se van a perder datos? ¿En qué casos?
 * 
 * @author laura.galvez.moya
 */

public class PruebaCast {

	public static void main(String[] args) {

		// Variable

		int varNum = 65;

		// Cambiamos de un tipo a otro y mostramos por consola

		char caracter = (char) varNum;
		float numeroFloat = (float) varNum;
		double numeroD = (double) varNum;
		short corto = (short) varNum;
		byte numeroB = (byte) varNum;

		System.out.println(caracter);
		System.out.println(numeroFloat);
		System.out.println(numeroD);
		System.out.println(corto);
		System.out.println(numeroB);

		/*
		 * ----- R E S P U E S T A S ----- Implícito; de hijo a padre. Explícito: de
		 * padre a hijo, aquí se pierde información. De padre a hijo se pierden datos
		 * porque el espacio de memoria es pequeño. De hijo a padre, al haber espacio de
		 * memoria se guarda correctamente y no hay pérdida de datos.
		 */
	}
}
