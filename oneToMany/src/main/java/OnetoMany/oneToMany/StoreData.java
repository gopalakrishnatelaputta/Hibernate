package OnetoMany.oneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData 
{
	public static void main(String[] args) 
	{
		
		
	/*Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");*/
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Answer ans1=new Answer();
		ans1.setAnswername("Java is a programming Language");
		ans1.setPostedBy("Gopala Krishna");
		
		Answer ans2=new Answer();
		ans2.setAnswername("Java is platform Independent");
		ans2.setPostedBy("Pawan");
		
		Answer ans3=new Answer();
		ans3.setAnswername("Servlet is an API");
		ans3.setPostedBy("Kamal Raj");
		
		Answer ans4=new Answer();
		ans4.setAnswername("servlet is an Interface");
		ans4.setPostedBy("Nikhil");
		
		ArrayList<Answer>list1=new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<Answer>list2=new ArrayList<>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question que1=new Question();
		que1.setQname("What is Java");
		que1.setAnswers(list1);
		
		Question que2=new Question();
		que2.setQname("What is Servlet");
		que2.setAnswers(list2);
		
		s.persist(que1);
		s.persist(que2);
		
		tx.commit();
		s.close();
		System.out.println("Success");
		
		
		
		
		
	}

}
