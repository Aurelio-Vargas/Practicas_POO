package objeto_pokemon;

public class Main {

	public static void main(String[] args) {
		
		Pokemon pokemon=new Pokemon();
		
		pokemon.setNombre("Pikachu");
		pokemon.setAtaque("Impactrueno");
		pokemon.setColor("Amarillo");
		pokemon.setTipo("Electrico");
		pokemon.setEdad(2);
		
		System.out.println(pokemon.getNombre());
		System.out.println(pokemon.getColor());
		System.out.println(pokemon.getAtaque());
		System.out.println(pokemon.getTipo());
		System.out.println(pokemon.getEdad() + " Años");
		System.out.println();
		
		
		Pokemon pokemon2 = new Pokemon("Charmander","Fuego");
		
		System.out.println(pokemon2.getNombre());
		System.out.println(pokemon2.getTipo());

	}

}
