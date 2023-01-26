package ejercicioTarjetas;

import java.time.LocalDate;

/**
 * SuperClase que hará herencia en ClaseDebito y ClaseCredito
 * 
 * @author laura.galvez.moya
 *
 */

public abstract class Tarjeta {

	// Atributos

	private Cuenta mCuentaAsociada;
	private LocalDate mFechaDeCaducidad;
	private String mNumero;
	private String mTitular;

	// Constructor

	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super();
		this.mFechaDeCaducidad = mFechaDeCaducidad;
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}

	// Getters y Setters

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAociada) {
		this.mCuentaAsociada = mCuentaAociada;
	}

	public LocalDate getmFechaDeCaducidad() {
		return mFechaDeCaducidad;
	}

	public void setmFechaDeCaducidad(LocalDate mFechaDeCaducidad) {
		this.mFechaDeCaducidad = mFechaDeCaducidad;
	}

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

	// getSaldo():double

	public abstract double getSaldo();

	// ingresar(double x):void

	public abstract void ingresar(double x) throws Exception;

	// pagoEnEstablecimiento(String datos, double x):void

	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;

	// retirar(double x):void

	public abstract void retirar(double x) throws Exception;

	// setCuenta(Cuenta c):void / NO ABSTRACT

	public void setCuenta(Cuenta c) {

		mCuentaAsociada = c; // añado mCuentAsociada = c;

	}

}
