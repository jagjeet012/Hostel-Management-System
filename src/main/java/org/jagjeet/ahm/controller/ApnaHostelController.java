package org.jagjeet.ahm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.jagjeet.ahm.model.FeePayment;
import org.jagjeet.ahm.model.HostelRooms;
import org.jagjeet.ahm.model.User;
import org.jagjeet.ahm.service.FeeService;
import org.jagjeet.ahm.service.RoomsService;
import org.jagjeet.ahm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Developer
 *
 */
@Controller
public class ApnaHostelController {

	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * 
	 */
	@Autowired
	private HostelRooms hostelRooms;

	/**
	 * 
	 */
	@Autowired
	private RoomsService roomService;

	@Autowired
	private FeePayment feePayment;

	/**
	 * 
	 */
	@Autowired
	private FeeService feeService;

	/**
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm(@ModelAttribute("user") User user) {
		return "login";
	}

	/**
	 * @param user
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateLoginForm(@ModelAttribute("user") @Valid User user, BindingResult result, Map model,
			HttpServletRequest request) {

		if (result.hasErrors() || !userService.isUserAuthentic(user.getUserName(), user.getPassword())) {
			model.put("errorMessage", "Please enter correct information !!");
			return "login";
		}

		user = userService.getUser(user.getUserName(), user.getPassword());

		if (user.getRole() == 1) {
			model.put("userId", user.getUserId());
			model.put("userName", user.getUserName());
			model.put("password", user.getPassword());
			model.put("address", user.getAddress());
			model.put("contactNumber", user.getContactNumber());
			model.put("qualification", user.getQualification());
			return "student";
		}

		if (user.getRole() == 2) {
			model.put("userId", user.getUserId());
			model.put("userName", user.getUserName());
			model.put("password", user.getPassword());
			model.put("address", user.getAddress());
			model.put("contactNumber", user.getContactNumber());
			model.put("qualification", user.getQualification());
			return "employee";
		}

		List<User> userList = new ArrayList<>();
		userList = userService.getAllUser();

		HttpSession session = request.getSession();

		session.setAttribute("userList", userList);
		
		return "admin";
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterForm(@ModelAttribute("user") User user) {
		return "registration";
	}

	/**
	 * @param user
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String validateRegistrationForm(@ModelAttribute("user") @Valid User user, BindingResult result, Map model) {
		if (result.hasErrors()) {
			model.put("errorMessage", "Please enter correct information !!");
			return "registration";
		}
		int userId = userService.addUser(user);
		model.put("userId", userId);
		return "login";
	}

//	@RequestMapping(value = "/studentPage", method = RequestMethod.POST)
//	public String showStudentPage(@RequestParam(value = "userId", required = true) Integer userId,
//			@RequestParam(value = "userName", required = true) String userName,
//			@RequestParam(value = "password", required = true) String password,
//			@RequestParam(value = "address", required = true) String address,
//			@RequestParam(value = "contactNumber", required = true) String contactNumber,
//			@RequestParam(value = "qualification", required = true) String qualification) {
//
//		User user = userService.getUser(userId);
//		User user1 = userService.getUser(userName, password, address, contactNumber, qualification);
//		
//		user.setUserId(userId);
//		user1.setUserName(userName);
//		user1.setPassword(password);
//		user1.setAddress(address);
//		user1.setContactNumber(contactNumber);
//		user1.setQualification(qualification);
//		
//		return "student";
//	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/adminRoom", method = RequestMethod.GET)
	public String showRoomAppointForm(@ModelAttribute("user") User user) {
		return "appointRoom";
	}

	/**
	 * @param userId
	 * @param roomNumber
	 * @param noOfStudent
	 * @return
	 */
	@RequestMapping(value = "/appointRoom", method = RequestMethod.POST)
	public String appointRoom(@RequestParam(value = "userId", required = true) Integer userId,
			@RequestParam(value = "roomNumber", required = true) Integer roomNumber,
			@RequestParam(value = "noOfStudent", required = true) Integer noOfStudent) {

		User user = userService.getUser(userId);

		hostelRooms.setUser(user);
		hostelRooms.setRoomNumber(roomNumber);
		hostelRooms.setNoOfStudent(noOfStudent);

		int roomId = roomService.appointRoom(hostelRooms);

		return "admin";
	}

	/**
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/feeDeposit", method = RequestMethod.GET)
	public String showFeePaymentForm(@ModelAttribute("user") User user, Map model) {

		model.put("userId", user.getUserId());
		model.put("feeName", user.getUserName());

		return "fee";
	}

	/**
	 * @param feeAmount
	 * @param dueFee
	 * @return
	 */
	@RequestMapping(value = "/fee", method = RequestMethod.POST)
	public String feePayment(@RequestParam(value = "feeAmount", required = true) Integer feeAmount,
			@RequestParam(value = "dueFee", required = true) Integer dueFee) {

		feePayment.setFeeAmount(feeAmount);
		feePayment.setDueFee(dueFee);

		int feeId = feeService.depositFee(feePayment);

		return "student";
	}

	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public ModelAndView editUserForm(@RequestParam(value = "userId", required = true) Integer userId) {

		ModelAndView mav = new ModelAndView();
		User user = userService.getUser(userId);

		mav.addObject(user);

		return new ModelAndView("admin");
	}

	/**
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUser(@RequestParam(value = "userId", required = true) Integer userId) { 

		userService.deleteUser(userId);

		return "admin";

	}

}
