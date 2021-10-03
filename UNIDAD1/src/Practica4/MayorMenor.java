package Practica4;

import java.util.Scanner;

public class MayorMenor {

	private Scanner leer;
	
	public void cargarValores(){
		
		leer= new Scanner(System.in);
		
		System.out.println("Ingrese el primer valor");
		int valor1=leer.nextInt();
		System.out.println("Ingrese el segundo valor");
		int valor2=leer.nextInt();
		System.out.println("Ingrese el tercer valor");
		int valor3=leer.nextInt();
		
		int mayor,menor;
	
		mayor = calcularMayor(valor1,valor2,valor3); //se mandan valores al metodo calcular
		menor = calcularMenor(valor1,valor2,valor3);
		
		System.out.println("El valor mayor " + mayor );
		System.out.println("El valor menor " + menor );
	
		
		
	}
	
	public int calcularMayor(int u1,int u2, int u3){ // si se cambia el modificador de acceso a private no se ve en el main de otra pagina 
		
		int m;
		if(u1>u2&&u1>u3)
			m=u1;
		else
			if(u2>u3)
				m=u2;
			else
				m=u3;
		return m;
	}
	
	public int calcularMenor(int u1,int u2, int u3){
		int m = 0;
		if(u1<u2&&u1<u3)
			m=u1;
		else
			if(u2<u3)
				m=u3;
			return m;
			
	}
	
	
				
		
	}


