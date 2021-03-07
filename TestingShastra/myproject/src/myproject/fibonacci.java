package myproject;

import java.util.Scanner;

public class fibonacci {
	public static void main(String a[])
	{
		int i,add,step=1;
		System.out.println("Enter the first number:-");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		System.out.println("Enter the second number:-");
		int no2=sc.nextInt();
		//System.out.println("First number")
		System.out.println("Enter the limit to from addition");
		int limit=sc.nextInt();
		for(i=2;i<=limit;i++)
		{
			add=no1+no2;
			System.out.println("Addition of the first two no is step:- "+step);
			System.out.println(add);
			//step++;
		no1=no2;
		no2=add;
		}
		}
		}
		
		
		/*int n1=0,n2=1,count=10,n3;
		System.out.println(n1+" "+n2);
		for(int i=2;i<=count;i++)
		{
		n3=n1+n2;
		System.out.println("Addition of the first two no is:- "+n3);
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
		
		}
		
	}
		

}*/
