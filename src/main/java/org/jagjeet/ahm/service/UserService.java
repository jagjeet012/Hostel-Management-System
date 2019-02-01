package org.jagjeet.ahm.service;

import java.util.List;

import org.jagjeet.ahm.model.User;

/**
 * @author Developer
 *
 */
/**
 * @author Developer
 *
 */
/**
 * @author Developer
 *
 */
public interface UserService {

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	boolean isUserAuthentic(String userName, String password);

	/**
	 * @param userId
	 * @return
	 */
	public User getUser(int userId);

	/**
	 * @param user
	 * @return
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	User getUser(String userName, String password);

	/**
	 * @param userName
	 * @param password
	 * @param address
	 * @param contactNumber
	 * @param qualification
	 * @return
	 */
	User getUser(String userName, String password, String address, String contactNumber, String qualification);

	/**
	 * @return
	 */
	public List<User> getAllUser();

	/**
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * @param userId
	 */
	public void deleteUser(int userId);

}
