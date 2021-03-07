package mypackage;

import java.util.Scanner;

public class prntevenodd2darr 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row of the array");
	int row=sc.nextInt();
	System.out.println("enter the column of the array");
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	int b[][]=new int[3][2];
	for (int i = 0; i<row; i++)
	{
		for (int j = 0; j<col; j++)
		{
		arr[i][j]=sc.nextInt();	
		}
		
	}
	System.out.println("printing  even elements from the array:");
	for (int i = 0; i<arr.length; i++) 
	{
	for (int j = 0; j <arr[i].length; j++) 
	{
		if(arr[i][j]%2==0)
		{
	System.out.print(" "+arr[i][j]);	
	}
		
	}
	}
	System.out.println();
	System.out.println("printing odd elements from the array");
	for (int i = 0; i < arr.length; i++) 
	{
	for (int j2 = 0; j2 < arr.length; j2++)
	{
		if(arr[i][j2]%2!=0)
		{
			System.out.print(" "+arr[i][j2]);
		}
	}	
	}
	}
		
	}
