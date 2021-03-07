package myproject;

public class staticexmp {
	int a=41;
	static int b;
	static void show() {
	System.out.println("i am show method");	
	}
	
	
	public static void main(String[] args) {
		int c=50;
		//a=10;
		b=20;
		staticexmp s=new staticexmp();
		s.show();
		int a=b++;
		b--;
		System.out.println(b);
		System.out.println(s.a);
		
	}

}
