package mypackage;

import java.util.Scanner;

public class ckeckstrispalindrome 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string:");
		String palindrome=sc.nextLine();
		String rev="";
		for( i=palindrome.length()-1;i>=0;i--)
		{
			rev=rev+palindrome.charAt(i);
		}	
		System.out.println("Reverse of string is:"+rev);
		
		if(rev.equalsIgnoreCase(palindrome))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
		
	}
}
