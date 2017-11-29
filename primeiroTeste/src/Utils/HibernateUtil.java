package Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import Model.Pessoa;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	private HibernateUtil(){
		
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null){
			try{
				AnnotationConfiguration ac = new AnnotationConfiguration();
				ac.addAnnotatedClass(Pessoa.class);
				sessionFactory = ac.configure().buildSessionFactory();
			}catch (Throwable ex){
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
			return sessionFactory;
		}else{
		return sessionFactory;
	}
	
	}	
}
