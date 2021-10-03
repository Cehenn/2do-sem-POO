package misClases;


public class Animal {

	private String raza;
	private String nombre;
	private String edad;
	

	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	Animal(){
		
	}
	
	Animal(String _nombre){
		this.nombre=_nombre; // o this.nombre=nombre;
		
	}
	
	
	public void Mostrar()
	{
		System.out.println("Raza: "+raza);
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}
	
	
	
	
}
