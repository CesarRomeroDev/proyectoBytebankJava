package proyectoBytebank;

public class Test {
	
    public static void main(String[] args) {

        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 500.0;
        Cuenta otraCuenta = miCuenta;
        otraCuenta.saldo += 1000.0;
  
        System.out.println(miCuenta.saldo);
        
        Cuenta miSegundaCuenta = new Cuenta();
        miSegundaCuenta.saldo = 300.0;
        Cuenta otraSegundaCuenta = miSegundaCuenta;
        otraSegundaCuenta.saldo += 2000.0;
        
        System.out.println(miSegundaCuenta.saldo);
    }
}
