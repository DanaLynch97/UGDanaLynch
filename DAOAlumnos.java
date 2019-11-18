/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.ug.edu.dana.Alumnos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DAOAlumnos {
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
	
	public void crear(Alumnos alumnos) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(alumnos);
		s.getTransaction().commit();
		s.close();
	}
	
	public Alumnos read(long AlumnosID) {
		Session s =  sessionFactory.openSession();
		Alumnos alumnos = s.get(Alumnos.class, AlumnosID);
		s.close();
		return alumnos;
	}
	
	public void update(Alumnos alumnos) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(alumnos);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int AlumnosID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Alumnos alumnos = new Alumnos();
		alumnos.setId(AlumnosID);
		s.delete(alumnos);
		s.getTransaction().commit();
		s.close();
	}
}
