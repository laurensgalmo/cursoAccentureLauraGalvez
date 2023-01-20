package ejerciciosBucles;

/**
 * En este proyecto, se trata de recorrer números del 0 al 100 con saltos de 23
 * en 23.
 * 
 * @author laura.galvez.moya
 *
 */

public class NumerosCien {

	// Listar números de 100 al 0 de 23 en 23

	public static void main(String[] args) {

		for (int i = 100; i >= 0; i -= 23) { // En negativo ya que va de 100 a 0

			System.out.println(i);
		}
	}
}
