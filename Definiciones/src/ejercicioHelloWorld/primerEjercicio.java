package ejercicioHelloWorld;

public class primerEjercicio {

	public static void main(String[] args) {
	
		System.out.println("Hola Mundo");
		System.out.println("Pruebas de tipos");
		
		char c = 'A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		
		importeTotal = precio * iva + precio;
		
		System.out.println("Caracter: " + c);
		System.out.println("Equivalencia Unicode: " + (int)c);
		System.out.println("Importe Total = " + importeTotal);
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\tMar\tMie\tJue\tVie");
		System.out.println("Lun\\Mar\\Mie\\Jue\\Vie");
		System.out.println("\"Cocodrilo\"");
	}

}
