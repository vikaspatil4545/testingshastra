package com.userdefinedexception;

public class invalidnoexception extends Exception {
	
	public static void main(String[] args) throws invalidnoexception {
		
		try
		{
			throw new invalidnoexception();
		}
		catch(Exception e)
		{
			System.out.println("Invalid numbers addition");
		}
		
	}
	

}

