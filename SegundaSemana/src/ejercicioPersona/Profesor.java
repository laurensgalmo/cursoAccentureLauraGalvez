package ejercicioPersona;

/**
 * La clase Profesor extiende de Persona.
 * 
 * @author laura.galvez.moya
 *
 */

public class Profesor extends Persona {

	// Atributos

	private float salario;
	private String fecContratacion;

	// Constructor

	public Profesor(String codPersona, String nombre, int edad, String telContacto, float salario,
			String fecContratacion) {
		super(codPersona, nombre, edad, telContacto);
		this.salario = salario;
		this.fecContratacion = fecContratacion;

	}

	// Getters y Setters

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFecContratacion() {
		return fecContratacion;
	}

	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

	}

	// toString

	@Override
	public String toString() {
		return "Profesor [salario=" + salario + ", fecContratacion=" + fecContratacion + "]" + super.toString();
	}

}
