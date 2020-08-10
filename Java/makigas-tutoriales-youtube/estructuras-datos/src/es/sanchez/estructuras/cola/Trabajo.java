package es.sanchez.estructuras.cola;

public class Trabajo {

	private String titulo;
	
	private String autor;
	
	private boolean impreso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isImpreso() {
		return impreso;
	}

	public void setImpreso(boolean impreso) {
		this.impreso = impreso;
	}

	public Trabajo(String titulo, String autor, boolean impreso) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.impreso = impreso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trabajo [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", impreso=");
		builder.append(impreso);
		builder.append("]");
		return builder.toString();
	}
	
	
}
