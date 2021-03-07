package mypackage;

import java.util.Scanner;

public class stringreverse 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=sc.nextLine();
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("String Reverse is:"+rev);
	System.out.println(rev.length());
	System.out.println(rev.indexOf('s'));
	}
}
