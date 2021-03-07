package myproject;

import java.util.*;

public class vectorexmp {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("vijay");
		al.add("vijay");
		al.add(null);
		Vector v=new Vector(al);
		v.add('a');
		v.add(10);
		v.add("vikas");
		v.add(10);
		v.add(null);
		Vector v1=new Vector(2);
		v1.add(100);
		v1.add(200);
		
		System.out.println(v1);
		Iterator ir=v.iterator();
		System.out.println( v);
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
	}

}
