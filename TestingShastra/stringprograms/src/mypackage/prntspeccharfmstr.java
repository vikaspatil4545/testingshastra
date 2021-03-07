package mypackage;

import java.util.Scanner;

public class prntspeccharfmstr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		 String s="add # *& ; ,! ...////";;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='#'||str.charAt(i)=='*'||str.charAt(i)=='&'||str.charAt(i)=='$'||
					str.charAt(i)=='@'||str.charAt(i)=='^'||str.charAt(i)=='.'||str.charAt(i)==','||str.charAt(i)==';'||
					str.charAt(i)=='"') 
			{
				System.out.print(" "+str.charAt(i));
			}
			
		}
		
	}
}
