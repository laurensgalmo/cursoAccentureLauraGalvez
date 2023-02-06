package rf.ficheros.util;

import java.util.List;

import rf.ficheros.controller.CountryController;
import rf.ficheros.modelos.Country;

public class Main {

	public static void main(String[] args) throws Exception {

		CountryController cc = new CountryController();
		List<Country> ll = cc.leerTodos();
		//listarCtr(ll);

		System.out.println();
		System.out.println(cc.leerUno("BR"));

		Country datos = cc.leerUno("BR");
		datos.setCountry_name("Modificado");
		System.out.println("Actualizados: " + cc.actualizar(datos));

		System.out.println();
		System.out.println(cc.leerUno("BR"));

		Country datos2 = cc.leerUno("BR");
		System.out.println("Actualizados, borrando..." + cc.borrar(datos2));
	}

}
