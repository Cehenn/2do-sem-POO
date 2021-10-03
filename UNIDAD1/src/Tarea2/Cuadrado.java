package Tarea2;

import java.util.Scanner;

public class Cuadrado {

	private Scanner teclado;
	int lados;
	
	public void ValorLados() {

		teclado = new Scanner(System.in);
		System.out.println("Ingresa el valor de sus lados:");
		lados = teclado.nextInt();

	}

	public void Perimetro() {

		int perimetro = lados * 4;
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	}

	public void Superficie() {
		int superficie = lados * lados;
		System.out.println("La superficie del cuadrado es: " + superficie);

	}


	public static void main(String[] args) {

		Cuadrado cuadrado1;
		cuadrado1 = new Cuadrado();
		cuadrado1.ValorLados();
		cuadrado1.Perimetro();
		cuadrado1.Superficie();
		

	}
}
