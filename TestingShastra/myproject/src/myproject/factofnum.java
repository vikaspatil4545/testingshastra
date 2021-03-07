package myproject;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class factofnum {
	public static void main(String[] args)
	{
		int fact=1;
	System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of the number is:- "+fact);
		}

}
