package ejerciciosJava03;

/**
 * Escribe la clase DatosArray, y en la misma, define las siguientes variables:
 * 
 * @author laura.galvez.moya
 */

public class DatosArray {

	public static void main(String[] args) {

		// Un array que contenga los días del mes

		int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Un array de dos dimensiones

		int[][] arrBidi = new int[5][7];

		// Rellenarlos con números secuenciales de 1 a 31

		arrBidi[0][0] = 1;
		arrBidi[0][1] = 2;
		arrBidi[0][2] = 3;
		arrBidi[0][3] = 4;
		arrBidi[0][4] = 5;
		arrBidi[0][5] = 6;
		arrBidi[0][6] = 7;
		arrBidi[1][0] = 8;
		arrBidi[1][1] = 9;
		arrBidi[1][2] = 10;

	}
}
