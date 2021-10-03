package ExamenDiagnostico;

import java.util.Scanner;

public class Cuenta {
	
	private String titular; 
	private float cantidad;
	
	Scanner teclado = new Scanner(System.in);

	
	Cuenta(double cant,String nombre){
		
		
		
	}
	

	Cuenta(String nombre ,double cant){
	

	}

	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}



	
	public double Ingresar(double cantidad){
	
		System.out.println("Ingrese la cantidad a depositar");
		cantidad=teclado.nextDouble();
		
	if (cantidad>0) {
		cantidad=cantidad+cantidad;
		
	}
	
	
	
	return cantidad;
	}
	
	public double Retirar(double cantidad){
			if (cantidad>0) {
				System.out.println("Ingrese la cantidad a retirar");
				cantidad=teclado.nextDouble();
	}
	else{
		cantidad=0;
	}
	
	
	return cantidad;
	}
	
}



