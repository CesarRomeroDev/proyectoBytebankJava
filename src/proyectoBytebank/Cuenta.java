package proyectoBytebank;

// los atributos de la clase Cuenta llevan por defecto 0.
public class Cuenta {
	private double saldo;		//private para que nadie trabaje diractamente con el saldo, no modificarlo 
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;  //usando static nos indica que no es de la instancia, si no de la clase y no va ser alterada
	
	public Cuenta(int agencia) { 	//retorna nuestro objeto cuenta es un constructor en java
		if (agencia <= 0) {
			System.out.println("no se permite cero");
			this.agencia = 1;		//Indicamos que elnumero de agencia se por defecto uno si es que agregan 0
			//esto nos permite quitar el cero por defecto que viene en clase.
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando " + total + " cuentas.");
	}
	
	//NO RETORNA VALOR
	public void depositar(double valor){	//No retorna nada al agregar void
		this.saldo+= valor;	//this nos sirve para hacer referencia a los atributos de la clase.
	}
	
	//RETORNA VALOR
	public boolean retirar(double valor) {
		if ( this.saldo >= valor ) {
			this.saldo-= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if( this.saldo >= valor ) {
			this.saldo-= valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){		//obtenerSaldo = getSaldo
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;  //no lo tenemos a nivel instancia, si no a nivel clase
	}
}
