package ejercicios02;

/**
 * A continuación, nueva clase capaz de leer el fichero
 * Presentar por pantalla los datos leídos con formato XXX YYY 
 * 
 * @author laura.galvez.moya
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {

	public static void main(String[] args) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("C:\\ficheroLaura.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
