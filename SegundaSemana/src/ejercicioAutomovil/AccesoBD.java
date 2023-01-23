package ejercicioAutomovil;

/**
 * Acceso a la Base de Datos.
 * 
 * @author laura.galvez.moya
 *
 */

public class AccesoBD {

	/**
	 * Abre BD / Prepara SQL / Ejecuta SQL
	 * 
	 * @param rece
	 */

	public void AccesoLectura(Iabd rece) {
		rece.leer();
		System.out.println("Está leído");
	}

	public void AccesoGrabacion(Iabd rece) {
		rece.grabar();
		System.out.println("Está grabado");
	}

}
