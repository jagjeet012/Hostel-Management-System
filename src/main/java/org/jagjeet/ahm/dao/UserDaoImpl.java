package org.jagjeet.ahm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jagjeet.ahm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Developer
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#isUserAuthentic(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public User isUserAuthentic(String userName, String password) {
		EntityManager entityManager = getEntityManager();
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("userName"), userName), builder.equal(root.get("password"), password));

		try {
			User user = entityManager.createQuery(criteria).getSingleResult();
			return user;
		} catch (NoResultException e) {

			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#addUser(org.jagjeet.ahm.model.User)
	 */
	@Override
	public int addUser(User user) {
		return (Integer) sessionFactory.getCurrentSession().save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#getUser(int)
	 */
	@Override
	public User getUser(int userId) {
		return sessionFactory.getCurrentSession().get(User.class, userId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#getUser(java.lang.String, java.lang.String)
	 */
	@Override
	public User getUser(String userName, String password) {
		EntityManager entityManager = getEntityManager();
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("userName"), userName), builder.equal(root.get("password"), password));

		User user = entityManager.createQuery(criteria).getSingleResult();
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#getUser(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public User getUser(String userName, String password, String address, String contactNumber, String qualification) {
		EntityManager entityManager = getEntityManager();
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(root);
		criteria.where(builder.equal(root.get("userName"), userName), builder.equal(root.get("password"), password),
				builder.equal(root.get("address"), address), builder.equal(root.get("contactNumber"), contactNumber),
				builder.equal(root.get("qualification"), qualification));

		User user = entityManager.createQuery(criteria).getSingleResult();
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		EntityManager entityManager = getEntityManager();
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> root = criteria.from(User.class);
		criteria.select(root);
		List<User> listOfUser = entityManager.createQuery(criteria).getResultList();

		return listOfUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#editUser(org.jagjeet.ahm.model.User)
	 */
	@Override
	public void editUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.dao.UserDao#deleteUser(int)
	 */
	@Override
	public void deleteUser(int userId) {

		User user = new User();
		user.setUserId(userId);
		sessionFactory.getCurrentSession().delete(userId);
	}

}
