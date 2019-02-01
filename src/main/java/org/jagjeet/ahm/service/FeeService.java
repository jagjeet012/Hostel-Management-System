package org.jagjeet.ahm.service;

import org.jagjeet.ahm.model.FeePayment;

/**
 * @author Developer
 *
 */
public interface FeeService {
	
	/**
	 * @param feePayment
	 * @return
	 */
	public int depositFee(FeePayment feePayment);

}
