import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.models.Eleve;
import com.ismo.models.Lecon;
import com.ismo.models.Moniteur;
import com.ismo.utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		Session s = HibernateUtils.getSessionFactory().getCurrentSession();
		Transaction t = s.beginTransaction();
			
		List<Lecon> lecons = s.createQuery("From Lecon").list();
		
		for(Lecon m:lecons)
			System.out.println(m);
		
		t.commit();
		s.close();

	}

}
