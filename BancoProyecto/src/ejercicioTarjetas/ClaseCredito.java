package ejercicioTarjetas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseCredito extends Tarjeta {

	// Constantes

	private static final double COMISION = 0;
	private static final double MINIMO_COMISION = 0;

	// Atributos

	private double mCredito;
	private List<Movimiento> mMovimientos;

	// Constructor

	public ClaseCredito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular, double credito) {
		super(mFechaDeCaducidad, mNumero, mTitular);
		mCredito = credito;
		mMovimientos = new ArrayList<>();
	}

	// Métodos

	@Override
	public double getSaldo() {
		return getmCuentaAsociada().getSaldo(); // tiene saldo y saldo de crédito
	}

	@Override
	public void ingresar(double x) throws Exception {
		this.getmCuentaAsociada().ingresar("Ingreso en cajero automático ", x);
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		this.getmCuentaAsociada().retirar("Compras en: ", x);
	}

	@Override
	public void retirar(double x) throws Exception {

		if (x > 0) {
			x = x + (x * COMISION < MINIMO_COMISION ? MINIMO_COMISION : x * COMISION);
			if (x > getmCredito()) {
				throw new Exception("Crédito Insuficiente ");
			}
			Movimiento m = new Movimiento();
			m.setMiFecha(getmFechaDeCaducidad());
			m.setMiConcepto("RETIRADA EN CAJERO AUTOMÁTICO");
			m.setMiImporte(-x);
			mMovimientos.add(m);
		}
	}

	// Método LIQUIDAR

	public void liquidacion(int mes, int año) {
		Movimiento liquidar = new Movimiento();
		// AQUI FECHA
		double r = 0.0;

		for (Iterator iter = mMovimientos.iterator(); iter.hasNext();) {
			Movimiento movim = (Movimiento) iter.next();
			if (movim.getMiFecha().getMonthValue() == mes && movim.getMiFecha().getYear() == año) {
				r += movim.getMiImporte();
				iter.remove();
			}
		}

		liquidar.setMiImporte(r);

		if (r != 0) {
			getmCuentaAsociada().addMovimiento(liquidar);
		}
	}

	// Getters y Setters

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

}
