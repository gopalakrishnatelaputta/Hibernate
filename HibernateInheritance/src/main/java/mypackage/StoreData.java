package mypackage;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;  

@SuppressWarnings("deprecation")
public class StoreData 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception{    
     
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		SessionFactory sf=con.buildSessionFactory();
 Session session = sf.openSession();
		
    
    
    Transaction t=session.beginTransaction();    
        
    Employee e1=new Employee();    
    e1.setName("Gaurav Chawla");    
        
    Regular_Employee e2=new Regular_Employee();    
    e2.setName("Vivek Kumar");    
    e2.setSalary(50000);    
    e2.setBonus(5);    
        
    Contract_Employee e3=new Contract_Employee();    
    e3.setName("Arjun Kumar");    
    e3.setPay_per_hour(1000);    
    e3.setContract_Duration("15 hours");    
        
    session.save(e1);    
    session.save(e2);    
    session.save(e3);    
        
    t.commit();    
    session.close();    
    System.out.println("success");    
}    
}    