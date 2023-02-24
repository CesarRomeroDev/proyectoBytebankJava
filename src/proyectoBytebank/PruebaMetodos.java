package proyectoBytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuentaJulio = new Cuenta();
		miCuentaJulio.saldo = 300;
		miCuentaJulio.depositar(200);
		
		System.out.println(miCuentaJulio.getSaldo());
		
		miCuentaJulio.retirar(100);
		System.out.println(miCuentaJulio.getSaldo());
		
		
		Cuenta cuentaDeDiana = new Cuenta();
		cuentaDeDiana.depositar(1000);
		boolean puedeTransferir = cuentaDeDiana.transferir(400, miCuentaJulio);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No tienes el saldo suficiente para transferir");
		}
		
		System.out.println(cuentaDeDiana.getSaldo());
		System.out.println(miCuentaJulio.getSaldo());
	}
}
