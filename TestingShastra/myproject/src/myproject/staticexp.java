package myproject;

public class staticexp {

	int c=40;
	 static int a=10;
	 static
	 {
		 System.out.println("static method is invoked first");
}
	static int cube(int x)
	{
		return x*x*x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//staticexp o=new staticexp();
		
		//int result=o.cube(5);
		staticexp s=new staticexp();
		int result=staticexp.cube(5);
		System.out.println(result);
		System.out.println(a);
		System.out.println(s.c);
}
	
}
