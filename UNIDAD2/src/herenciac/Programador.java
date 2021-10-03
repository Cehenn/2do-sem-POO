package herenciac;

public class Programador extends Empleado{
	
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	
	
	Programador(){
		
	}
	
	Programador(String nombre,String cedula,boolean casado,double salario,int lineas,String lenguajeDominante){
		
		super.nombre=nombre;
		super.cedula=cedula;
		super.casado=casado;
		super.salario=salario;
		
		lineasDeCodigoPorHora=lineas;
		lenguajeDominante=lenguajeDominante;
		
	}

	
	
	
}
