package ejercicios07;

/**
 * Al trabajar con http, disponemos de la clase HttpURLConnection.
 * Esta clase hereda de URLConnection.
 * 
 * @author laura.galvez.moya
 */

import java.net.HttpURLConnection;
import java.net.URL;

public class EjercicioUrlConnection {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://recursosformacion.com/wordpress");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}

			huc.disconnect();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}