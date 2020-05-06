/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasRelacion;

import java.rmi.activation.Activator;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import mx.com.kodikas.tablasRelacion.jpa.Categorias;
import org.eclipse.persistence.config.PersistenceUnitProperties;

/**
 *
 * @author mrjay
 */
public class TablasRelacion {
    
    public static void main(String [] args ){
        
        
    //Nota super importante sobre el problema : no persistence provider for the entityManager
    //Observa bien el orden de tus librerias, primeramente debes de tener persistence.jar, luego el eclipseLink y al final tu driver de jdbc
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("TablasRelacionPU");
        
        EntityManager manager = factory.createEntityManager();
        
        TypedQuery<Categorias> categoriaQuery = 
                manager.createNamedQuery("Categorias.findByCategoriaid", Categorias.class);
        
        categoriaQuery.setParameter("categoriaid", 100);
        
        Categorias categoria = categoriaQuery.getSingleResult();
        
        System.out.println("La categoria "+ categoria.getNombrecat() + " tiene los productos: ");
        
        
        categoria.getProductosCollection()
                .stream()
                .forEach(System.out::println); //Metodos referenciados de las expresiones lambda
        
        categoria.getProductosCollection()
                .stream()
                .forEach((Producto)->System.out.println(Producto.getDescripcion()));
    }
}
