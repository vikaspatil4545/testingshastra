package myproject;

import java.io.IOException;
//import java.sql.SQLException;

class parent
{
	void msg() throws Exception
	{
		System.out.println("hi i am vikas");
	}
}
 class exceptionwithoverriding extends parent
		{
	void msg() throws Exception
	{
	System.out.println("hi i am ajay");
		
			}
	public static void main(String[] args) {
		try
		{
			exceptionwithoverriding  p=new exceptionwithoverriding();	
			p.msg();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		
	}
       
         }
