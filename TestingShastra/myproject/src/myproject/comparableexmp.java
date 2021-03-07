package myproject;

import java.util.*;
import java.util.TreeSet;

class student1
{
	 String name;
	 float height;
	 float marks;
	 String classname;
	 public student1(String name,float height,float marks,String classname) 
	 {
		// TODO Auto-generated constructor stub
		 this.name=name;
		 this.height=height;
		 this.marks=marks;
		 this.classname=classname;
		 
	}
}
/*class compareonmarks implements Comparator
{
public  int compare(Object o1,Object o2)
{
	student1 s1=(student1)o1;
	student1 s2=(student1)o2;
	if(s1.marks<s2.marks)
	{
		return-1;
	}
	else if(s1.marks>s2.marks)
	{
		return 1;
	}
	else 
	{
		return 0;
	}
	
}
}
class compareonheights implements Comparator
{
	 
public  int compare(Object o1,Object o2)
{
	
	student1 s1=(student1)o1;
	student1 s2=(student1)o2;
	if(s1.height<s2.height)
	{
		return-1;
	}
	else if(s1.height>s2.height)
	{
		return 1;
	}
	else 
	{
		return 0;
	}
	
	
}
}
public class comparableexmp 
{
	public static void main(String[] args) {
		
	student1 vikas=new student1("Vikas",6.5f,65.66f,"mcs");
    student1 vijay=new student1("Vijay",5.5f,85.66f,"bcs");
	student1 ajay=new student1("ajay",5.9f,63.66f,"mca");
	student1 anil=new student1("anil",6.2f,45.66f,"BE");
	
	
	 TreeSet t=new TreeSet(new compareonmarks());
	t.add(vikas);
	t.add(vijay);
	t.add(ajay);
	t.add(anil);		
	System.out.println("Compare on Marks");
	for(Object student1:t)
	{
		student1 s1=(student1)student1;
		System.out.println(s1.name+"\t"+s1.marks+"\t"+s1.height);
	}
	TreeSet t=new TreeSet(new compareonheights());
	t.add(vikas);
	t.add(vijay);
	t.add(ajay);
	t.add(anil);
	System.out.println("Compare on Height");
	for(Object student1:t)
	{
		student1 s2=(student1)student1;
		System.out.println(s2.name+"\t"+s2.marks+"\t"+s2.height);
			}
	} 
	}  */






 
	 
	 


