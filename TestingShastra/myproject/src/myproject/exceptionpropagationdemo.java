package myproject;

public class exceptionpropagationdemo 
{

void p()
	{
		//int a=10;
		//int result=a/0;
	throw new ArithmeticException("device error");
	}
	void n() 
	{
	p();	
	}
	void m()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionpropagationdemo obj=new exceptionpropagationdemo();
			obj.m();
			System.out.println("normal flow of the program");
	}
	
	}