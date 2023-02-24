package proyectoBytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();		//hacemos una instancia de Cliente de tipo Cliente
		cliente1.nombre = "Diego";
		cliente1.documento = "45649";
		cliente1.telefono = "5520492389";
		
		Cuenta cuentaCliente1 = new Cuenta();	//creamos una nueva instancia de Cuenta para el cliente1
		cuentaCliente1.agencia = 1;
		cuentaCliente1.titular = cliente1;		//nueva cuenta para el cliente 1 que es el titular
		
		System.out.println(cuentaCliente1.titular.documento);
		System.out.println("El nombre del cliente Titular es: " + cuentaCliente1.titular.nombre + " con el numero de documento"
				+ ": " + cuentaCliente1.titular.documento );
		System.out.println(cuentaCliente1.titular);		//imprime direcciona de memoria del objeto 5b6f7412
		System.out.println(cliente1); 				//y si imprimimos el objeto cliente1 es igual al objeto de memoria 5b6f7412
	}
}
