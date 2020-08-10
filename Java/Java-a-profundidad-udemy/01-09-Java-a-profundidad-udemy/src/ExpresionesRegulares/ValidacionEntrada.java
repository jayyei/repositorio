package ExpresionesRegulares;

public class ValidacionEntrada {

	// en java para escapar los caracteres tendremos que usar doble barra invertida
	// por ejmplo para indicar la barra invertida se ocupa \\\\
	public static boolean validarPrimerNombre(String primerNombre) {
		return primerNombre.matches("[A-Z][a-zA-Z]*");
	}
	
	public static boolean validarApellidoPaterno(String apellidoPaterno) {
		return apellidoPaterno.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	
	public static boolean validarDireccion(String direccion) {
		return direccion.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validarCiudad(String ciudad) {
		return ciudad.matches("([a-zA-Z]+|[a-zA-z]+\\s[a-zA-Z]+)");
	}
	public static boolean validarEstado(String estado) {
		return estado.matches("([a-zA-Z]+|[a-zA-z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean valodarCP(String cp) {
		return cp.matches("\\d{5}");
	}
	
	public static boolean validarTelefono(String telefono) {
		return telefono.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}

}
