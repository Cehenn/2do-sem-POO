package SobrecargaConstructores;

public class MiClase {

	int x;
	
	MiClase(){
		System.out.println("Dentro de MiClase().");
		x=0;
		
	}
	
	MiClase(int i){
		System.out.println("Dentro de MiClase(int).");
		x=i;	
	}

	MiClase(double d){
		System.out.println("Dentro de MiClase(double).");
		x=(int)d;
	}
	
	MiClase(int i,int j){
		System.out.println("Dentro de MiClase(int,int).");
		x=i*j;
	}
}
