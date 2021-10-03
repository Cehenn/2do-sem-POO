package Herencia2daPractica;

public class Periodico2 extends Publicacion2 {
	
	private String Nombre;
	private String Fecha;
	
	
	public String DimeNombre()
	{
		return Nombre;
	}
	
	public void PonNombre(String Nombre)
	{
		this.Nombre=Nombre;
	}

	public String DimeFecha()
	{
		return Fecha;
	}
	
	public void PonFecha(String Fecha)
	{
	this.Fecha=Fecha;	
	}
	
}//class
