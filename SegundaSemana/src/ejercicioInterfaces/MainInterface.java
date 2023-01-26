package ejercicioInterfaces;

public class MainInterface {

	public static void main(String[] args) {

		Interface1 obj = (a, b) -> a + b;

		System.out.println(obj.cuenta(2, 3));
		System.out.println(obj.resuelto(20));
		System.out.println(obj.saluda());
	}

}
