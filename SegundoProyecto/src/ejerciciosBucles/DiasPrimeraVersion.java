package ejerciciosBucles;

public class DiasPrimeraVersion {

	public static void main(String[] args) {

		/*
		 * Hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir el
		 * código para comprobar que la fecha es correcta.
		 * En la primera version, asumir meses de 30 dias.
		 */

		int dia = 20;
		int mes = 8;
		int año = 2015;

		if (dia >= 1 && dia <= 30) {

			System.out.println("DIA " + dia + " CORRECTO");

		} else {
			System.out.println("DIA " + dia + " INCORRECTO");
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
