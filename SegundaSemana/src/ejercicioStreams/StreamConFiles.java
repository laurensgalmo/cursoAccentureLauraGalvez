package ejercicioStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * En esta clase usamos Streams desde Files; walk(Paths.get(dir)), el cual va
 * recorriendo tambien los subdirectorios que se encuentra.
 * 
 * @author laura.galvez.moya
 *
 */

public class StreamConFiles {

	@SuppressWarnings({ "unchecked", "resource", "rawtypes" })
	public static void main(String[] args) throws IOException {

		Stream ficheros = Files.walk(Paths.get("."));
		
		ficheros
		.filter(o -> o.toString()
		.contains(".java"))
		.forEach(System.out::println);
	}

}
