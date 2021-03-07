package mypackage;

import java.util.Scanner;

public class printevenarr 
{
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the limit if the array");
	int no=sc.nextInt();
	int a[]=new int[no];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%2==0)
		{
	System.out.print(a[i]+  "position of the even array element: "+i+" ");
		}
	}
	}

}
