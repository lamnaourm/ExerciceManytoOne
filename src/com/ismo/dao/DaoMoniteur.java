package com.ismo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.ismo.models.Moniteur;
import com.ismo.utils.HibernateUtils;

public class DaoMoniteur implements IDAO<Moniteur>{

	@Override
	public List<Moniteur> getAll() {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Moniteur> moniteurs = s.createNamedQuery("mq1").list();
		t.commit();
		s.close();
		return moniteurs;
	}

	@Override
	public Moniteur getOne(int code) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		Moniteur m = s.get(Moniteur.class, code);
		t.commit();
		s.close();
		return m;
	}

	@Override
	public boolean save(Moniteur obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		
		Integer res = (Integer) s.save(obj); 
		
		t.commit();
		s.close();
		if(res!=null)
			return true;
		return false;
	}

	@Override
	public boolean update(Moniteur obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.update(obj);
		t.commit();
		s.close();
		return true;
	}

	@Override
	public boolean delete(Moniteur obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.delete(obj);
		t.commit();
		s.close();
		return true;
	}

}
