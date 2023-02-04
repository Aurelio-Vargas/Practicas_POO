package herencia_trabajos;

public class Celular extends SmartDevice{
	
	boolean pantallaLed;
	int tamaño;
	boolean entradaAudifonos;
	int bocinas;
	int botones;
	
	public Celular(boolean pantallaLed, int tamaño,boolean entradaAudifonos,int bocinas,int botones) {
		this.pantallaLed=pantallaLed;
		this.tamaño=tamaño;
		this.entradaAudifonos=entradaAudifonos;
		this.bocinas=bocinas;
		this.botones=botones;
		
	}

}
