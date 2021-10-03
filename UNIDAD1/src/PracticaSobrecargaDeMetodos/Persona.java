package PracticaSobrecargaDeMetodos;

public class Persona {

	private int idPersona;
	private String nombre;
	private int edad;
	private String genero;
	

	public Persona(){
//		idPersona =0;
//		nombre ="";
//		edad = 0;
//		genero = "";
	}
	
	public Persona(int idPersona, String nombre, int edad) {
		this.idPersona=idPersona;
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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
	public void setEdad(int valor) {
		
		if(valor<55)
		{
		this.edad = valor;
		}
		else{
			System.out.println("La edad debe de ser menor de 55 años");
		}
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String valor) { //
		if(valor.equals("F")|valor.equals("M")) {
			this.genero = valor;
			}
		else
		{
			System.out.println("El género debe ser F o M");
		}
		
	}
	


	}
	
	
