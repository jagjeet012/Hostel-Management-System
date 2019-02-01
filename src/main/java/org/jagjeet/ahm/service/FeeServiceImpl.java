package org.jagjeet.ahm.service;

import org.jagjeet.ahm.dao.FeeDao;
import org.jagjeet.ahm.model.FeePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class FeeServiceImpl implements FeeService {
	
	/**
	 * 
	 */
	@Autowired
	FeeDao feeDao;

	/* (non-Javadoc)
	 * @see org.jagjeet.ahm.service.FeeService#depositFee(org.jagjeet.ahm.model.FeePayment)
	 */
	@Override
	@Transactional
	public int depositFee(FeePayment feePayment) {
		return feeDao.depositFee(feePayment);
	}

}
