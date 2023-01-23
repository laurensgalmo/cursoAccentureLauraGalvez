package ejercicioEquipos;

/**
 * Masajista extiende de ClasePadre.
 * 
 * @author laura.galvez.moya
 *
 */

public class Masajista extends ClasePadre {

	// Atributos

	private String titulacion;
	private int añosExperiencia;

	// Constructor

	public Masajista(int id, int edad, String nombre, String apellidos, int añosExperiencia, String titulacion) {
		super(id, edad, nombre, apellidos);
		this.añosExperiencia = añosExperiencia;
		this.titulacion = titulacion;

	}

	// Getters y Setters

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	// Métodos

	public void concentrarse() {

		System.out.println("Estoy concentrado para ver el partido");

	}

	public void viajar() {

		System.out.println("Estoy viajando para hacer masajes a los futbolistas");

	}

	public void darMasaje() {

		System.out.println("Estoy dando masajes a los futbolistas");

	}

	// toString

	@Override
	public String toString() {
		return "Masajista [titulacion=" + titulacion + ", añosExperiencia=" + añosExperiencia + "]" + super.toString();
	}

}
