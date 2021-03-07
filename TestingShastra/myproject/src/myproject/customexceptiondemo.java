package myproject;
class InvalidageException extends Exception
{
	public InvalidageException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class customexceptiondemo {
static	void validate(int age) 
{
	if(age<18)
	{
		throw new ArithmeticException("Invalid age");
	}
	else
	{
		System.out.println("welcome to vote");
	}
	
	}
	public static void main(String[] args) {
		try
		{
			validate(18);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
		System.out.println("Rest of the code");
	}

	
		 }
		 

