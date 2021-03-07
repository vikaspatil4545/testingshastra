package mypackage;

import java.util.Scanner;

public class twodimprintnonvovel 
{
public static void main(String[] args)
{
	int count=0;
	Scanner sc=new Scanner(System.in);
	char a[][]={{'A','8','D'},{'z','y','c','4'}};

for (int i = 0; i< a.length; i++)
{
	for (int j = 0; j<a[i].length; j++) 
	{
		
	if(a[i][j]=='0'||a[i][j]=='1'||a[i][j]=='2'||a[i][j]=='3'||a[i][j]=='4'||a[i][j]=='5'
			||a[i][j]=='6'||a[i][j]=='7'||a[i][j]=='8'||a[i][j]=='9')
	{
		System.out.print(" "+a[i][j]);
		count++;
		
	}
	
	}
System.out.println();
}
System.out.println("Number of digits occured is:"+count);

}
}	



