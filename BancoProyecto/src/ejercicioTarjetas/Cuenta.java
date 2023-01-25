package ejercicioTarjetas;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase cuenta es la que tendrá los movimientos.
 * 
 * @author laura.galvez.moya
 *
 */

public class Cuenta {

	// Atributos

	private String mNumero;
	private String mTitular;

	private List<Movimiento> mMovimientos;

	// Constructor

	public Cuenta(String mNumero, String mTitular) {
		this.setmNumero(mNumero);
		this.setmTitular(mTitular);
		mMovimientos = new ArrayList<>();
	}

	// getSaldo():double

	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {

		double z = 0;
		for (Movimiento mov : mMovimientos) {
			z += mov.getMiImporte();
		}

		return z;

	}

	// addMovimiento(String concepto, double importe):void

	public void addMovimiento(String concepto, double importe) {

		Movimiento m = new Movimiento();
		m.setMiConcepto(concepto);
		m.setMiImporte(importe);
		addMovimiento(m);
	}

	// addMovimiento(Movimiento m):void

	public void addMovimiento(Movimiento m) {

		mMovimientos.add(m);
	}

	// ingresar(double x): void

	public void ingresar(double x) throws Exception {
		ingresar("Ingreso efectivo\t ", x);

	}

	// retirar(double x): void

	public void retirar(double x) throws Exception {
		retirar("Retirada efectivo \t ", x);
	}

	// ingresar(String concepto, double x):void

	public void ingresar(String concepto, double x) throws Exception {
		if (x <= 0) {
			throw new Exception("La cantidad es negativa, no se puede hacer el ingreso");
		}
		addMovimiento(concepto, x);
	}

	// retirar(String concepto, double x): void

	public void retirar(String concepto, double x) throws Exception {
		if (getSaldo() < x) {
			throw new Exception("El saldo es insuficiente ");
		}
		addMovimiento(concepto, -x);
	}

	// Getters y Setters

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getmTitular() {
		return mTitular;
	}

	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

	public void verTodosLosMovimientos() {
		System.out.println(
				"****************************** M O V I M I E N T O S   D E   L A   C U E N T A ******************************");
		double z = 0;

		for (Movimiento m : mMovimientos) {
			z += m.getMiImporte();
			System.out
					.println(m.getMiFecha() + "\t" + m.getMiConcepto() + "\t\t\t\t" + m.getMiImporte() + "\t\t\t" + z);

		}

	}

}
