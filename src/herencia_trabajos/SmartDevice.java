package herencia_trabajos;

public class SmartDevice {
	
	String procesador;
	int sensores;
	boolean internet;
	boolean inteligente;
	String marca;
	String color;
	int year;
	int precio;
	
	public SmartDevice() {}
	
	public SmartDevice(String procesador, int sensores, boolean internet, boolean inteligente, String marca, String color, int year, int precio) {
		this.procesador=procesador;
		this.sensores=sensores;
		this.internet=internet;
		this.inteligente=inteligente;
		this.marca=marca;
		this.color=color;
		this.year=year;
		this.precio=precio;
	}


}
