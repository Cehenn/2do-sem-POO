package SobrecargaConstructores;

public class PruebaAlumnosSemestres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlumnosSemestres n1 = new AlumnosSemestres();
		AlumnosSemestres n2 = new AlumnosSemestres("2do semestre");
		AlumnosSemestres n3 = new AlumnosSemestres(23,"Angela");
		AlumnosSemestres n4 = new AlumnosSemestres("Jonathan","5to semestre",22);
		
		
		System.out.println("Alumno : Oscar Edad: 20 Semestre: "+n1.semestre);
		System.out.println("Alumno : Andrea Edad: 19 Semestre: "+n2.semestre);
		System.out.println("Alumno : " +n3.nombre+" Edad: "+n3.edad+" Semestre: "+n3.semestre);
		System.out.println("Alumno : "+n4.nombre+" Edad: "+n4.edad+" Semestre: "+n4.semestre);
		
		
		
	}

}
