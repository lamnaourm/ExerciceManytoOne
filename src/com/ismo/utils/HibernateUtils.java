package com.ismo.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.ismo.models.Eleve;
import com.ismo.models.Lecon;
import com.ismo.models.Moniteur;
import com.ismo.models.Voiture;

public class HibernateUtils {

	private static final SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	
	static {
		Configuration config = new Configuration();
		config.configure();
		
		
		config.addAnnotatedClass(Eleve.class);
		config.addAnnotatedClass(Lecon.class);
		config.addAnnotatedClass(Moniteur.class);
		config.addAnnotatedClass(Voiture.class);
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
