package com.ismo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.models.Lecon;
import com.ismo.models.Moniteur;
import com.ismo.utils.HibernateUtils;

public class DaoLecon implements IDAO<Lecon> {

	@Override
	public List<Lecon> getAll() {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Lecon> moniteurs = s.createNamedQuery("lq1").list();
		t.commit();
		s.close();
		return moniteurs;
	}

	@Override
	public Lecon getOne(int code) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		Lecon m = s.get(Lecon.class, code);
		t.commit();
		s.close();
		return m;
	}

	@Override
	public boolean save(Lecon obj) {
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
	public boolean update(Lecon obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.update(obj);
		t.commit();
		s.close();
		return true;
	}

	@Override
	public boolean delete(Lecon obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.delete(obj);
		t.commit();
		s.close();
		return true;
	}

}
