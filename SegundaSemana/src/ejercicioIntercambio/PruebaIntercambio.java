package ejercicioIntercambio;

/**
 * Proyecto donde vamos a intercambiar valores; clase main.
 * 
 * @author laura.galvez.moya
 *
 */

public class PruebaIntercambio {

	public static void main(String[] args) {

		ClaseIntercambio dato = new ClaseIntercambio("20", "30");

		System.out.println("---ANTES DEL INTERCAMBIO---\n" + dato.getNum1() + " " + dato.getNum2());

		dato.intercambio(dato.getNum1(), dato.getNum2());

		System.out.println("---DESPUÉS DEL INTERCAMBIO---\n" + dato.getNum1() + " " + dato.getNum2());

	}
}
