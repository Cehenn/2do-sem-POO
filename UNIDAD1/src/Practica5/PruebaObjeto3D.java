package Practica5;

public class PruebaObjeto3D {

	public static void main(String[] args) {
		
		Objeto3D Caja = new Objeto3D();// Crea objetos
		Objeto3D Esfera = new Objeto3D();//Constructores
		Objeto3D Bicicleta = new Objeto3D();

		Caja.Dimensiones(20,12.5,30.2,"centímetros");
		Esfera.Dimensiones(100,"pulgadas",10.0,10.0);
		Bicicleta.Dimensiones(95.0,30.0,20.0,"centimetros");
		
		
		
		System.out.println("Objeto Bicicleta:"+Bicicleta.DimeMedida("Metros"));
		System.out.println("Objeto Bicicleta:"+Bicicleta.DimeAlto(1.4));
		
		Bicicleta.Dimensiones(100,300,230);
		System.out.println("Objeto Bicicleta:"+Bicicleta.DimeMedida("Centimetros "));
		System.out.println("Objeto Bicicleta:"+Bicicleta.DimeAlto(103));
		
	}

}
