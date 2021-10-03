package Tarea1;

import java.util.Scanner;

public class Punto {

	private Scanner leer = new Scanner(System.in);
	
	private int x,y;
	
	public void PedirCoordenadas(){
		
		System.out.println("Ingresa la coordenada de x: ");
		x=leer.nextInt();
		System.out.println("Ingresa la coordenada de y: ");
		y=leer.nextInt();
		
		
	}
	
	
	public void MostrarCuadrante(){
	if(x>0 && y > 0 )
		System.out.println("Se encuentra en el primer cuadrante");
	
	else 
		if(x<0 && y >0)
			System.out.println("Se encuentra en el segundo cuadrante");
		else 
			if(x<0 && y < 0)
				System.out.println("Se encuentra en el tercer cuadrante");
			else 
				System.out.println("Se encuentra en el cuarto cuadrante");
}

	public static void main(String[] args) {
		
		Punto Punto1;
		Punto1 = new Punto();
		Punto1.PedirCoordenadas();
		Punto1.MostrarCuadrante();
		
		
		
		
	}
	
	
}


