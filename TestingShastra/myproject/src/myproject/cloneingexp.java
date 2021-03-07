package myproject;

public class cloneingexp implements Cloneable {
	int num;
	String name;
	float marks;
	public cloneingexp(int num,String name,float marks) {
		// TODO Auto-generated constructor stub
		this.num=num;
		this.name=name;
		this.marks=marks;
		
		}
public Object clone()throws CloneNotSupportedException
{
	return super.clone();
	
}
public static void main(String[] args) {
	try
	{
		cloneingexp c=new cloneingexp(10,"Vikas",65.33f);
		cloneingexp c1=(cloneingexp)c.clone();
		System.out.println("Number is:-"+c.num+" Name is:- "+c.name+" Marks is:-"+c.marks);
		System.out.println("Number is:"+c.num+" Name is:-"+c.name+"  Marks is:-"+c.marks);
	}
	catch (CloneNotSupportedException e) {
		// TODO: handle exception
	}
}

}
