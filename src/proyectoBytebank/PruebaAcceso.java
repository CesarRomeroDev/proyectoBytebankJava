package proyectoBytebank;

public class PruebaAcceso {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(400);
		cuenta.setAgencia(-22);
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		//Cuenta cuenta = new Cuenta();
		//cuenta.saldo = 200;
		//cuenta.retirar(300);
		//cuenta.saldo = cuenta.saldo - 300; 	//AQUI QUEDAMOS VULNERABLE A QUE OTRA PERSONA NO UTILICE 
		//NUESTRO METODO RETIRAR
		//Y PUEDA HACER DIRECTAMENTE LA OPERACION RESTANDO SIN PASAR POR EL METODO Y LA
		//CONDICION DE RETIRAR.
		//System.out.println(cuenta.saldo);
		
		//HAY UN CONCEPTO LLAMADO ENCAPSULAMIENTO EL CUAL AGREGAMOS A NUESTRO ATRIUBUTO 
		//EN LA CLASE EN LA QUE SE NECUNTRA LLAMADO "PRIVATE" QUE SE LE LLAMA MODIFICADORES DE ACCESO Y ASI NO PODEMOS
		//MODIFICAR SOLAMENTE USANDO NUESTRO METODOS.
	}
}
