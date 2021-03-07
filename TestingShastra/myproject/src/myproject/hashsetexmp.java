package myproject;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashsetexmp {

	public static void main(String a[])
	{
		LinkedHashSet hs=new LinkedHashSet();
		
		hs.add("Vikas");
		hs.add(100);
		hs.add(200);
		hs.add(null);
		hs.add(300);
		hs.add(400);
		hs.add(50);
		hs.add(1100);
		/*HashSet hs1=new HashSet(hs);
	    hs1.add(11);
		hs1.add(12);
		hs1.add(13);*/
		
		System.out.println(hs);
		
	}
}
