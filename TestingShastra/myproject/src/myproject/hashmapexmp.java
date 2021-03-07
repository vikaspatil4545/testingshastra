package myproject;

import java.util.*;

public class hashmapexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1,"JAN");
		hm.put(2,"FEb");
		hm.put(3,"MAR");
		hm.put(4,"APRIL");
		hm.put(5,"MAY");
		hm.put(6,"JUNE");
		ArrayList aa=new ArrayList();
		aa.add("JAn");
		System.out.println("Iterating using interface");
		Set<Map.Entry> entries=hm.entrySet();
		for(Map.Entry entry:entries)
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println("Iterating directly");		
		Set keys=hm.keySet();
		for(Object key:keys)
		{
			System.out.println(hm.get(key));
		}
	}

}


