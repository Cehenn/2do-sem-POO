package Herencia2daPractica;

public class TestPeriodico2 {

	
	public static void main(String[] args) {
		Periodico2 MiPeriodico = new Periodico2();
		MiPeriodico.PonNumeroDePaginas(65);
		MiPeriodico.PonFecha("12/6/7");
		MiPeriodico.PonNombre("La voz");
		MiPeriodico.PonPrecio(500);

		
		
		System.out.println("Periodico"+MiPeriodico.DimeNombre());
		System.out.println("Fecha: "+MiPeriodico.DimeFecha());
		System.out.println("Paginas: "+MiPeriodico.DimeNumeroDePaginas());
		System.out.println("Precio: "+MiPeriodico.DimePrecio());
		
		
	}
}//class
