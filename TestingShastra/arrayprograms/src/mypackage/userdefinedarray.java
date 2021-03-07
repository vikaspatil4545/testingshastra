package mypackage;

import java.util.Scanner;

public class userdefinedarray {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the limit of the array");
	int no= sc.nextInt();
	int a[]=new int[no];
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Printing the elements of the array is");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.print(" "+a[i]);	
			
	}
	}

}
