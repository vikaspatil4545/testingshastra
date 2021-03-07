package mypackage;

import java.util.*;

public class sample {
	public static void main(String arg[])
	{
	int i,j,k;
	for( i=0;i<=3;i++)
	{
	System.out.print(" ");
	for(j=3-i;j>=1;j--)
	{
	System.out.print(" ");
	}
	for( j=0;j<=i;j++)
	{
	System.out.print( "* ");
	}
	System.out.println();
	}
	
	HashMap hm=new HashMap<>();
	hm.put(1, "Vikas");
	hm.put("vikas", "vinay");
	Set<Map.Entry> entries=hm.entrySet();
	for (Map.Entry entry:entries) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		
	}
	
	ArrayList al=new ArrayList();
	al.add("hello");
	al.add("vikas");
	al.add("how");
	al.add("are");
	al.add("you");
	
	Iterator It = al.iterator();
	while (It.hasNext()) {
		System.out.print(" "+It.next()+" ");
		
	}
	
	
	
	} 
}
