package bases_de_datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class conexionBD {
	
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	public conexionBD() {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pedidos", "postgres", "123");
			st = conn.createStatement();
			
			//st.executeUpdate("insert into clientes (clienteid, cedula_ruc, nombrecia, nombrecontacto, direccioncli)"
				//	+ " values (11, '123456789', 'MI NEGOCIO', 'VERONICA VELA', 'A la grande le puse cuca')");
			
			//st.executeUpdate("UPDATE clientes SET nombrecia='LA VERSH' where clienteid=11");
			st.executeUpdate("delete from clientes where clienteid=9");
			
			rs = st.executeQuery("Select * from clientes");
			while(rs.next()) {
				int id = rs.getInt(1);
				String cedula = rs.getString(2);// o getString('nombre_columna")
				String nombrecia = rs.getString(3);
				String nombreContacto = rs.getString(4);
				String direccionCli = rs.getString(5);
				
				System.out.println("id: " + id);
				System.out.println("Cedula: " + cedula);
				System.out.println("nombrecia: " + nombrecia);
				System.out.println("nombre contacto: " + nombreContacto);
				System.out.println("direccionCli " + direccionCli);
				System.out.println();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  conexionBD();
	}

}
