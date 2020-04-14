package com.motorService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.motorService.dao.CustomerServiceDao;
import com.motorService.models.Customer;
import com.motorService.models.Payment;
import com.motorService.models.ServiceDetails;
import com.motorService.models.Slot;

@Component
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerServiceDao customerServiceDao;
	
	@Transactional
	public boolean register(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Slot confirmSlot(Slot slot) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public ServiceDetails addToCart(ServiceDetails service, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean checkOut(int slotId, int customerId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Payment makePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public ServiceDetails viewService(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public ServiceDetails selectService(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public ServiceDetails searchService(ServiceDetails serviceDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
