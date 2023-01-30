package ejercicios01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProbandoConClassPath {

	public static void main(String[] args) {

		Path p = Paths.get("C:\\Users\\laura.galvez.moya\\eclipse-workspace\\TerceraSemana");
		System.out.println("getFileName   " + p.getFileName());
		System.out.println("getName 0     " + p.getName(0));
		System.out.println("getName 1     " + p.getName(1));
		System.out.println("getNameCount  " + p.getNameCount());

	}
}
