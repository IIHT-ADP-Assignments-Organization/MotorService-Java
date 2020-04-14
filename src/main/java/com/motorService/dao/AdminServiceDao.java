package com.motorService.dao;

import com.motorService.models.Customer;
import com.motorService.models.ServiceDetails;

public interface AdminServiceDao {
	
	boolean login(String adminName,String adminPassword);
	public ServiceDetails addService(ServiceDetails service);
	public ServiceDetails viewService(int serviceId);
	public ServiceDetails editService(int serviceId);
	boolean deleteService(int serviceId);
	public Customer allotSlot(int customerId);
	public Customer editSlot(int customerId);
	boolean deleteSlot(int customerId);
	public Customer viewSlot(int customerId);
	public Customer viewCustomer(int customerId);
	public Customer displayService(int serviceId);

}
