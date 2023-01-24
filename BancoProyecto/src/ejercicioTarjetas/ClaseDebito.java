package ejercicioTarjetas;

import java.time.LocalDate;

public class ClaseDebito extends Tarjeta {

	public ClaseDebito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);

	}

	@Override
	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double x) throws Exception {
		this.getmCuentaAsociada().ingresar("Ingreso en cuenta asociada ", x);

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		this.getmCuentaAsociada().retirar("Compra a crédito en: ", x);

	}

	@Override
	public void retirar(double x) throws Exception {
		this.getmCuentaAsociada().retirar("Retirada en cuenta asociada ", x);
	}

}
