package ejerciciosJava04;

/**
 * Dado el radio, (23), calcular el área del circulo y la longitud de la
 * circunferencia.
 * 
 * @author laura.galvez.moya
 *
 */
public class Area {

	public static void main(String[] args) {

		double area;
		double longitud;
		int r = 23;

		area = Math.PI * r * r;
		longitud = 2 * Math.PI * r;

		System.out.println("El area de la circunferencia con radio 23 es de : " + area);
		System.out.println("La longitud de la circunferencia con radio 23 es de : " + longitud);
	}
}
