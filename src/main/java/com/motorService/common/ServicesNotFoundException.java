package com.motorService.common;

public class ServicesNotFoundException extends Exception {
	
	public static  String message="services not found";


	public ServicesNotFoundException()
	{
		
	}
	public ServicesNotFoundException(String message)
	{
		this.message=message;
	}

}
