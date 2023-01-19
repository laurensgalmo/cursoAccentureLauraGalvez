package ejerciciosBucles;

public class DiasCuartaVersion {

	public static void main(String[] args) {

		/*
		 * Hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir el
		 * código para comprobar que la fecha es correcta.
		 * En la tercera, utilizar arrays.
		 */

		int dia = 28;
		int mes = 2;
		int año = 2016;

		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (dia <= arr[mes - 1]) {
			System.out.println("DIA CORRECTO");
		} else {
			System.out.println("DIA INCORRECTO");
		}
		if (mes >= 1 && mes <= 12) {
			System.out.println("MES CORRECTO");
		} else {
			System.out.println("MES INCORRECTO");
		}
		if (año != 0) {
			System.out.println("AÑO CORRECTO");
			System.out.println("FECHA " + dia + "/" + mes + "/" + año + " CORRECTA");
		} else {
			System.out.println("AÑO INCORRECTO");
			System.out.println("FECHA " + dia + "/" + mes + "/" + año + " INCORRECTA");
		}
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			System.out.println("ES AÑO BISIESTO");

		} else {
			System.out.println("NO ES AÑO BISIESTO");
		}
	}
}
