package mx.com.kodikas.jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-05-01T22:11:16.658-0500")
@StaticMetamodel(Proyecto.class)
public class Proyecto_ {
	public static volatile SingularAttribute<Proyecto, Long> id;
	public static volatile SingularAttribute<Proyecto, String> nombre;
	public static volatile SingularAttribute<Proyecto, Date> fecha;
	public static volatile ListAttribute<Proyecto, Empleado> listaEmpleados;
}
