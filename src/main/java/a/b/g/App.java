package a.b.g;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee eo=new Employee();
        eo.setFname("rohan");
        eo.setLname("kumar");
        eo.setPassword("web123");
        eo.setEmail("Rohan@gmail.com");
        eo.setCountry("Japan");
        
        Address ao=new Address();
        ao.setCity("Mumbai");
        ao.setState("Maharashtra");
  
        
        eo.setA(ao);
        
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.save(eo);
        s.getTransaction().commit();
        
    }
}
