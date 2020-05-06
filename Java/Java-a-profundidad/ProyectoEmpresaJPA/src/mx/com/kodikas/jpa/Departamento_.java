package mx.com.kodikas.jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-05-01T22:07:50.450-0500")
@StaticMetamodel(Departamento.class)
public class Departamento_ {
	public static volatile SingularAttribute<Departamento, Long> id;
	public static volatile SingularAttribute<Departamento, String> nombre;
	public static volatile SingularAttribute<Departamento, String> telefono;
	public static volatile ListAttribute<Departamento, Empleado> empleados;
}
