package mypackage;

import java.util.Scanner;

public class finddigitfrmstr 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to:");
	String str=sc.nextLine();
	for(int i=0;i<=str.length()-1;i++)
	{
		if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||
				str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
			{
			System.out.print(" "+str.charAt(i));

		}
			}
		
	}

}
