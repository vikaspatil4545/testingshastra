package mypackage;

import java.util.Scanner;

public class printarrdesc 
{
	public static void main(String[] args) 
	{
		int temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit of the array");
	int limit=sc.nextInt();
	int a[]=new int[limit];
	for (int i = 0; i < a.length; i++) 
	{
	a[i]=sc.nextInt();	
	}
	for (int i = 0; i < a.length; i++) 
	{
	for (int j = i+1; j < limit; j++) 
	{
	if(a[i]<a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
		}
	}
	System.out.println("print elements in descending order");
	for (int i= 0; i<a.length; i++) 
	{
	System.out.print(" "+a[i]);	
	}
	}
	}

