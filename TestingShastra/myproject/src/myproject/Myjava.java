package myproject;
 class demo  
{
	 public void run()
	 {
		 System.out.println("bike is runnung");
	
	 }

}
public class Myjava extends demo {
	
public void run()
{
System.out.println("bike is running safely");
}

public static void main(String[] args)
{
		// TODO Auto-generated method stub
demo obj=new Myjava();
obj.run();
System.out.println("Hello world");
}
}


