	package mypackage;
	
	import java.util.Scanner;
	
	public class add2darr 
	{
	public static void main(String[] args) 
	{
		int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit of the  outer array");
	int outer=sc.nextInt();
	System.out.println("Enter the limit of the inner array");
	int inner=sc.nextInt();
	int a[][]=new int[outer][inner];
	for (int i = 0; i <a.length; i++)
	{
	for (int j = 0; j < a[i].length; j++) 
	{
		a[i][j]=sc.nextInt();
	}	
	}
	System.out.println("Printing elements of the array:");
	for (int i = 0; i < a.length; i++)
	{
	for (int j = 0; j < a[i].length; j++)
	{
		if(a[j][j]==a[i][i])
		{
	System.out.print(" "+a[i][j]);
	sum=sum+a[i][i];
	}	
	}
	System.out.println("Sum of inner array is:"+sum);
	System.out.print("");
	
	
	}
	}
	}