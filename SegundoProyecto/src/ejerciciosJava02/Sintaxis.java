package ejerciciosJava02;

public class Sintaxis {

	public static void main(String[] args) {

		/*
		 * Escribe una clase y copia estas lineas y comprueba si dan error, y porqué.
		 */
		
		 int $nombre; 
		 int PasaDo; //Es ACONSEJABLE usar lowerCamelCase
		 int alcance; //Falta el final de sentencia ;
		 int _contador;
		 _contador=25;
		 
		 $nombre=_contador;
		 PasaDo=_contador; //Está escrito como pasado; no coincide con la varibale PaSaDo

		 System.out.println($nombre + " / " + _contador);
	}

}
