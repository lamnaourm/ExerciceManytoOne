package com.ismo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.models.Eleve;
import com.ismo.models.Voiture;
import com.ismo.utils.HibernateUtils;

public class DaoEleve implements IDAO<Eleve> {

	@Override
	public List<Eleve> getAll() {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Eleve> eleves = s.createNamedQuery("eq1").list();
		t.commit();
		s.close();
		return eleves;
	}

	@Override
	public Eleve getOne(int code) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		Eleve v = s.get(Eleve.class, code);
		t.commit();
		s.close();
		return v;
	}

	@Override
	public boolean save(Eleve obj) {
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
	public boolean update(Eleve obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.update(obj);
		t.commit();
		s.close();
		return true;
	}

	@Override
	public boolean delete(Eleve obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.delete(obj);
		t.commit();
		s.close();
		return true;
	}
}
