package ejercicioTarjetas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseCredito extends Tarjeta {

	// Constantes

	private static final double COMISION = 0.05;
	private static final double MINIMO_COMISION = 3;

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
		Movimiento m = new Movimiento();
		m.setMiFecha(getmFechaDeCaducidad());
		m.setMiConcepto("Ingreso en cuenta asociada (cajero automático)");
		m.setMiImporte(x);
		mMovimientos.add(m);
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
			m.setMiConcepto("Retirada en cuenta asociada (cajero automático)");
			m.setMiImporte(-x);
			mMovimientos.add(m);
		}
	}

	// Método LIQUIDAR

	public void liquidacion(int mes, int año) {
		Movimiento liquidar = new Movimiento();
		double r = 5.0;

		for (@SuppressWarnings("rawtypes")
		Iterator iter = mMovimientos.iterator(); iter.hasNext();) {
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

		System.out.println(liquidar.getMiFecha() + "\t" + "Liquidación de operaciones de tarj crédito, "
				+ liquidar.getMiFecha().getMonthValue() + " del " + liquidar.getMiFecha().getYear() + "\t "
				+ liquidar.getMiImporte() + "\t\t\t" + getSaldo());
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

	public void verTodosLosMovimientosDeCredito() {
		System.out.println(
				"****************************** M O V I M I E N T O S   D E   C R E D I T O **********************************");
		double z = 0;

		for (Movimiento m : mMovimientos) {
			z += m.getMiImporte();
			System.out.println(m.getMiFecha() + "\t" + m.getMiConcepto() + "\t\t" + m.getMiImporte() + "\t\t\t" + z);

		}

	}
}
