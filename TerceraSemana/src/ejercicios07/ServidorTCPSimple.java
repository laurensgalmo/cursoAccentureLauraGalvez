package ejercicios07;

/**
 * Probando ServerSocket.
 * Parte del Servidor.
 * 
 * @author laura.galvez.moya
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {

	public static final String SALUDO = "Esperando conexión en puerto ";
	public static final int TIMEOUT = 10000;
	public static final int PUERTO = 6000;

	private static ServerSocket serverSocket;

	public static void main(String[] args) throws IOException {

		/**
		 * Abrir socket y establecer Timeout
		 */

		serverSocket = new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);

		/**
		 * Como hemos decidido que si no se conecta nadie en esos 10 segunos, queremos
		 * seguir esperando, programaremos dentro de un bucle While(true)
		 */

		while (true) {
			try {
				System.out.println(SALUDO + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept(); // accept(); deja el servidor en escucha durante el Timeout
														// sino hasta que le llegue algo
				System.out.println("Conexion desde " + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("Gracias por conectarte a " + server.getLocalSocketAddress() + "\nAdiosito!");
				server.close();
				break;

			} catch (SocketTimeoutException s) {
				System.out.println("Socket timed out");
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
