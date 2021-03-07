package mypackage;

import java.util.Scanner;

public class adddigitfrmstr 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	int sum=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||
				str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
		{
			System.out.print(" "+str.charAt(i));
				sum=sum+(Integer.parseInt(String.valueOf(str.charAt(i))));
		}
	}
	System.out.println();
	System.out.println("Addition of digits is:"+sum);
	}
}
