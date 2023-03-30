package entityHibernate.HibernateEntityProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class StoreData 
{
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hiernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Employee e1=new Employee();
		e1.setId(101);
		e1.setFirstName("Gopala Krishna");
		e1.setLastName("Telaputta");
		
		session.save(e1);
		t.commit();
		System.out.println("Successfully saved");
		sf.close();
		session.close();
		
	}

}
