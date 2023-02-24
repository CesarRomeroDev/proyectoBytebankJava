package proyectoBytebank;

// los atributos de la clase Cuenta llevan por defecto 0.
public class Cuenta {
	private double saldo;		//private para que nadie trabaje diractamente con el saldo, no modificarlo 
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	public Cuenta(int agencia) { 	//retorna nuestro objeto cuenta es un constructor en java
		System.out.println("Aqui se crea una nueva cuenta");
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
	
	public void setAgencia(int agencia) {	//set para modificar
		if ( agencia > 0 ) {
			this.agencia = agencia;			
		}else {
			System.out.println("No esta permitido valores negativos");
		}
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
}
