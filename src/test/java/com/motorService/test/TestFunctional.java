package com.motorService.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.motorService.models.Admin;
import com.motorService.models.Customer;
import com.motorService.models.Payment;
import com.motorService.models.ServiceDetails;
import com.motorService.models.Slot;
import com.motorService.services.AdminService;
import com.motorService.services.CustomerService;



public class TestFunctional {

	@Test
	public void testLogin()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("Ram");
		admin.setEmail("ram@gmail.com");
		admin.setPassword("ram1234");
		admin.setPhoneNo(123455676);
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean adminfromdb = adminservice.login(admin.getAdminName(),admin.getPassword());
		assertSame(true,adminfromdb);
	}
	
	@Test
	public void addService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
	ServiceDetails serviceDetails = new ServiceDetails();
	serviceDetails.setServiceId(1);
	serviceDetails.setServiceName("washing");
	serviceDetails.setServiceType("Cleaning");
	serviceDetails.setServiceFees(300);
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		ServiceDetails result = adminservice.addService(serviceDetails);
		assertNotNull(result);
		
						
	}
	
	@Test
	public void viewService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
	ServiceDetails serviceDetails = new ServiceDetails();
	serviceDetails.setServiceId(1);
	serviceDetails.setServiceName("washing");
	serviceDetails.setServiceType("Cleaning");
	serviceDetails.setServiceFees(300);
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		ServiceDetails result = adminservice.viewService(serviceDetails.getServiceId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void editService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
	ServiceDetails serviceDetails = new ServiceDetails();
	serviceDetails.setServiceId(1);
	serviceDetails.setServiceName("washing");
	serviceDetails.setServiceType("Cleaning");
	serviceDetails.setServiceFees(300);
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		ServiceDetails result = adminservice.editService(serviceDetails.getServiceId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void deleteService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
	ServiceDetails serviceDetails = new ServiceDetails();
	serviceDetails.setServiceId(1);
	serviceDetails.setServiceName("washing");
	serviceDetails.setServiceType("Cleaning");
	serviceDetails.setServiceFees(300);
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteService(serviceDetails.getServiceId());
		assertSame(1,result);
		
						
	}
	
	@Test
	public void allotSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Customer customer = new Customer();
	Slot slot = new Slot();
	slot.setSlotId(1);
	
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Customer result = adminservice.allotSlot(customer.getCustomerId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void editSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Customer customer = new Customer();
	Slot slot = new Slot();
	slot.setSlotId(1);
	
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Customer result = adminservice.editSlot(customer.getCustomerId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void viewSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Customer customer = new Customer();
	Slot slot = new Slot();
	slot.setSlotId(1);
	
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Customer result = adminservice.viewSlot(customer.getCustomerId());
		assertNotNull(result);
		
						
	}
	
	@Test
	public void deleteSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Customer customer = new Customer();
	Slot slot = new Slot();
	slot.setSlotId(1);
	
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteSlot(customer.getCustomerId());
		assertSame(1,result);
		
						
	}
	
	@Test
	public void viewCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Customer customer = new Customer();
	customer.setCustomerId(1);
	customer.setName("john");
	customer.setPassword("john1234");
	customer.setEmail("john@gmail.com");
	customer.setAddress("benglore");
	customer.setPhoneNo(234234543);
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Customer result = adminservice.viewCustomer(customer.getCustomerId());
		assertNotNull(result);
		
	}
	
	@Test
	public void displayService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
	
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Customer result = adminservice.displayService(serviceDetails.getServiceId());
		assertNotNull(result);
		
	}
	
	@Test
	public void testCustomerLogin()
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
		boolean customerfromdb = customerservice.login(customer.getName(),customer.getPassword());
		assertSame(true,customerfromdb);
	}
	
	@Test
	public void testCustomerRegister()
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
		assertSame(true,customerfromdb);
	}
	
	@Test
	public void confirmSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
	Slot slot = new Slot();
	slot.setSlotId(1);
	
	
	CustomerService customerservice = (CustomerService) context.getBean("adminService");
		Slot result = customerservice.confirmSlot(slot);
		assertNotNull(result);
		
						
	}
	
	@Test
	public void addToCart() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
	
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		ServiceDetails result = customerservice.addToCart(serviceDetails,customer.getCustomerId());
		assertNotNull(result);
		
	}
	
	@Test
	public void checkOut() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		Slot slot = new Slot();
		
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		boolean result = customerservice.checkOut(slot.getSlotId(),customer.getCustomerId());
		assertSame(1,result);
		
	}
	
	@Test
	public void makePayment() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Payment payment = new Payment();
		
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		Payment result = customerservice.makePayment(payment);
		assertNotNull(result);
		
	}
	
	@Test
	public void viewServiceByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
	
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		ServiceDetails result = customerservice.viewService(serviceDetails.getServiceId());
		assertNotNull(result);
		
	}
	
	@Test
	public void selectService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
	
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		ServiceDetails result = customerservice.selectService(serviceDetails.getServiceId());
		assertNotNull(result);
		
	}
	
	@Test
	public void searchService() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		ServiceDetails serviceDetails = new ServiceDetails();
		serviceDetails.setServiceId(1);
		serviceDetails.setServiceName("washing");
		serviceDetails.setServiceType("Cleaning");
		serviceDetails.setServiceFees(300);
	
		CustomerService customerservice = (CustomerService) context.getBean("adminService");
		ServiceDetails result = customerservice.searchService(serviceDetails);
		assertNotNull(result);
		
	}
}
