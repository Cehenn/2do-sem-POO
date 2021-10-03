package SobrecargaConstructores;

public class AlumnosSemestres {

	String nombre;
	String semestre;
	int edad;
	
	public AlumnosSemestres(){
	
	semestre="3er semestre";	
	}
	
	
	public AlumnosSemestres(String semestre){
	this.semestre=semestre;
		
	}
	
	public AlumnosSemestres(int edad){
		this.edad=edad;
		semestre="5to semestre";
	}

	public AlumnosSemestres(int edad, String nombre){
		this.nombre=nombre;
		this.edad= edad;
		semestre="4to semestre";
	}
	
	public AlumnosSemestres(String nombre,String semestre,int edad){
		this.semestre=semestre;
		this.nombre = nombre;
		this.edad=edad;
		
	}
	
	
	
	
}
