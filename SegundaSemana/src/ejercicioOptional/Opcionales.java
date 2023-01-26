package ejercicioOptional;

import java.util.Optional;

/**
 * Los optionals sirven para que cuando los valores sean nulos no haga error,
 * sino que saldrá en consola vacío.
 * 
 * @author laura.galvez.moya
 *
 */

public class Opcionales {

	public static void main(String[] args) {

		/*
		 * // En este caso saldrá vacío ya que está ofNullable y name es null
		 * 
		 * String name = null; Optional<String> opt = Optional.ofNullable(name);
		 * opt.ifPresent(n -> System.out.println(n.length()));
		 */

		// En este otro caso, usamos orElse

		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		opt.ifPresent(n -> System.out.println(n.length()));
		System.out.println((Optional.ofNullable(name)).orElse("LauraGalvezMoya"));

	}

}
