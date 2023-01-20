package ejerciciosJava04;

/**
 * Intenta predecir que resultado daría el siguiente código; después puedes
 * escribirlo y ejecutarlo para comprobar el resultado.
 * 
 * @author laura.galvez.moya
 */

public class Operadores {

	public static void main(String[] args) {

		int valor = 0;
		valor = 23;
		valor += 10;

		System.out.println("" + --valor);// 32
		System.out.println("" + ++valor);// 33
		System.out.println("" + valor++);// 33
		System.out.println("" + valor--);// 34
		System.out.println("" + valor);// 33
	}
}
