package com.motorService.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.motorService.models.Customer;
import com.motorService.models.ServiceDetails;

@Component
@Service("adminService")
public class AdminServiceDaoImpl implements AdminServiceDao {

	@Autowired
	@Transactional
	public boolean login(String adminName, String adminPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public ServiceDetails addService(ServiceDetails service) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public ServiceDetails viewService(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public ServiceDetails editService(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean deleteService(int serviceId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Customer allotSlot(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Customer editSlot(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean deleteSlot(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Customer viewSlot(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Customer viewCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Customer displayService(int serviceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
