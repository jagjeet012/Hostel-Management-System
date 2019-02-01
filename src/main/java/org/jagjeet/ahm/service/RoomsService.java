package org.jagjeet.ahm.service;

import org.jagjeet.ahm.model.HostelRooms;

/**
 * @author Developer
 *
 */
public interface RoomsService {
	
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
