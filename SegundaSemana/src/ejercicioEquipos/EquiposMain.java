package ejercicioEquipos;

/**
 * Aquí se ejecutará el programa.
 */

import java.util.ArrayList;

public class EquiposMain {

	public static void main(String[] args) {

		// Creo un ArrayList

		ArrayList<ClasePadre> futbol = new ArrayList<ClasePadre>();

		// Añado objetos a la Lista

		futbol.add(new Masajista(1, 26, "David", "Prades", 4, "Masajista Deportivo"));
		futbol.add(new Futbolista(2, 19, "Marc", "Sanchez", 26, "Delantero"));
		futbol.add(new Entrenador(3, 55, "Pedro", "Ortega", "Federación Española"));

		// Bucle For para recorrer la Lista

		for (ClasePadre equipo : futbol) {
			if (equipo != null) {

				if (equipo instanceof Futbolista) {
					Futbolista furbo = (Futbolista) equipo;
					System.out.println(furbo.toString());
					furbo.jugarPartido();
					furbo.entrenar();
					furbo.concentrarse();
					furbo.viajar();
					System.out.println();

				}
				if (equipo instanceof Entrenador) {
					Entrenador entr = (Entrenador) equipo;
					System.out.println(entr.toString());
					entr.dirigirEntrenamiento();
					entr.dirigirPartido();
					entr.concentrarse();
					entr.viajar();
					System.out.println();

				}
				if (equipo instanceof Masajista) {
					Masajista masaj = (Masajista) equipo;
					System.out.println(masaj.toString());
					masaj.darMasaje();
					masaj.concentrarse();
					masaj.viajar();
					System.out.println();

				}
			}
		}

	}
}
