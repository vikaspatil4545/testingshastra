package myproject;
public class mainoverloading {
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String a[])
	{
	 System.out.println("main() method invoked");
	 main(10);
}
}
