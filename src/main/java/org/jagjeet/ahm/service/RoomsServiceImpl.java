package org.jagjeet.ahm.service;

import org.jagjeet.ahm.dao.RoomsDao;
import org.jagjeet.ahm.model.HostelRooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class RoomsServiceImpl implements RoomsService {

	/**
	 * 
	 */
	@Autowired
	RoomsDao roomsDao;

	/* (non-Javadoc)
	 * @see org.jagjeet.ahm.service.RoomsService#getRoom(int)
	 */
	@Override
	@Transactional
	public HostelRooms getRoom(int roomId) {
		return roomsDao.getRoom(roomId);
	}

	/* (non-Javadoc)
	 * @see org.jagjeet.ahm.service.RoomsService#appointRoom(org.jagjeet.ahm.model.HostelRooms)
	 */
	@Override
	@Transactional
	public int appointRoom(HostelRooms hostelRooms) {
		return roomsDao.appointRoom(hostelRooms);
	}

}
