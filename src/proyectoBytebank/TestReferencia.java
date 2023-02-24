package proyectoBytebank;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;	//Si hacemos referencia a la primera cuenta, el valor de la primera referaqncia cambia al nuevo vvalor
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo Primera Cuenta: " + primeraCuenta.saldo);
		System.out.println("Saldo Segunda Cuenta: " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("Saldo Primera Cuenta" + primeraCuenta.saldo);
		
		System.out.println(primeraCuenta);	//referencia en memoria: 52cc8049
		System.out.println(segundaCuenta);	//referencia en memoria: 52cc8049
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto en memoria");
		}
	}
}
