package com.motorService.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.motorService.common.ServicesAlreadyExistException;
import com.motorService.common.ServicesNotFoundException;
import com.motorService.common.UserAlreadyExistException;
import com.motorService.models.Customer;
import com.motorService.models.ServiceDetails;
import com.motorService.services.AdminService;
import com.motorService.services.CustomerService;

import junit.framework.Assert;

public class TestException {
	
	@Test
    public void testForAddingServices() throws ServicesAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	 ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
		AdminService adminservice = (AdminService) context.getBean("adminService");
		ServiceDetails result = adminservice.addService(serviceDetails);
		
Assert.assertEquals(ServicesAlreadyExistException.message," services already exists");
    }
	
	@Test
    public void testForServices() throws ServicesNotFoundException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	 ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
		AdminService adminservice = (AdminService) context.getBean("adminService");
		ServiceDetails result = adminservice.addService(serviceDetails);
		
Assert.assertEquals(ServicesNotFoundException.message," services already exists");
    }
	
	@Test
    public void testForUser() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	 Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setName("john");
		customer.setPassword("john1234");
		customer.setEmail("john@gmail.com");
		customer.setAddress("benglore");
		customer.setPhoneNo(234234543);
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		boolean customerfromdb = customerservice.register(customer);
		
Assert.assertEquals(UserAlreadyExistException.message," services already exists");
    }
	

}
