package myproject;

import java.util.LinkedList;
import java.util.ListIterator;

public class listiteratorexmp {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add(2);
	ll.add(3);
	ll.add(4);
	ll.add(5);
	ll.add(6);
	ll.add(7);
	ll.add(8);
	ll.add(9);
	
	
	ListIterator itr=ll.listIterator();
	
	//System.out.println("After previous");
	System.out.println("after next");
	
	while (itr.hasNext()) {
		//itr =  itr.hasNext();
	//System.out.prtintln(itr.next());
		System.out.print(itr.next()+"\t");
	}
	
	System.out.println("\nAfter previous");
	while (itr.hasPrevious()) {
		System.out.print(itr.previous()+"\t");
	}
	
	}
}
