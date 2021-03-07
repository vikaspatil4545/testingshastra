package myproject;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class cursorsincollection {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Printing elements of Linkedlist in forward direction:");
		ListIterator itr = al.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Printing elements of Linkedlist in backword direction:");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(5);
		arl.add(4);
		arl.add(3);
		arl.add(2);
		arl.add(1);

		System.out.println("Printing elements of ArrayList:");
		Iterator it = arl.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Vector v = new Vector();
		v.add("vikas");
		v.add("vilas");
		v.add("ajay");
		v.add("jay");
		v.add("ajay");

		System.out.println("Printing elements of vector:");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("A", "Apple");
		hm.put("B", "Ball");
		hm.put("C" ,"Cat");
		hm.put("D", "Dog");
		hm.put("E", "Elephant");
		
		System.out.println("Printing elements of hashmap using keyset:");
		Set allkeys=hm.keySet();
		Iterator It=allkeys.iterator();
		while(It.hasNext())
		{
			System.out.println(hm.get(It.next()));
		}
		
		System.out.println("Printing elements of hashmap using entry:");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" :-> "+m.getValue());
		}
		

	}

}
