package ejercicioIntercambio;

/**
 * Proyecto donde vamos a intercambiar valores.
 * 
 * @author laura.galvez.moya
 *
 */

public class ClaseIntercambio {

	// Atributos

	private String num1;
	private String num2;

	/**
	 * 
	 * Constructor.
	 * 
	 * @param num1 El parámetro num1 contendrá un valor.
	 * @param num2 El parámetro num1 contendrá un valor.
	 * 
	 */

	public ClaseIntercambio(String num1, String num2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Método que realiza un intercambio de valores.
	 * 
	 * @param num1
	 * @param num2
	 */

	public void intercambio(String num1, String num2) {

		this.num1 = num2;
		this.num2 = num1;
	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

}
