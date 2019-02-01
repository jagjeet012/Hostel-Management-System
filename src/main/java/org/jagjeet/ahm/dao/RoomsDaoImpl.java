package org.jagjeet.ahm.dao;

import javax.persistence.EntityManager;

import org.jagjeet.ahm.model.HostelRooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Developer
 *
 */
@Repository
public class RoomsDaoImpl implements RoomsDao {

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
	 * @see org.jagjeet.ahm.dao.RoomsDao#getRoom(int)
	 */
	@Override
	public HostelRooms getRoom(int roomId) {
		return sessionFactory.getCurrentSession().get(HostelRooms.class, roomId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.ahm.dao.RoomsDao#appointRoom(org.jagjeet.ahm.model.HostelRooms)
	 */
	@Override
	public int appointRoom(HostelRooms hostelRooms) {
		return (int) sessionFactory.getCurrentSession().save(hostelRooms);
	}

	

}
