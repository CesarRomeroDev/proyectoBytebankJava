package proyectoBytebank;

public class carro1 {
	public static void main(String[] args) {
		Carro primerCarro = new Carro(2023, "Tesla", 534.0);
		Carro segundoCarro = new Carro("Civic", 95000.0);

		
		System.out.println(primerCarro.getAho());
		System.out.println(primerCarro.getModelo());
		System.out.println(primerCarro.getPrecio());
		
		System.out.println(segundoCarro.getAho());
		System.out.println(segundoCarro.getModelo());
		System.out.println(segundoCarro.getPrecio());
	}
}
