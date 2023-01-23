package ejercicioPersona;

/**
 * La clase Alumno extiende de Persona.
 */

import java.util.Set;

public class Alumno extends Persona {

	// Atributos

	private int curso;
	private Set<String> asignaturas; // Un array donde guardamos las asignaturas

	// Constructor

	public Alumno(String codPersona, String nombre, int edad, String telContacto, int curso, Set<String> asignaturas) {
		super(codPersona, nombre, edad, telContacto);
		this.curso = curso;
		this.asignaturas = asignaturas;
	}

	// Getters y Setters

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public Set<String> getAsignaturas() {
		return asignaturas;
	}
	
	/**
	 * 
	 * @param asignaturas
	 */

	public void setAsignaturas(Set<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public void setAsignaturas(String asignatura) {
		asignaturas.add(asignatura);

	}

	// toString

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", asignaturas=" + asignaturas + "]" + super.toString();
	}

	// Mostraremos las asignaturas utilizando un syso en el método

	@Override
	public void mostrar() {

		System.out.println(toString());
	}

}
