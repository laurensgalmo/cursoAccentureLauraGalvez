package ejerciciosBucles;

public class Cuadrado {

	/*
	 * Recibir una colección de números desde la linea de comandos, calcular su
	 * cuadrado y presentarlo en salida. El bucle debe continuar hasta haber
	 * calculado todos los números que se le entreguen.
	 */

	public static void main(String[] args) {

		int num;
		int cuadrado;

		for (String nums : args) { 
			num = Integer.parseInt(nums); //Hacemos un parseInt() para convertir de Str a Int.
			cuadrado = num * num;
			System.out.println("El cuadrado de " + num + " es " + cuadrado);
		}
	}
}
