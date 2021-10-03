package Practica4;

import java.util.Scanner;

public class SueldoMayorMenor {
	private Scanner leer;

	public void PedirSueldos() {

		leer = new Scanner(System.in);
		int sueldomayor, sueldomenor;

		System.out.println("Ingrese el primer sueldo");
		int sueldo1 = leer.nextInt();
		System.out.println("Ingrese el segundo sueldo");
		int sueldo2 = leer.nextInt();
		System.out.println("Ingrese el tercer sueldo");
		int sueldo3 = leer.nextInt();

		sueldomayor = CalcularSueldoMayor(sueldo1, sueldo2, sueldo3); 
		sueldomenor = CalcularSueldoMenor(sueldo1, sueldo2, sueldo3);

		System.out.println("El sueldo mayor " + sueldomayor);
		System.out.println("El sueldo menor " + sueldomenor);

	}
	

	private int CalcularSueldoMayor(int s1, int s2, int s3) { 

		int suelmayor;

		if (s1 > s2 && s1 > s3)
			suelmayor = s1;
		else if (s2 > s3)
			suelmayor = s2;
		else
			suelmayor = s3;
		return suelmayor;
	}

	private int CalcularSueldoMenor(int s1, int s2, int s3) {
		int suelmenor = 0;

		if (s1 < s2 && s1 < s3)
			suelmenor = s1;
		
		else if (s2 < s3)
			suelmenor = s3;
		return suelmenor;

	}

}
