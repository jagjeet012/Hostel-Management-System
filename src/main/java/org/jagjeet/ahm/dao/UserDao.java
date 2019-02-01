package org.jagjeet.ahm.dao;

import java.util.List;

import org.jagjeet.ahm.model.User;

/**
 * @author Developer
 *
 */
public interface UserDao {
	
	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public User isUserAuthentic(String userName, String password);
	
	/**
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * @param userId
	 * @return
	 */
	public User getUser(int userId);
	
	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	public User getUser(String userName, String password);
	
	/**
	 * @param userName
	 * @param password
	 * @param address
	 * @param contactNumber
	 * @param qualification
	 * @return
	 */
	public User getUser(String userName, String password, String address, String contactNumber, String qualification);

	/**
	 * @return
	 */
	public List<User> getAllUser();
	
	/**
	 * @param user
	 */
	public void editUser(User user);
	
	/**
	 * @param userId
	 */
	public void deleteUser(int userId);

}
