package myproject;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
		reverse=reverse+str.charAt(i);	
		}
			
		System.out.println("Reverse String is:");
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("Srting is palindrome:-" +str);
		}
		else
		{
			System.out.println("String is not palindrome:- "+str);
		}
		
}

	}