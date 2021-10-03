package PracticaSobrecargaDeMetodos;

public class TestPersona {

	public static void main(String [] arreglo) {
		
		Persona p1 = new Persona(22,"Marcos",12);
		Persona p3 = new Persona(33,"Lucia",34);
		Persona p4 = new Persona();
		
		p1.setGenero("M");
		
		p4.setGenero("M");
		p4.setEdad(32);
		p4.setNombre("Antonio");
		p4.setIdPersona(121);
		
		p3.setGenero("F");
		
		
		System.out.println(p1.getIdPersona()+ " " + p1.getNombre()+ " "
				+p1.getEdad()+" "+p1.getGenero());

		System.out.println(p4.getIdPersona()+ " " + p4.getNombre()+ " "
				+p4.getEdad()+" "+p4.getGenero());

		System.out.println(p3.getIdPersona()+ " " + p3.getNombre()+ " "
				+p3.getEdad()+" "+p3.getGenero());

	}

}
