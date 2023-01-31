package ejercicios04;

public class ClaseMain {

	static Buffer buf;

	public static void main(String[] args) {

		buf = new Buffer();
		buf.setDisponible(false);

		GeneraNumero gn = new GeneraNumero();
		gn.setBuf(buf);

		PresentaNumero pp = new PresentaNumero();
		pp.setBuf(buf);

		Thread tgn = new Thread(gn);
		Thread tpp = new Thread(pp);

		tgn.start();
		tpp.start();
	}
}
