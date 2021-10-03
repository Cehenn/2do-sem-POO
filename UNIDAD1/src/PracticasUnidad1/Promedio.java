package PracticasUnidad1;

import java.util.Scanner;

public class Promedio {
	
	private float promedio;
	private float calificacion=0;
	
	static Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		Promedio p1 = new Promedio();
		p1.PedirCalificaciones();
	
	}

	
	public void PedirCalificaciones()
	{ 
		
		
		for (int i = 0; i <3 ; i++) 
		{
			
			System.out.println("Calificación "+(i+1)+" :");
			calificacion=leer.nextInt()+calificacion;
			
		}
		promedio=calificacion/3;
		
		
		
		System.out.println("El promedio es :"+promedio);
		
		
	}
}


