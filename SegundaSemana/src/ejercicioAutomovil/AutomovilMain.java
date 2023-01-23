package ejercicioAutomovil;

public class AutomovilMain {

	public static void main(String[] args) {
		
		Moto moto = new Moto(40, 5, 200, 3);
		Camion camion = new Camion(5, 180, 67891, 5);
		Coche coche = new ModelosCoche(6, 200, 56794, "rojo", 5, "renault");
		
		System.out.println(moto + "\n");
		System.out.println(camion + "\n");
		System.out.println(coche + "\n");
		

	}

}
