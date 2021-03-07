package myproject;
public class exceptionhandingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		try
		{
			System.out.println("going to divide");
		
		int b=5/0;
		System.out.println(b);
		}
		catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
			finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
