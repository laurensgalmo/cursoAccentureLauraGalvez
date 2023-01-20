package ejerciciosBucles;

/**
 * Crear una variable (nota) con el valor 6. Decidir el texto que se ha de
 * presentar según la siguiente escala.
 * 
 * @author laura.galvez.moya
 */

public class Notas {

	public static void main(String[] args) {

		int nota = 6;

		switch (nota) {
		case 1:
			System.out.println("SUSPENDIDO");
			break;

		case 2:
			System.out.println("INSUFICIENTE");
			break;

		case 3:
			System.out.println("INSUFICIENTE");
			break;

		case 4:
			System.out.println("INSUFICIENTE");

		case 5:
			System.out.println("SUFICIENTE");
			break;

		case 6:
			System.out.println("BIEN");
			break;

		case 7:
			System.out.println("NOTABLE");
			break;

		case 8:
			System.out.println("NOTABLE");
			break;

		case 9:
			System.out.println("SOBRESALIENTE");
			break;

		case 10:
			System.out.println("SOBRESALIENTE");
			break;
		}

	}

}
