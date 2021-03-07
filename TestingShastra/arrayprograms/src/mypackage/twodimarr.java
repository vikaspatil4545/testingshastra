package mypackage;

import java.util.Scanner;

public class twodimarr
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row of the array");
	int row=sc.nextInt();
	System.out.println("enter the column of the array");
	int col =sc.nextInt();
	int a[][]=new int[row][col];
	for (int i=0; i<row; i++)
	{
		for (int j=0; j <col; j++) 
		{
		a[i][j]=sc.nextInt();	
		}
	}
	
	for (int i =0; i<row; i++)
	{
		for (int j=0; j<col; j++) 
		{
		System.out.print(" "+a[i][j]);	
		}
		System.out.println();
	}
}
}
