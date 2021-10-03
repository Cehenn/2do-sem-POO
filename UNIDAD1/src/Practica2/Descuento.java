package Practica2;

import java.util.Scanner;

public class Descuento {

	private Scanner leer;
	private double compratotal;
	private double totalneto;
	private double descuento;

	public void PedirTotal() {
		leer = new Scanner(System.in);
		System.out.println("Ingresa el total de la compra: ");
		compratotal = leer.nextDouble();

	}

	public void DeterminarDescuento(){
		
		
		
		if(compratotal>480 && compratotal<600){
			System.out.println("\nAplica descuento de 12%");
			descuento= compratotal * .12;
			compratotal=compratotal - descuento;
		}
	else
		if(compratotal>=800){
			System.out.println("\nAplica descuento de 24%");
			descuento = compratotal * .24;
			totalneto=compratotal - descuento;
		}else
			System.out.println("No aplica descuento");
			
}
	
	public void MostrarTotalNeto(){
		
		System.out.println("\nTotal de la compra : "+compratotal);
		System.out.println("Ahorras : "+descuento);
		System.out.println("Total Neto: "+totalneto);
		
	}
	
	public static void main(String[] args) {
		
		Descuento d1;
		d1 = new Descuento();
		
		d1.PedirTotal();
		d1.DeterminarDescuento();
		d1.MostrarTotalNeto();
		
		
	}

}
