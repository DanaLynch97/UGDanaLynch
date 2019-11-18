/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.ug.edu.dana.MatProf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author admin
 */
public class DAOMatProf {
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
	
	public void crear(MatProf matprof) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(matprof);
		s.getTransaction().commit();
		s.close();
	}
	
	protected MatProf read(long MatProfID) {
		Session s =  sessionFactory.openSession();
		MatProf matprof = s.get(MatProf.class, MatProfID);
		s.close();
		return matprof;
	}
	
	protected void update(MatProf matprof) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(matprof);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int MatProfID) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		MatProf matprof = new MatProf();
		matprof.setIdMateria(MatProfID);
		s.delete(matprof);
		s.getTransaction().commit();
		s.close();
	} 
}
