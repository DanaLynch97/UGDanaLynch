/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.ug.edu.dana.AproRepro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author admin
 */
public class DAOAprorepro {
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
	
	public void crear(AproRepro aprorepro) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(aprorepro);
		s.getTransaction().commit();
		s.close();
	}
	
	protected AproRepro read(long AproReproID) {
		Session s =  sessionFactory.openSession();
		AproRepro alumnos = s.get(AproRepro.class, AproReproID);
		s.close();
		return alumnos;
	}
	
	protected void update(AproRepro aprorepro) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(aprorepro);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int AproReproID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		AproRepro aprorepro = new AproRepro();
		aprorepro.setIdAlumno(AproReproID);
		s.delete(aprorepro);
		s.getTransaction().commit();
		s.close();
	}
}
