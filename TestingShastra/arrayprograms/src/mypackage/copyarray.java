package mypackage;

import java.util.Scanner;

public class copyarray
{
public static void main(String[] args) 
{

Scanner sc=new Scanner(System.in);
System.out.println("enter the limit of the array");
int limit=sc.nextInt();
int a[]=new int[limit];
int b[]=new int[limit];
for (int i = 0; i < a.length; i++) 
{
a[i]=sc.nextInt();	
}
for (int i = 0; i < a.length; i++) 
{
b[i]=a[i];
}
System.out.println("print elements of the array ");
for (int i= 0; i<a.length; i++) 
{
System.out.print(" "+b[i]);	
}
System.out.println();
System.out.print(" "+b[limit-1]);
}
	

}
