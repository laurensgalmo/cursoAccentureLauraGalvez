package ejercicios07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Probando Socket.
 * 
 * Parte del Cliente.
 * 
 * @author laura.galvez.moya
 *
 */

public class ClienteTCPSimple {

	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";

	public static void main(String[] args) throws IOException {

		// Vamos a enviar un mensaje y recibir la respuesta, no necesitamos bucle
		// Solo conectamos con el servidor
		System.out.println("Conectando a " + DIRECCION + " por puerto " + PUERTO);
		Socket client = new Socket(DIRECCION, PUERTO);

		// Conseguimos DataOutputStream, e imprimimos el mensaje en él
		System.out.println("conectado a " + client.getRemoteSocketAddress());
		OutputStream outToServer = client.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("Saluditos desde " + client.getLocalSocketAddress());

		// Conseguimos DataInputStream para recibir cualquier mensaje que transmitan
		// Leemos y lo imprimimos
		InputStream inFromServer = client.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		System.out.println("Me han contestado " + in.readUTF());

		// Cerramos cliente
		client.close();

	}

}
