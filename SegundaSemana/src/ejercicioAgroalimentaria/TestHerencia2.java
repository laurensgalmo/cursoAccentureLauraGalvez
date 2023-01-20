package ejercicioAgroalimentaria;

/**
 * Proyecto Agroalimentaria; clase main.
 * 
 * @author laura.galvez.moya
 *
 */

public class TestHerencia2 {

	public static void main(String[] args) {

		// Creación de Objetos

		CongeladosAgua uno = new CongeladosAgua("12/12/2023", 344, 3, 6);
		CongeladosAire dos = new CongeladosAire("12/12/2023", 443, 3, 4, 5, 8, 1);
		CongeladosNitrogeno tres = new CongeladosNitrogeno("12/12/2023", 6, 22, "NI", "3H");
		ProductosCongelados cuatro = new ProductosCongelados("12/12/2023", 4, 1);
		ProductosFrescos cinco = new ProductosFrescos("12/12/2023", 12, "12/12/2022", "España");
		ProductosRefrigerados seis = new ProductosRefrigerados("12/12/2023", 3, 129);

		System.out.println("[PRODUCTOS FRESCOS]");
		System.out.println(cinco.toString());
		System.out.println();

		System.out.println("[PRODUCTOS REFRIGERADOS]");
		System.out.println(seis.toString());
		System.out.println();

		System.out.println("[PRODUCTOS CONGELADOS]");
		System.out.println(cuatro.toString());
		System.out.println();

		System.out.println("[TIPOS]");
		System.out.println();

		System.out.println("[PRODUCTOS CONGELADOS POR AGUA]");
		System.out.println(uno.toString());
		System.out.println();

		System.out.println("[PRODUCTOS CONGELADOS POR AIRE]");
		System.out.println(dos.toString());
		System.out.println();

		System.out.println("[PRODUCTOS CONGELADOS POR NITROGENO]");
		System.out.println(tres.toString());
		System.out.println();

	}
}
