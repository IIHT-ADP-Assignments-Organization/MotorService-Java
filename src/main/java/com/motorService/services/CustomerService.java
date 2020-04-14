package com.motorService.services;

import com.motorService.models.Customer;
import com.motorService.models.Payment;
import com.motorService.models.ServiceDetails;
import com.motorService.models.Slot;

public interface CustomerService {
	
	boolean register(Customer customer);
	boolean login(String name,String password);
	public Slot confirmSlot(Slot slot);
	public ServiceDetails addToCart(ServiceDetails service,int customerId);
	boolean checkOut(int slotId,int customerId);
	public Payment makePayment(Payment payment);
	public ServiceDetails viewService(int serviceId);
	public ServiceDetails selectService(int serviceId);
	public ServiceDetails searchService(ServiceDetails serviceDetails);
	

}
