package org.jagjeet.ahm.service;

import java.util.List;

import org.jagjeet.ahm.dao.UserDao;
import org.jagjeet.ahm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	@Autowired
	UserDao userDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.service.UserService#isUserAuthentic(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public boolean isUserAuthentic(String userName, String password) {
		if (userDao.isUserAuthentic(userName, password) != null) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.service.UserService#getUser(int)
	 */
	@Override
	@Transactional
	public User getUser(int userId) {
		return userDao.getUser(userId);
	}

	@Override
	@Transactional
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.service.UserService#getUser(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	@Transactional
	public User getUser(String userName, String password) {
		return userDao.getUser(userName, password);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.service.UserService#getUser(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	@Transactional
	public User getUser(String userName, String password, String address, String contactNumber, String qualification) {
		return userDao.getUser(userName, password, address, contactNumber, qualification);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.service.UserService#getAllUser()
	 */
	@Override
	@Transactional
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jagjeet.ahm.service.UserService#updateUser(org.jagjeet.ahm.model.User)
	 */
	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.editUser(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jagjeet.ahm.service.UserService#deleteUser(int)
	 */
	@Override
	@Transactional
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

}
