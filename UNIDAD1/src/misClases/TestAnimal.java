package misClases;

public class TestAnimal {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		
		Animal a2 = new Animal("Michi");
		

		a1.setNombre("Terry ");
		a1.setEdad("2 años");
		a1.setRaza("Chihuahua");
		a1.Mostrar();
		System.out.println("\n");
		a2.setEdad("8 meses");
		a2.setRaza("Pastor aleman");
		a2.Mostrar();
	
	}

}
