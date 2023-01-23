package ejercicioEquipos;

/**
 * Futbolista extiende de ClasePadre.
 * 
 * @author laura.galvez.moya
 *
 */

public class Futbolista extends ClasePadre {

	// Atributos

	private int dorsal;
	private String demarcacion;

	// Constructor

	public Futbolista(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion) {
		super(id, edad, nombre, apellidos);

		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	// Getters y Setters

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	// Métodos

	public void concentrarse() {

		System.out.println("Estoy concentrado para jugar el partido");

	}

	public void viajar() {

		System.out.println("Estoy viajando para jugar el partido");

	}

	public void jugarPartido() {

		System.out.println("Estoy jugando el partido");

	}

	public void entrenar() {

		System.out.println("Estoy entrenando para el partido");

	}

	// toString

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]" + super.toString();
	}

}
