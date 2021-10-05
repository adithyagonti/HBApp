
	import java.io.Serializable;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	
	public class Test_Save {

		public static void main(String[] args) {
			
			Configuration cfg=new Configuration();
			cfg.configure("account.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			Account account= new Account();
			account.setAccountNumber(12764382);
			account.setAccountName("Adithya");
			account.setInitialAmount(20000);
			account.setCity("Karimnagar");
			
			Serializable result = session.save(account);  //Prepare insert query
			System.out.println("result="+result);
			
			System.out.println("Object saved into DB successfully");
			tx.commit();
			session.close();
			factory.close();
		}
		
	}


