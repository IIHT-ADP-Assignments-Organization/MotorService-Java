package com.motorService.common;

public class ServicesAlreadyExistException extends Exception {
	
	public static  String message="articles already exists";


	public ServicesAlreadyExistException()
	{
		
	}
	public ServicesAlreadyExistException(String message)
	{
		this.message=message;
	}

}
