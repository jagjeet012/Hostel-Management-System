package org.jagjeet.ahm.dao;

import javax.persistence.EntityManager;

import org.jagjeet.ahm.model.FeePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Developer
 *
 */
@Repository
public class FeeDaoImpl implements FeeDao {
	
	/**
	 * 
	 */
	@Autowired
	org.hibernate.SessionFactory sessionFactory;

	/**
	 * @return
	 */
	private EntityManager getEntityManager() {
		return sessionFactory.getCurrentSession().getEntityManagerFactory().createEntityManager();
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.ahm.dao.FeeDao#depositFee(org.jagjeet.ahm.model.FeePayment)
	 */
	@Override
	public int depositFee(FeePayment feePayment) {
		return (int) sessionFactory.getCurrentSession().save(feePayment);
	}

}
