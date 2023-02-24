package proyectoBytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		//const primeraCuenta: Cuenta = new Cuenta();
		//VariableReferencia =  Valor
		Cuenta primeraCuenta = new Cuenta();	//primeraCuenta es una instancia de Cuenta().
		primeraCuenta.saldo = 400;
		//primeraCuenta.pais = "peru";			//no compila. pais no es un atributo de Cuenta.
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();		//Crea en tu memoria esta nueva instancia.
		segundaCuenta.saldo = 400;
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.agencia);	//Cuando no esta inicializada tiene el valor de cero. esto quiere decir que al momento de hacer una istancia con new, se le da por defecto un valor de inicialización.
		
		System.out.println(segundaCuenta);
		System.out.println(primeraCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto en memoria");
		}else {
			System.out.println("No son el mismo objeto en memoria");
		}
		
	} 
}
