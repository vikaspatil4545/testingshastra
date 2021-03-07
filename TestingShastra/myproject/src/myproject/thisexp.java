package myproject;


public class thisexp {
int no1;
String s;
double b;
thisexp()
{
	System.out.println("default constructor is invoked");
}
thisexp(int a, String b)
{
	this();
	System.out.println("hello");
	
no1=a;
s=b;
}
thisexp(int a, String b,double c)
{
	this();
	this.b=c;
	//System.out.println("hello");
	
no1=a;
s=b;
}
		void display()
	{
		System.out.println(no1+" "+s+" "+b);
	}
		void m()
		{
			System.out.println("hello i am in method m");
		}
	
		void n()
		{
			this.m();
			System.out.println(" hello i am in method n");
		
		}
		void p()
		{
			this.n();
			System.out.println(" hello i am in method p");
		}
		void q(thisexp obj)
		{
			System.out.println("method q is invoked");
			System.out.println(this);
			
		}
		void r() 
		{
		q(this);	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisexp t=new thisexp(10,"vikas");
		thisexp t2=new thisexp(20,"vijay",20);
		//thisexp t1=new thisexp(10,20);
		t.display();
		t2.display();
		t.p();
		t.r();
		System.out.println(t);
	}

}
