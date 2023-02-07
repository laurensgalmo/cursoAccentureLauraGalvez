package rf.curso.S4_MiniApi2;

import java.util.List;

import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.Country;

public class App {
	public static void main(String[] args) throws Exception {

		CountryController cc = new CountryController();
		List<Country> ll = cc.leerTodos();
		for (Country country : ll) {
			System.out.println(country.toString());
		}

		System.out.println();
		System.out.println(cc.leerUno("AR").getCountry_name());

		Country datos = cc.leerUno("AR");
		datos.setCountry_name("Argentina - Modificado");
		cc.actualizar(datos);
		System.out.println("Actualizado");

		System.out.println();
		System.out.println(cc.leerUno("AR").getCountry_name());

		// Country datos2 = cc.leerUno("AR");
		// cc.borrar(datos2);
		// System.out.println("Actualizados, borrando...");

		System.out.println("Finished");

	}

	private static void listarCtr(List<Country> ll) {
		// TODO Auto-generated method stub

	}
}
