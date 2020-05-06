package proyectoEmpresaJpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mx.com.kodikas.dao.DepartamentoJpaController;
import mx.com.kodikas.dao.UsuarioJpaController;
import mx.com.kodikas.jpa.Empleado;
import mx.com.kodikas.jpa.Usuario;

public class ProyectoEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoEmpresaJPA");
		
		try {
			Usuario user = new Usuario();
			user.setUser("bla bla bla");
			user.setPassword("12345");
			
			UsuarioJpaController contUsers = new UsuarioJpaController(emf);
			contUsers.create(user);
			
			Empleado empleado = new Empleado();
			empleado.setNombre("Ramiro");
			empleado.setTelefono("556945");
			emf.close();
		}catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
	}

}
