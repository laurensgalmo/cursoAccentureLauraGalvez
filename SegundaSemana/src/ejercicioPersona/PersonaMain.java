package ejercicioPersona;

/**
 * Aquí ejecutaremos nuestro programa
 * @author laura.galvez.moya
 */

import java.util.HashSet;
import java.util.Set;

public class PersonaMain {

	public static void main(String[] args) {

		Set<String> ss = new HashSet<>();

		Profesor pro = new Profesor("111", "Oscar", 34, "624657812", 3444, "13/12/2020");
		Alumno al = new Alumno("122", "Laura", 24, "645637532", 2, ss);

		al.setAsignaturas("Mates");
		al.setAsignaturas("Sociales");
		al.setAsignaturas("Física");
		al.setAsignaturas("Inglés");

		System.out.println(al);
		System.out.println(pro);
	}

}
