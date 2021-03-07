package myproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class mapexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap lh=new LinkedHashMap();
		lh.put(1,"one");
		lh.put(2,"two");
		lh.put(3,"three");
		lh.put(4,"four");
		lh.put(5,"five");
		
		HashMap hm=new HashMap(lh);
		hm.put(10, "vikas");
		hm.put(null, "prasad");
		hm.put(10,null);
		hm.put(20, null);
		hm.put(30, "ajay");
		hm.put(40, "jay");
		hm.put(50, "viraj");
		hm.put('a',"vinay");
		SortedMap ss=new TreeMap();
		ss.put(1,"one");
		//ss.put(null,"two");
		ss.put(3,"three");
		ss.put(4,"four");
		ss.put(5,"five");
		ss.put(6,"six");
		System.out.println(ss);
		//System.out.println("First key is:-"+ss.ceilingKey(7));
		System.out.println(ss);
		System.out.println(hm);
		System.out.println(hm.get(10));
		System.out.println(hm.size());
		System.out.println(hm.containsKey(50));
		System.out.println(hm.containsValue("vikas"));
		System.out.println(hm.remove(40));
		System.out.println(hm.values());
		System.out.println(ss);
		
	}

}
