/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.ug.edu.dana.Profesores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author admin
 */
public class DAOProfesores {
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
	
	public void crear(Profesores profesores) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(profesores);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Profesores read(long ProfesoresID) {
		Session s =  sessionFactory.openSession();
		Profesores profesores = s.get(Profesores.class, ProfesoresID);
		s.close();
		return profesores;
	}
	
	protected void update(Profesores profesores) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(profesores);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int ProfesoresID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Profesores profesores = new Profesores();
		profesores.setId(ProfesoresID);
		s.delete(profesores);
		s.getTransaction().commit();
		s.close();
	} 
}
