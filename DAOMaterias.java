/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.ug.edu.dana.Materias;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author admin
 */
public class DAOMaterias {
               protected SessionFactory sessionFactory;
	
	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	public void crear(Materias materias) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(materias);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Materias read(long MateriasID) {
		Session s =  sessionFactory.openSession();
		Materias materias = s.get(Materias.class, MateriasID);
		s.close();
		return materias;
	}
	
	protected void update(Materias materias) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(materias);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int MateriasID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Materias materias = new Materias();
		materias.setId(MateriasID);
		s.delete(materias);
		s.getTransaction().commit();
		s.close();
	} 
}
