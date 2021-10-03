package SobrecargaConstructores;

public class PruebaSobrecargaConstructores {

	public static void main(String[] args) {
		
		MiClase t1 = new MiClase();
		MiClase t2 = new MiClase(28);
		MiClase t3 = new MiClase(15,23);
		MiClase t4 = new MiClase(2,4);

		System.out.println("t1.x:"+ t1.x);
		System.out.println("t2.x:"+ t2.x);
		System.out.println("t3.x:"+ t3.x);
		System.out.println("t4.x:"+ t4.x);
		
		
	}

}
