package myproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;



public class arratlistexamp {
	public static void main(String a[])
	{
		LinkedList ll=new LinkedList();
				ll.add(10);
				ll.add(20);
				ll.add("Vikas");
				ll.add("amar");
				ll.add(null);
		
		ArrayList al =new ArrayList(ll);
		al.add(10);
		al.add("vikas");
		al.add(null);
		al.add(10);
		al.add(3);
		Vector v=new Vector();
		v.add(10);
		v.add("ajay");
		v.add(10);
		v.add(null);
		System.out.println(v);
		System.out.println(al.size());
		
		/*for (int i = 0; i < 10; i++) 
		{
			al.add('a');
			al.remove("vikas");
			//System.out.println(al);
			
		}*/
		//System.out.println(ll);
		System.out.println(al);
		//System.out.println("Elements of Arraylist is:-"+al);
		//System.out.println(intSize());
		
	}

}
