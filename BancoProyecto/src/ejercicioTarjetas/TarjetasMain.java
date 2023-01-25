package ejercicioTarjetas;

import java.time.LocalDate;

/**
 * Programa gestión banco
 * 
 * @author laura.galvez.moya
 *
 */

public class TarjetasMain {

	static Cuenta c;
	static ClaseCredito credito;
	static ClaseDebito debito;

	public static void main(String[] args) throws Exception {

		// Creamos la cuenta

		LocalDate dia = LocalDate.now();
		c = new Cuenta("111", "Laura Galvez Moya");

		// Ingresar
		c.ingresar(1000);
		c.ingresar("Esto es ingresar\t", 240);
		c.retirar(60);
		c.retirar("Esto es retirada\t", 30);

		// Para Tarjeta Débito
		debito = new ClaseDebito(dia, "ES227676768858549", "Laura Galvez Moya");
		debito.setCuenta(c);
		debito.ingresar(100);
		debito.retirar(50);

		// Para tarjeta Crédito
		credito = new ClaseCredito(dia, "ES458323846238764", "Laura Galvez Moya", 500);
		credito.setCuenta(c);
		credito.ingresar(400);
		credito.retirar(1);

		System.out.println();
		credito.verTodosLosMovimientosDeCredito();
		System.out.println();
		c.verTodosLosMovimientos();
		System.out.println();
		credito.liquidacion(dia.getMonthValue(), dia.getDayOfYear());
	}

}
