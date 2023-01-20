package ejerciciosBucles;

/**
 * Recoger una frase desde la línea de comando y darle la vuelta. Para ello
 * vamos a realzar distintas implementaciones.
 * 
 * @author laura.galvez.moya
 *
 */
public class VueltaFrase {

	public static void main(String[] args) {

		System.out.println("---------P R I M E R O---------");

		String salida = "";

		for (String i : args) {
			salida = salida + i + " ";
		}

		System.out.println(salida);

		System.out.println("---------S E G U N D O---------");

		// INVERSA DE LA CADENA

		String[] palabras = salida.split(" ");
		int reves = palabras.length;

		for (int a = reves - 1; a >= 0; a--) {

			System.out.print(palabras[a]);
		}

		System.out.println("\n---------T E R C E R O---------");

		// INVERSA DE CARÁCTERES

		String salida2 = "";
		int salida3 = salida.length();

		for (int k = salida3 - 1; k >= 0; k--) {

			salida2 += salida.charAt(k);

		}

		System.out.println(salida2);

		System.out.println("---------C U A R T O---------");

		// CAMBIO DE VOCALES POR NÚMEROS CON EL USO DE SWITCH

		String salida4 = "";
		int ls2 = salida.length();

		for (int k = ls2 - 1; k >= 0; k--) {

			char nose = salida.charAt(k);
			nose = conver(nose);
			salida4 += nose;
		}
		System.out.println(salida4);

		System.out.println("---------Q U I N T O---------");

		// SIN USAR ATRIBUTO LENGHT; CALCULAR LA LONGITUD BUSCANDO EL CARÁCTER FINAL

		char bus = salida.charAt(0);
		String salida6 = "";

		for (int a = 1; (salida + bus).charAt(a) != bus; a++) { // es + bus para asegurarnos que no falten letras

			System.out.print(salida.charAt(a));
			salida6 = salida.charAt(a) + salida6;
		}
		System.out.println();
		System.out.print(salida6);

		System.out.println("\n----SEXTO----");

		// SIN CALCULAR LA LONGITUD DE LA STRING

		salida += (char) 0;
		int pos = 0;
		String salida8 = "";

		while (salida.charAt(pos) != (char) 0) {
			salida8 = salida.charAt(pos++) + salida8;

		}
		System.out.println(salida8);

	}

	// METODO PARA QUARTO
	public static char conver(char nose) {
		switch (nose) {

		case 'a':
			nose = '4';
			break;
		case 'e':
			nose = '3';
			break;
		case 'i':
			nose = '2';
			break;
		case 'o':
			nose = '1';
			break;
		case 'u':
			nose = '6';
			break;
		}
		return nose;

	}
}
