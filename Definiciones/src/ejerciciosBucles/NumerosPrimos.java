package ejerciciosBucles;

public class NumerosPrimos {

	public static void main(String[] args) {

		// Calcular cuantos números primos hay entre 1 y 100, y cuales son.
		// ----- P E N D I E N T E -----

		boolean bol = true;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0 && i % i == 0) {

				bol = true;
				System.out.println(" es primo " + i);

			} else {

				bol = false;
				System.out.println(" NO es primo " + i);

			}
		}
	}
}
