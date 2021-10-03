package PracticaSemaforo;

public class PruebaSemaforo {

	public static void main(String[] args) {		
		Semaforo MiSemaforo = new Semaforo();
		Semaforo OtroSemaforo = new Semaforo();
		
		MiSemaforo.PonColor("Rojo");
		OtroSemaforo.PonColor("Verde");
		
		System.out.println("Objeto: MiSemaforo su color "+MiSemaforo.DimeColor());
		System.out.println("Objeto: OtroSemaforo su color "+OtroSemaforo.DimeColor());
		
		if(MiSemaforo.DimeColor().equals("Rojo"))
			System.out.println("MiSemaforo: No Pasar ");
		
		if(OtroSemaforo.DimeColor().equals("Verde")) //Para que funcione con mayusculas o minusculas 
													 //se usa .equalsIgnoresCase
			
			System.out.println("OtroSemaforo: Pasar ");
		
	}//Main 
}
