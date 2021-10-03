package PracticaSobrecargaDeMetodos;

public class EstadoDeNacimiento {

	private int acumuladorestado;
	private String estado;
	private String nombre;
	private int edad;
	
	public EstadoDeNacimiento(){
		
	}
	
	public EstadoDeNacimiento(String estado ,int edad){
	this.estado=estado;
	this.edad=edad;
		
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void Suma(String estado)
	{
		

	}
	
	
}
