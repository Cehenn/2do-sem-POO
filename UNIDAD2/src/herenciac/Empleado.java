package herenciac;

public class Empleado {

	protected String nombre;
	protected String cedula;
	protected int edad;
	protected boolean casado;
	protected double salario;

	Empleado() {

	}

	Empleado(String nombreapellido, String cedula) {

	}

	public void ClasificacionEdad(int edad) {
		String c="";		

		if (edad >= 21)
			c="Principiante";
		else if (edad >= 22 && edad <= 35)
			c="Intermedio";
		else if (edad < 35)
		c="Senior";

		
		
		System.out.println("/nNombre : "+this.nombre
				+"/nCedula: "+this.cedula
				+"/nEdad: "+this.edad
				+"/nCasado: "+this.casado
				+"/nSalario: "+this.salario);
	}

	public void AumentoSalario(double salario){
		
		int aumento;
		

		
		
	}
	
	
}
