package com.ismo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.models.Lecon;
import com.ismo.models.Voiture;
import com.ismo.utils.HibernateUtils;

public class DaoVoiture implements IDAO<Voiture> {

	@Override
	public List<Voiture> getAll() {
		// TODO Auto-generated method stub
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
			
		List<Lecon> lecons = s.createQuery("From Lecon").list();
		
		for(Lecon m:lecons)
			System.out.println(m);
		
		t.commit();
		s.close();
		return null;
	}

	@Override
	public Voiture getOne(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Voiture obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Voiture obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Voiture obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
