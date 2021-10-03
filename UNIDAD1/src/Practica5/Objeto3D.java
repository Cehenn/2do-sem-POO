package Practica5;

import java.util.Scanner;

public class Objeto3D {
	
	
private double X;
private double Y;
private double Z;
private String Medida;

private Scanner leer = new Scanner(System.in);

private String TipoMedida = "centimetros";

public void Dimensiones3D(double Ancho, double Alto, double Profundo){
	X=Ancho;
	Y=Alto;
	Z=Profundo;
	
}

public void TipoMedida(String Medida){
	TipoMedida=Medida;
}

public void Dimensiones(double Ancho, double Alto, double Profundo, String Medida){
	Dimensiones3D(Ancho,Alto,Profundo);
	TipoMedida(Medida);
}

public void Dimensiones(String Medida, double Ancho, double Alto, double Profundo){
	Dimensiones(Ancho,Alto,Profundo,Medida);
}

public void Dimensiones(double Ancho,String Medida,double Alto,double Profundo){
	Dimensiones(Ancho,Alto,Profundo,Medida);
}

public void Dimensiones(double Ancho,double Alto,double Profundo){
	Dimensiones(Ancho,Alto,Profundo);
}


public String DimeMedida(String Medida) {
	this.Medida = Medida;
	
	return Medida;
}

public double DimeAlto(double Alto) {
	this.Y = Alto;
	
	return Alto;
}






}
