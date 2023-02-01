package ejercicios07;

/**
 * Usando InetAddress para obtener información sobre direcciones IP y nombres de host.
 * Primero, se obtiene la dirección IP local y después, se obtiene el nombre de host.
 * 
 * @author laura.galvez.moya
 */

import java.net.InetAddress;

public class PrInetAddress {

	public static void main(String[] args) {

		try {
			InetAddress ip = InetAddress.getByName("recursosformacion.com");
			InetAddress ipMio = InetAddress.getLocalHost();

			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());

			System.out.println("Host Name: " + ipMio.getHostName());
			System.out.println("IP Address Local: " + ipMio.getHostAddress());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
