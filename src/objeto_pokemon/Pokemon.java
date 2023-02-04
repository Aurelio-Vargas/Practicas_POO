package objeto_pokemon;

public class Pokemon {

	private String nombre;
	private String tipo;
	private String ataque;
	private String color;
	private int edad;
	
	public Pokemon() {}
	
	public Pokemon(String nombre, String tipo, String ataque, String color, int edad) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.ataque=ataque;
		this.color=color;
		this.edad=edad;
	}
	 public Pokemon(String nombre,String tipo) {
		 this.nombre=nombre;
		 this.tipo=tipo;
	 }
	 public String getNombre() {
		 return this.nombre;
	 }
	 public void setNombre(String nombre) {
		 this.nombre=nombre;
	 }
	 public String getTipo() {
		 return this.tipo;
	 }
	 public void setTipo(String tipo) {
		 this.tipo=tipo;
	 }
	 public String getAtaque() {
		 return this.ataque;
	 }
	 public void setAtaque(String ataque){
		 this.ataque=ataque;
	 }
	 public String getColor () {
		 return this.color;
	 }
	 public void setColor(String color) {
		 this.color=color;
	 }
	 public int getEdad() {
		 return this.edad;
	 }
	 public void setEdad(int edad) {
		 this.edad=edad;
	 }
	

	
}
