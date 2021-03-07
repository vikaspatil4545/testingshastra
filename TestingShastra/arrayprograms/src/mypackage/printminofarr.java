package mypackage;

import java.util.Scanner;

public class printminofarr 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit of the array");
	int limit= sc.nextInt();
	int a[]=new int[limit];
	for (int i = 0; i < a.length; i++)
	{
		a[i]=sc.nextInt();
		
	}
	int min=a[0];
	for (int i = 0; i < a.length; i++) 
	{
	if(a[i]<=min)	
	{
	min=a[i];
	}
	}
	System.out.println("Minimum element from the array is "+min);

	}
}
