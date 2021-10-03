package PracticaSemaforo;

public class Semaforo {
	
	String EstadoSemaforo = "Rojo";
	
	public void PonColor(String Color)
	{
		
		EstadoSemaforo=Color;
		
	}
	
	public String DimeColor(){
		
		return EstadoSemaforo;
	}
	
	
} //Fin class Semaforo
