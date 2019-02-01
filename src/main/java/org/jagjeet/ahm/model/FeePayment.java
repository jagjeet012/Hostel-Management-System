package org.jagjeet.ahm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

/**
 * @author Developer
 *
 */
@Entity
@Component
public class FeePayment {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feeId;
	private String feeName;
	private int feeAmount;
	private int dueFee;
	@OneToOne
	private User user;

	public int getFeeId() {
		return feeId;
	}

	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}

	public String getFeeName() {
		return feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public int getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(int feeAmount) {
		this.feeAmount = feeAmount;
	}

	public int getDueFee() {
		return dueFee;
	}

	public void setDueFee(int dueFee) {
		this.dueFee = dueFee;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
