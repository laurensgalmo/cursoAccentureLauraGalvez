package ejerciciosVariados;

public class DatosArray {

	public static void main(String[] args) {

		int[] arr1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[][] arr2 = new int[5][7];

		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;
		arr2[0][5] = 6;
		arr2[0][6] = 7;
		arr2[1][0] = 8;
		arr2[1][1] = 9;
		arr2[1][2] = 10;

		// Y CONTINÚA DE 1 A 31

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr2[i][j]);
			}
		}
	}
}
