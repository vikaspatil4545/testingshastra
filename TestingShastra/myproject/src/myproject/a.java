package myproject;
interface a1
{
	void a();
	void b();
	void c();
	void d();
	
}
abstract class demo1 implements a1
{
	public void a()
	{
		System.out.println("hello ");
	}
}
 class a extends demo1
{
	public void b()
	{
		System.out.println("i am b method");
		}
	public void c()
	{
		System.out.println("i am c method");
	}
	public void d()
	{
		System.out.println("i ma d method");
	}
	public static void main(String[] args) {
		a d2=new a();
		d2.a();
		d2.b();
		d2.c();
		d2.d();
		System.out.println(d2 instanceof demo1);
		
	}
}
/*interface a1
{
	 void msg1();
	
}
interface a2
{
	default void msg()
	{
		System.out.println("hello i am default method of interfaceof a2");
	}
}
class a implements a1,a2
{
	public void msg1()
	{
		System.out.println("i am a1 interface method ");
	}
public static void main(String[] args) {
	a obj=new a();
	obj.msg1();
	obj.msg();
	}
}*/
/*class unicorn
{
	void run()
	{
		System.out.println("i am run method of unicorn");
	}
	
}
class honda extends unicorn
{
	void run()
	{
		System.out.println("i am run method of honda");
	}
	
	}
class a extends honda,unicorn
{
	public static void main(String[] args) {
	
		a obj=new a();
		obj.run();
		
	}
}*/

/*interface showable
{
	void show();
	
}
interface printable extends showable
{
	void print();
	
}
class a implements printable
{

	 public void show()
	{
		System.out.println("i am show method");
	}
	 public void print() {
		 
		System.out.println("i am print method");
	}
	 public static void main(String[] args) {
		
		 a obj=new a();
		 obj.show();
		 obj.print();
	}
}*/
/*interface a1
{
	void run();
	int num1=10;
}
interface a2
{
	void run();
	int num=20;
	
}
class a implements a2,a1
{
	public void run() 
	{
		System.out.println("Bike is running");
		System.out.println(num);
		System.out.println(num1);

	}
	public static void main(String a[])
	{
		 a obj=new a();
		 obj.run();
	}
}*/
/* interface a1 {
	 public static  final int num=10;
	int bike();
	int shine();
}
 interface a2
 {
	 public abstract void  honda();
	 public static final String s="VIKAS"; 
	 int bike();
	 
 }
class a implements a1,a2
{
	public int bike()
	{
		return 0;
		
	}
	 public int shine()
	{
		return 80;
		
	}
	 public void honda()
	 {
		 System.out.println("hello");
	 }
	 public static void main(String[] args) {
		a i=new a();
	int speed=i.bike();
	int speed1=i.shine();
	System.out.println(speed);
	System.out.println( speed1);
		 
	}
}*/