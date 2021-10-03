package PracticasUnidad1;

import java.util.Scanner;

public class Triangulo {

	private Scanner entrada;
	private int lado1, lado2, lado3;

	public void definir_lados() {
		entrada = new Scanner(System.in);

		System.out.println("Introduzca lado 1: ");
		lado1 = entrada.nextInt();

		System.out.println("Introduzca lado 2: ");
		lado2 = entrada.nextInt();

		System.out.println("Introduzca lado 3: ");
		lado3 = entrada.nextInt();
	}

	public void tipo_triangulo() {
		if (lado1 == lado2 && lado1 == lado3)
			System.out.println("Es un triangulo Equilatero");
		else if (lado1 == lado2 | lado2 == lado3 | lado1 == lado3)
			System.out.println("Es un triangulo Isoceles");
		else
			System.out.println("Es un triangulo escaleno");
	}

	public void perimetro() {
		System.out.println("El perimetro del triangulo es: " + (lado1 + lado2 + lado3) + " metros");
	}
	
	
	public static void main(String[] args) {
		
		Triangulo triangulo1;
		triangulo1 = new Triangulo();
		triangulo1.definir_lados();
		triangulo1.tipo_triangulo();
		triangulo1.perimetro();
		
		
	}

}
