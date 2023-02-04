package objeto_bebidas;

public class Bebida {
	
	private String nombre;
	private String sabor;
	private String marca;
	private boolean bebible;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor=sabor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public boolean getBebible() {
		return bebible;
	}
	public void setBebible(boolean bebible) {
		this.bebible=bebible;
	}
	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + ", sabor=" + sabor + ", marca=" + marca + ", bebible=" + bebible + "]";
	}
	

}
