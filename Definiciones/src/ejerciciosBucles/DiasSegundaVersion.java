package ejerciciosBucles;

public class DiasSegundaVersion {

	public static void main(String[] args) {

		/*
		 * Hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir el
		 * código para comprobar que la fecha es correcta. En la segunda version,
		 * utilizar los días reales de cada mes, sin arrays.
		 */

		int dia = 20;
		int mes = 8;
		int año = 2015;

		boolean bol = false;
		
		//Al no poder usar arrays, haremos uso del condicional "switch".
		
		switch (mes) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia <= 31) {
				bol = true;
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (dia <= 30) {
				bol = true;
			}
			break;

		default:
			if (dia <= 28) {
				bol = true;
			}

		}
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
