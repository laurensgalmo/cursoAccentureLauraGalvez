package ejercicioTarjetas;

import java.time.LocalDate;

/**
 * Clase POJO
 * 
 * @author laura.galvez.moya
 *
 */

public class Movimiento {

	// Atributos

	private String miConcepto;
	private LocalDate miFecha;
	private double miImporte;

	// Constructor

	public Movimiento() {

		miFecha = LocalDate.now();// Añado fecha con resultado: (YYYY/MM/DD)
	}

	// Getters y Setters

	public String getMiConcepto() {
		return miConcepto;
	}

	public void setMiConcepto(String miConcepto) {
		this.miConcepto = miConcepto;
	}

	public LocalDate getMiFecha() {
		return miFecha;
	}

	public void setMiFecha(LocalDate miFecha) {
		this.miFecha = miFecha;
	}

	public double getMiImporte() {
		return miImporte;
	}

	public void setMiImporte(double miImporte) {
		this.miImporte = miImporte;
	}

}
