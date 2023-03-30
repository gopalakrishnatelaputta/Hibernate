package hibernateWebApp;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
	public static int register(User u) throws IOException{    
		 int i=0;    
		 Configuration con=new Configuration();
			con.configure("com.cfg.xml");
			SessionFactory sf=con.buildSessionFactory();
     Session session = sf.openSession();  
    
		
		
     Transaction te = session.beginTransaction();  
       

       i=(Integer)((org.hibernate.Session) session).save(u);     
      
    
    te.commit();  
    System.out.println("successfully saved");    
       
     session.close();
	return i;
		  
		

}
}
