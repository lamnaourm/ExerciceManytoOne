package com.ismo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.models.Lecon;
import com.ismo.models.Moniteur;
import com.ismo.models.Voiture;
import com.ismo.utils.HibernateUtils;

public class DaoVoiture implements IDAO<Voiture> {

	@Override
	public List<Voiture> getAll() {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Voiture> voitures = s.createNamedQuery("vq1").list();
		t.commit();
		s.close();
		return voitures;
	}

	@Override
	public Voiture getOne(int code) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		Voiture v = s.get(Voiture.class, code);
		t.commit();
		s.close();
		return v;
	}

	@Override
	public boolean save(Voiture obj) {
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
	public boolean update(Voiture obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.update(obj);
		t.commit();
		s.close();
		return true;
	}

	@Override
	public boolean delete(Voiture obj) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
		s.delete(obj);
		t.commit();
		s.close();
		return true;
	}
}
