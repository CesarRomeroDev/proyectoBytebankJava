package proyectoBytebank;

public class Carro {
	private int aho;
	private String modelo;
	private double precio;
	
	public Carro( int aho, String modelo, double precio ) {		//Constructor
		if(aho >= 1891){
            this.aho = aho;
        }else{
            System.out.println("El año informado no es valido. Por eso usaremos 2017!");
            this.aho = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no es valido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }	
    }
	
	public Carro( String modelo, double precio ) {		//NUevo constructor sin el año 
		
		//Para no duypicar el codigo, solo llamamos al otro contructor de esta manera:
		//Solo usando this
		
		this(2017, modelo, precio);
		
		//this.aho = 2023;

        //if( modelo != null){
        //    this.modelo = modelo;
        //}else{
        //    System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
        //    this.modelo = "Gol";
        //}

        //if(precio > 0){
        //    this.precio = precio;
        //}else{
        //    System.out.println("El precio no es valido. Por eso usaremos 40000.0!");
        //    this.precio = 40000.0;
        //}
	}
	
	public int getAho() {
		return this.aho;
	}
	
	public void setAho(int aho) {
		this.aho = aho;
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
