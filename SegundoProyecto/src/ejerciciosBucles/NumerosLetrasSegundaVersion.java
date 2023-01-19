package ejerciciosBucles;

public class NumerosLetrasSegundaVersion {

	public static void main(String[] args) {

		// ----- S E G U N D A   V E R S I O N -----		
		int num = 72;
		
		
		String [] unidades = {"","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};
		String [] decenas = {"","diez","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
		
		int unidad = num%10;
		int decena= num/10;
		
		if(num < 16) {
			
			System.out.println(unidades[num]);
		}else {
			System.out.println(decenas[decena]+ " y " + unidades[unidad]);	
		}
	}
}
