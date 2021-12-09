import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ismo.dao.DaoEnum;
import com.ismo.dao.DaoFactory;
import com.ismo.dao.IDAO;
import com.ismo.models.Eleve;
import com.ismo.models.Lecon;
import com.ismo.models.Moniteur;
import com.ismo.utils.HibernateUtils;

public class Main {

	public static void main(String[] args) {
		
		IDAO<Eleve> dao = DaoFactory.getDAO(DaoEnum.ELEVE);
		
		

	}

}
