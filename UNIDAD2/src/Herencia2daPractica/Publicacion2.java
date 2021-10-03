package Herencia2daPractica;

public class Publicacion2 {
	
	private int NumeroDePaginas;
	private float Precio;
	
	public int DimeNumeroDePaginas()
	{
		return NumeroDePaginas;
	}

	public void PonNumeroDePaginas(int NumeroDePaginas)
	{
		this.NumeroDePaginas=NumeroDePaginas;	
	}
	
	public float DimePrecio(){
		return Precio;
		
	}
	
	public void PonPrecio(float Precio)
	{
		this.Precio=Precio;
	}
	
	//para accesar a miembros priv de una clase se usa super.
}//class
