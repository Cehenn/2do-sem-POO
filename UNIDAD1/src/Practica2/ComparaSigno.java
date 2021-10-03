package Practica2;

import java.util.Scanner;

public class ComparaSigno {

	private int num;
	private Scanner leer;
	
	public void Inicializar(){
		leer = new Scanner(System.in);
		
		System.out.println("Escribe un número");
		num=leer.nextInt();

	}

	public void DeterminarSigno()
	{
		if (num>0) 
			System.out.println("El número es positivo");
		else 
			if(num<0)
				System.out.println("El número es negativo");
		
	}
	
	public static void main(String[] args) {
		
		ComparaSigno c1;
		c1 = new ComparaSigno();
		c1.Inicializar();
		c1.DeterminarSigno();
		
		
	}
	
}
