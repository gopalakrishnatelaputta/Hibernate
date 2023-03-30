package Onetoonemap.OneToOne_Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		
		Question q1=new Question();
		q1.setQuestion("What is Java");
		q1.setQuestion_id(1212);
		
		Answer answer=new Answer();
		answer.setAnswer_id(343);
		answer.setAnswer("Java is a Programming Language");
		
		Question q2=new Question();
		q2.setQuestion("What is Hibernate");
		q2.setQuestion_id(12);
		
		Answer answer1=new Answer();
		answer1.setAnswer_id(345);
		answer1.setAnswer("Hibernate is Framework");
		
		q1.setAnswer(answer);
		q2.setAnswer(answer1);
	
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		session.save(q1);
		session.save(q2);
		session.save(answer1);
		session.save(answer);
		
		t.commit();
		session.close();
	}
}
