package ejerciciosJava04;

public class Factura {

	/*
	 * Has de preparar un programa que calcule una linea de factura, para ello,
	 * tienes las variables cantidad (int) unidades(int) precio(double)
	 * importe(double) total(int) Los cálculos que debes realizar son: > El importe
	 * = cantidad multiplicado por las unidades y multiplicado por el precio. > El
	 * total es el resultado de multiplicar el importe por 1,21. Ten en cuenta que
	 * puedes necesitar utilizar «cast» el valor de iva es el 21% del importe. >
	 * Debes presentar en salida,también el valor correcto si no convirtiéramos el
	 * total a «int».
	 */

	// LAS CONSTANTES VAN AL PRINCIPIO DE LA CLASE

	final static int IVA = 21;

	public static void main(String[] args) {

		int cantidad = 3;
		int unidades = 12;
		double precio = 5.40D;
		double importe = cantidad * unidades * precio;
		double iva = importe * IVA / 100;
		int total = (int) (importe + iva);

		System.out.println("Cantidad: " + cantidad);
		System.out.println("Unidades: " + unidades);
		System.out.println("Precio: " + precio);
		System.out.println("Importe: " + importe);
		System.out.println("IVA: " + iva);
		System.out.println("Total: " + total + " debería ser: " + (total + iva));
	}
}
