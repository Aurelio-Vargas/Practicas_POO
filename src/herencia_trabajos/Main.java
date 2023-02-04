package herencia_trabajos;

public class Main {

	public static void main(String[] args) {
		SmartDevice smartDevice =new SmartDevice("Cualquiera",10,true,true,"Apple","Blanco",2000,5000);
		
		System.out.println(smartDevice.color);
		System.out.println(smartDevice.inteligente);
		System.out.println(smartDevice.internet);
		System.out.println(smartDevice.marca);
		System.out.println(smartDevice.precio);
		System.out.println(smartDevice.procesador);
		System.out.println(smartDevice.sensores);
		System.out.println(smartDevice.year);
		System.out.println();
		
		Reloj reloj=new Reloj(true,true,true);
		
		reloj.inteligente=true;
		reloj.color="Blanco";
		reloj.internet=true;
		reloj.marca="Casio";
		reloj.precio=2000;
		reloj.procesador="No";
		reloj.sensores=2;
		reloj.year=2022;
		System.out.println(reloj.baterias);
		System.out.println(reloj.color);
		System.out.println(reloj.correa);
		System.out.println(reloj.inteligente);
		System.out.println(reloj.internet);
		System.out.println(reloj.manecillas);
		System.out.println(reloj.marca);
		System.out.println(reloj.precio);
		System.out.println(reloj.procesador);
		System.out.println(reloj.sensores);
		System.out.println(reloj.year);

	}

}
