package sanchez.jay.ejerciciosPoo;

public class Colegio {
	
	private String nombre;
	private Alumno[] arrayAlumnos;  //Los corchetes que indican que es un arreglo pueden ir al principio o al final
	private int posicionArray = 0;
	
	public Colegio(String nombre, int numAlumnos) {
		this.nombre = nombre;
		arrayAlumnos = new Alumno[numAlumnos];
	}
	
	public String getNombreColegio() {
		return nombre;
	}
	
	private Alumno getAlumno(int nAlumno) {
		return arrayAlumnos[nAlumno];
	}
	
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		Alumno nuevoAlumno = new Alumno(this, nombreAlumno, notaAlumno);
		arrayAlumnos[posicionArray] = nuevoAlumno;
		posicionArray++;
	}
	
	public void expulsarAlumno(String nombreAlumno) {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i] = null;
				}
			}
		}
	}
	
	public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
				}
			}
		}
	}
	
	public void getTodosAlumnos() {
		for(int i=0; i<arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				System.out.println(this.getAlumno(i));
			}
		}
	}
	
	public void getDatosAlumno(String nombreAlumno) {
		for(int i = 0; i < arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					System.out.println(this.getAlumno(i));
					System.out.println();
				}
			}
		}
	}

}
