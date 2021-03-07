package myproject;

public class bike {
	 static int count=0;
	bike()
	{
	System.out.println("Bike is created");
	
	} 
	int i;
	String a;
	double b;
	int age;
	static String collage= "AM";
	bike(int i,String a,double b)
	{
		this.i=i;
		this.a=a;
		this.b=b;
		
	}
	bike(bike bk)
	{
		i=bk.i;
		a=bk.a;
		b=bk.b;
	}
	bike(int num, String nam, double c,int agee)
	{
		i=num;
		a=nam;
		b=c;
		age=agee;
	}
	static void change()
	{
		collage="sp";
	}
	void display()
	{
		System.out.println(i+" "+a+" "+b+"  "+age+" "+collage);
	}
	
	
	
				public static void main(String args[])
				{  
				bike b=new bike(10,"vijay",3.14);
				bike b1=new bike(20,"ajay",14,25);
				bike bb=new bike(b);
				bb.change();
				b.display();
				bb.display();
				b1.display();
				
			} 
        }
			


