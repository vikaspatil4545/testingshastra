package myproject;

public  class  constructordemo1
{
	 constructordemo1() {
		// TODO Auto-generated constructor stub
		System.out.println("i  am default constructor");
	}
	void msg()
	{
		System.out.println("i am private constructor");
	
	}
	public static void main(String[] args) 
	{
		constructordemo c=new constructordemo();
		c.msg();
		
		
	}
	
	
}
	