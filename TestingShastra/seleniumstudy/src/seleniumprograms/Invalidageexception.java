package seleniumprograms;


public class Invalidageexception extends Exception {
	
	void age() throws  Invalidageexception
	{
		System.out.println("Invalid age is entered");
		throw new Invalidageexception();
	}
	public static void main(String[] args) throws Invalidageexception {
		new Invalidageexception().age();
		
	}

}
