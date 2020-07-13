package sanchez.jay.ejerciciosPoo;

public class Alumno {
	private Colegio nombreColegio;
	private String nombreAlumno;
	private double notaMedia;
	private static int numeroAlumno = 1;
	private int nAlumno;
	
	public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia) {
		this.nombreColegio = nombreColegio;
		this.nombreAlumno = nombreAlumno;
		this.notaMedia = notaMedia;
		nAlumno = numeroAlumno;
		numeroAlumno++;
	}
		
		@Override
	public String toString() {
		return "Alumno [nombreColegio=" + nombreColegio.getNombreColegio() + ", nombreAlumno=" + nombreAlumno + ", notaMedia=" + notaMedia
				+ ", nAlumno=" + nAlumno + "]";
	}

		public void setNotaMedia(double notaMedia) {
			this.notaMedia = notaMedia;
		}
		
		public String getNombreColegioAlumno() {
			return this.nombreColegio.getNombreColegio();
		}
		
		public String getNombreAlumno() {
			return nombreAlumno;
		}
	}


