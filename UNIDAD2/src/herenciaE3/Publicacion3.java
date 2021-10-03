package herenciaE3;

class Publicacion3{
	
private int NumeroDePaginas;
private float precio;

public Publicacion3()
{
NumeroDePaginas=0;
precio=0f;
}




public Publicacion3(int NumeroDepaginas)
{
PonNumeroDePaginas(NumeroDePaginas);

}

public Publicacion3(float precio)
{
PonPrecio(precio);
}

public Publicacion3(int NumeroDePaginas , float precio)
{
this(NumeroDePaginas);
PonPrecio(precio);
}

public Publicacion3(float precio , int NumeroDePaginas)
{
this(NumeroDePaginas,precio);
}

public int DimeNumeroDePaginas(int NumeroDePaginas)
{
return NumeroDePaginas;
}


public void PonNumeroDePaginas(int NumeroDePaginas)
{
	this.NumeroDePaginas=NumeroDePaginas;
	
}
public float DimePrecio()
{
return precio;
}

public void PonPrecio(float precio){
	this.precio=precio;
}













}



