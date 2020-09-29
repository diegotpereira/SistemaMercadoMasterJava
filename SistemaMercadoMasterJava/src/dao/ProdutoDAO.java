package dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import model.Produto;

public class ProdutoDAO extends GenericDAO {
	
	public Produto buscarPorId(Long id) {
		
		Produto produto = null;
        Session session = null;
        
        try {
        	session = ConexaoHibernate.getSessionFactory().openSession();
        	session.getTransaction().begin();

            Criteria consulta = session.createCriteria(Produto.class);
                                     
            produto = (Produto) consulta.add( Restrictions.eq("id", id)).uniqueResult();

            session.getTransaction().commit();
            session.close();
        } catch ( HibernateException ex) {
            if ( session != null) {
            	session.getTransaction().rollback();
            	session.close();
            }
            throw new HibernateException(ex);
        }
        
        return produto;
    }
}
