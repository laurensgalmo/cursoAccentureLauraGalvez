package misPruebas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class miArrayList {

	public static void main(String[] args) {

		List<String> colores = new ArrayList<>();

		colores.add("rosa");
		colores.add("naranja");
		colores.add("verde");
		colores.add("negro");
		colores.add("rojo");
		colores.add("lila");

		System.out.println("---LISTA DE COLORES---");

		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		if(colores.contains("rosa")) {
			System.out.println("Contiene rosa" + " su posición es " 
			+ colores.indexOf("rosa")); //indexOf() te dice la posición, se usa con Strings también.
		}
		
		System.out.println("Número de elementos: " + colores.size());
		
		System.out.println("---HACEMOS FOR ITERATOR---");
		
		for(Iterator<String> iter = colores.iterator() ; iter.hasNext(); ) {
			System.out.println(iter.next()); //El next actúa como i++
			iter.remove();
		}
		
		System.out.println("---HACEMOS FOR GET---");
		
		for(int k = 0 ; k < colores.size(); k++) {
			System.out.println(colores.get(k)); 
		}
			
		
		
		
		// ---------- P A R A  H A C E R L O  S I N  A D D----------

		/*	String[] nombresAnimales = { "elefante", "gorila", "jiafa", "mono", "cebra", "iguana" };
			List<String> animales = new ArrayList<String>(Arrays.asList(nombresAnimales));

			System.out.println("---LISTA DE ANIMALES---");

			for (int a = 0; a < animales.size(); a++) {
				System.out.println(animales.get(a));

			}*/
		}
	
}
