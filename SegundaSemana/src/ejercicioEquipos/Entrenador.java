package ejercicioEquipos;

/**
 * Entrenador extiende de ClasePadre.
 * 
 * @author laura.galvez.moya
 *
 */

public class Entrenador extends ClasePadre {

	// Atributos

	private String idFederacion;

	// Constructor

	public Entrenador(int id, int edad, String nombre, String apellidos, String idFederacion) {
		super(id, edad, nombre, apellidos);

		this.idFederacion = idFederacion;

	}

	// Getters y Setters

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	// Métodos

	public void concentrarse() {

		System.out.println("Estoy concentrado para dirigir el partido");

	}

	public void viajar() {

		System.out.println("Estoy viajando para dirigir el partido");

	}

	public void dirigirPartido() {

		System.out.println("Estoy dirigiendo el partido");

	}

	public void dirigirEntrenamiento() {

		System.out.println("Estoy dirigiendo el entrenamiento para el partido");

	}

	// toString

	@Override
	public String toString() {
		return "Entrenador [idFederacion=" + idFederacion + "]" + super.toString();
	}

}