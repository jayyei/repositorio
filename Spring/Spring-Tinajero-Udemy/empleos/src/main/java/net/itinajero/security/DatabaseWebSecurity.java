package net.itinajero.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity //Esta anotacion habilita la seguridad de spring
public class DatabaseWebSecurity extends WebSecurityConfigurerAdapter{ //Esta clase provee los metodos para configurar nuestro security


	@Autowired
	private DataSource dataSource;
	
	/*Esta configuracion se utilizo con un sistema de tablas por defecto que utiliza spring
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
		auth.jdbcAuthentication().dataSource(dataSource);
	}*/
	
	/*Esta es la configuracion de configure que permite extraer a los usuarios de tablas distintas
	 * de las default*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery("SELECT username, password, estatus FROM usuarios WHERE username=?")
			.authoritiesByUsernameQuery("select u.username, p.perfil from usuarioperfil up "
					+ "INNER JOIN usuarios u on u.id = up.idUsuario "
					+ "INNER JOIN perfiles p on p.id = up.idPerfil "
					+ "WHERE u.username = ? ");
	}
	
	//There is no PasswordEncoder mapped for the id "null"
	//Si las contraseñas no estan encriptadas, se debera de agregar el prefijo {noop}
	
	/*Este metodo configure se utiliza para no permitir el acceso a distintas urls
	 * 
	 */
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		//Los recursos estaticos no requieren autenticacion
		.antMatchers(
				"/bootstrap/**",
				"/images/**",
				"/tinymce/**",
				"/logos/**"
				).permitAll()
		// Las vistas publicas no requieren autenticacion
		.antMatchers(
				"/",
				"/search",
				"/usuarios/create",
				"/usuarios/save",
				"/vacantes/view/**"
				).permitAll()
		//Asignar permisos a URLS por roles
		.antMatchers("/vacantes/**").hasAnyAuthority("SUPERVISOR", "ADMINISTRADOR")
		.antMatchers("/categorias/**").hasAnyAuthority("SUPERVISOR", "ADMINISTRADOR")
		.antMatchers("/usuarios/**").hasAnyAuthority("ADMINISTRADOR")
		// Todas las demas URls de la aplicacion requieren autenticacion
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/login").permitAll();
	}
	
	//Spring al detectar un bean de este tipo (PasswordEncoder) asume que las contraseñas a leer en la bd seran encriptadas
	@Bean //Se utiliza para crear una instancia de tipo Password enconder, al ser una forma de instancia, se anota @Bean para que spring sepa que es una implementacion y pueda utilizarla cuando sera necesario
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
