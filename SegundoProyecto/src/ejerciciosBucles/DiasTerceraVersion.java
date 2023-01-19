package ejerciciosBucles;

public class DiasTerceraVersion {

	public static void main(String[] args) {

		/*
		 * Hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir el
		 * código para comprobar que la fecha es correcta.
		 * En la tercera, utilizar arrays.
		 */

		int dia = 32;
		int mes = 4;
		int año = 2015;

		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean bol = false;

		if (dia <= arr[mes - 1]) {
			System.out.println("FECHA " + dia + mes + año + " CORRECTA");

		} else {
			System.out.println("FECHA " + dia + "/" + mes + "/" + año + "/ " + "INCORRECTA");

		}
		if (mes >= 1 && mes <= 12) {

			System.out.println("MES " + mes + " CORRECTO");

		} else {
			System.out.println("MES " + mes + " INCORRECTO");
		}
		if (año != 0) {

			System.out.println("AÑO " + año + " CORRECTO");

		} else {
			System.out.println("AÑO " + año + " INCORRECTO");

		}
	}
}
