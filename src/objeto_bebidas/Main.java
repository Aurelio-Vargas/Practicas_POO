package objeto_bebidas;

public class Main {

	public static void main(String[] args) {
		Bebida bebida=new Bebida();
		
		bebida.setNombre("Pepsi");
		bebida.setMarca("Pepsico");
		bebida.setSabor("Cola");
		bebida.setBebible(true);
		
		System.out.println(bebida);

	}

}
