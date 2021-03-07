package myproject;

import java.util.Stack;

public class stackexmp {
	public static void main(String[] args) {
	Stack s=new Stack();
	s.push(10);
	s.push("vikas");
	s.push(100);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	s.push(60);
	s.push(70);
	//s.push(null);
	//s.pop();
	//s.peek();
	System.out.println("After search of element in stack:"+s.search(20));
	System.out.println("After search of element in stack:"+s.get(0));

	System.out.println(s);
		
	}

}
