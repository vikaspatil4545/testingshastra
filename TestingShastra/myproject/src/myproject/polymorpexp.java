package myproject;
class splender{
	int data=10;
	void run()
	{
		System.out.println("bike is running at the speed of 100");
	}
	
}
public class polymorpexp extends splender {
	int data=20;
	void run()
	{
		System.out.println("bike is running at the speed of 80");
		//System.out.println(data);
	}
	public static void main(String[] args) {
		
		polymorpexp p1=new polymorpexp();
		splender p=new polymorpexp();
		System.out.println(p.data);
	System.out.println(p instanceof splender);
	System.out.println(p1 instanceof polymorpexp);
	System.out.println( p1 instanceof splender);
		//p1.run();
	//p.run();
}
}
