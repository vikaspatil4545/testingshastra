package mypackage;

import java.util.Scanner;

public class convstrintiupperandlower 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=sc.nextLine();
	for(int i=0;i<=str.length()-1;i++)
	{
		System.out.print(" "+str.charAt(i));
	}
	System.out.println();
		System.out.println(str.toUpperCase());
	}
}
