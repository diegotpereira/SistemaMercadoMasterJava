package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericDAO {

	public GenericDAO() {
	
	}
	
	public void inserir(Object obj)  throws HibernateException {
		
		Session session = null;
		
		
		try {
			
			session = ConexaoHibernate.getSessionFactory().openSession();
			session.getTransaction().begin();
			session.save(obj);
			session.getTransaction().commit();
			session.close();
			
			
		} catch (HibernateException ex) {
			// TODO: handle exception
			if ( session != null) {
				session.getTransaction().rollback();
				session.close();
            }
			throw new HibernateException(ex);
		}
	}
	
	

}
