package ejerciciosBucles;

public class Multiplos {

	public static void main(String[] args) {

		/*
		 * Cargar dos variables int con los valores 10 y 20, e indicar cual es mayor, si
		 * son iguales, o si uno es múltiplo de otro. Para probar el programa, ir
		 * cargando distintos valores en las variables.
		 */

		int var1 = 10;
		int var2 = 20;
		int resto = var1 % var2;

		if (var1 < var2) {

			System.out.println("El número " + var1 + " es menor al número " + var2);

		} else if (var1 > var2) {

			System.out.println("El número " + var1 + " es mayor al número " + var2);
		}

		if (resto == 0) {

			System.out.println("El número " + var1 + " es múltiplo de número " + var2);

		} else if (var1 > var2) {

			System.out.println("El número " + var1 + " NO es múltiplo de número " + var2);
		}
	}
}
