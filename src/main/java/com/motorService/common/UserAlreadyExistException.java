package com.motorService.common;

public class UserAlreadyExistException extends Exception{

	public static  String message="services not found";


	public UserAlreadyExistException()
	{
		
	}
	public UserAlreadyExistException(String message)
	{
		this.message=message;
	}
	
}
