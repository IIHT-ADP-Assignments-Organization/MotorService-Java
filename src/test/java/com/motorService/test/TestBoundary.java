package com.motorService.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.motorService.models.Customer;



public class TestBoundary {
	
	 @Test
	    public void testpasswordLength()
	    {
			Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setName("john");
			customer.setPassword("john1234");
			customer.setEmail("john@gmail.com");
			customer.setAddress("benglore");
			customer.setPhoneNo(234234543);
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getPassword().length());


	    }
	 
	 @Test
	    public void testPhoneNumberLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setName("john");
			customer.setPassword("john1234");
			customer.setEmail("john@gmail.com");
			customer.setAddress("benglore");
			customer.setPhoneNo(234234543);
	        long PhoneNoLength=10;
	        
	    assertEquals( PhoneNoLength,customer.getPhoneNo());


	    }
	 
	 @Test
	    public void testEmailLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setName("john");
			customer.setPassword("john1234");
			customer.setEmail("john@gmail.com");
			customer.setAddress("benglore");
			customer.setPhoneNo(234234543);
	        		
	        int emailLength=10;
	assertEquals(emailLength,customer.getEmail().length());

	    }

}
