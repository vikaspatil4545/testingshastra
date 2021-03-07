package myproject;
class vehicle{
	int speed=100;
	public vehicle() {
		// TODO Auto-generated constructor stub
	System.out.println("i am vehicle");
	}
	/*public vehicle() {
		// TODO Auto-generated constructor stub
		System.out.println("i am vehicle constuctor");
	}*/
	void display() {
		System.out.println("i am method of vehicle");
		
	}
	}
class superdemo extends  vehicle{
public superdemo() {
	//super();
	// TODO Auto-generated constructor stub
}
	int speed=140;
	
	/*public superdemo(int speed) {
		// TODO Auto-generated constructor stub
		//ssuper();
		this.speed=speed;
		System.out.println(speed);
		System.out.println("i am in superdemo constructor");
	}*/
	
	void message()
	{
		
		display();
		//System.out.println(super.speed);
		System.out.println("i am method of sperdemo");
	}
	
public static void main(String a[]) 
{
	//superdemo h=new superdemo(120);
	//h.display();
	superdemo h=new superdemo();
	h.display();
}	
}

