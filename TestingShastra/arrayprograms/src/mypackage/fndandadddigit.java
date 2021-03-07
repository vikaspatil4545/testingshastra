package mypackage;

import java.util.Scanner;

public class fndandadddigit 
{
public static void main(String[] args) 
{
	int sum=0,count=0;
//Scanner sc=new Scanner(System.in);
//System.out.println("enter the row of the array");
//int row=sc.nextInt();
//System.out.println("Enter the column of the array");
//int col=sc.nextInt();
char a[][]= {{'a','2','d','e'},{'1','3','4','6','r'},{'a','g','s','y','t'},{'2','4','5','v','j'}};
/*for (int i = 0; i<row; i++)
{
	for (int j=0;j<col; j++) 
	{
		a[i][j]=sc.next();
	//a[i][j]=sc.Next();	
	}
}*/
System.out.println("Printing elements of the array is:");
for (int i = 0; i<a.length; i++) 
{
for (int j = 0; j<a[i].length; j++) 
{
if(a[i][j]=='0'||a[i][j]=='1'||a[i][j]=='2'||a[i][j]=='3'||a[i][j]=='4'||a[i][j]=='5'||a[i][j]=='6'
||a[i][j]=='7'||a[i][j]=='8'||a[i][j]=='9')
{
	System.out.print(" "+a[i][j]);
	count++;
	sum=sum+(Integer.parseInt(String.valueOf(a[i][j])));
	}
}	


System.out.println();
}
System.out.println("No of digits occurred in the array is:"+count);
System.out.println("sum of digits of the array is:"+sum);

}
}
