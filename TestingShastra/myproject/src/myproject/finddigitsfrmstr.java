package myproject;

import java.util.Scanner;

public class finddigitsfrmstr
{
	public static  void  main(String args[])
	{
		String str;
		String num;
		
	System.out.println("enter the string");	
	Scanner a=new Scanner(System.in);
	str=a.nextLine();
    num=str.replaceAll("[^0-9]","");
 System.out.println("Numbers are: "+num);
	}

}
