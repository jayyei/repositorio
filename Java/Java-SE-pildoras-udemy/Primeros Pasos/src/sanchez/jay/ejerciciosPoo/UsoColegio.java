package sanchez.jay.ejerciciosPoo;

public class UsoColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Colegio SanJavier = new Colegio("San Javier", 3);
		Colegio Cervantes = new Colegio("Cervantes", 2);
		
		SanJavier.nuevoAlumno("Juan", 8);
		SanJavier.nuevoAlumno("Sara", 9);
		
		SanJavier.getTodosAlumnos();
	}

}
