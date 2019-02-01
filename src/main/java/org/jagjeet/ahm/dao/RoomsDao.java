package org.jagjeet.ahm.dao;

import org.jagjeet.ahm.model.HostelRooms;

/**
 * @author Developer
 *
 */
public interface RoomsDao {

	/**
	 * @param hostelRooms
	 * @return
	 */
	public int appointRoom(HostelRooms hostelRooms);
	
	/**
	 * @param roomId
	 * @return
	 */
	public HostelRooms getRoom(int roomId);

}
