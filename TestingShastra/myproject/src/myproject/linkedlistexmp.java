package myproject;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistexmp {
	public static void main(String[] args) {
		
	LinkedList ll=new LinkedList();
	 ll.add(10);
	 ll.add(10);
	 ll.add(null);
	 ll.add("Vikas");
	 LinkedList al=new LinkedList(ll);
	 al.add('a');
	 al.add("c");
	 al.add(null);
	 al.add(60);
	// System.out.println(ll);
	 Iterator ir=al.iterator();
	 while(ir.hasNext())
	 {
		 System.out.println(ir.next());
	 }
			 

}
}
