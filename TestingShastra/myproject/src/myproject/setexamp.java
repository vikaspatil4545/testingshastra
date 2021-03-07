package myproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class setexamp {
	 public void HashSet()
		{
		System.out.println("hello");
			
		}
	public static void main(String a[])
	{
	
	setexamp s=new setexamp();
		HashSet hs =new HashSet();
		hs.add(10);
		hs.add(30);
		hs.add(null);
		hs.add(null);
		hs.add("vikas");
		hs.add('a');
		System.out.println("elements of hashset:-"+hs);
		//System.out.println(hs.size());
		LinkedHashSet lh=new  LinkedHashSet( 20, 0.75f);
		//lh.add(10);
		lh.add(10);
		lh.add("vijay");
		lh.add(null);
		lh.add(null);
		System.out.println("elements of linkedhashset:-"+lh);
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(2);
		System.out.println("elements of sortedset"+ts);
		SortedSet ss=new TreeSet();
		ss.add('a');
		ss.add('c');
		ss.add('f');
		ss.add('z');
		ss.add('v');
		//ss.add(null);
		System.out.println(ss);
		System.out.println(ss.subSet('c','z'));
		NavigableSet ns=new TreeSet();
		ns.add(10);
		//ns.add(0.5);
		ns.add(20);
		ns.add(20);
		
		Iterator i =ns.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		
		}
	

}
