import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.dao.DaoEnum;
import com.ismo.dao.DaoFactory;
import com.ismo.dao.IDAO;
import com.ismo.models.Eleve;
import com.ismo.models.Lecon;
import com.ismo.models.Moniteur;
import com.ismo.models.Voiture;
import com.ismo.utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		
		IDAO<Moniteur> dao = DaoFactory.getDAO(DaoEnum.MONITEUR);
		
		System.out.println(dao.getOne(1).getLecons().size());

	}

}
