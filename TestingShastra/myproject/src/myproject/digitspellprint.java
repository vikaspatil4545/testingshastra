package myproject;

import java.util.Scanner;
class digitspellprint
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:- ");
int num=sc.nextInt();
int digit;
int temp=num,count=0;
//int index=2;
//int[] x=new int[3];
do
{
temp=temp/10;
count++;
}while (temp>0);
System.out.println("count is:-"+count);
int[] arr=new int[count];
int index=count-count;
System.out.println("Index of the array is:-"+index);
do
{
digit=num%10;
arr[index]=digit;
	index++;
num=num/10;
count++;

}
while(num>=0);

for (int i=0; i<arr.length; i++) 
{
	System.out.print(" "+arr[i]);
}
System.out.println();
for(int i=0;i<arr.length;i++)
{
switch(arr[i])
{
case 0:System.out.print(" zero ");
	break;

case 1:System.out.print(" one ");
	break;

case 2:System.out.print(" two ");
	break;

case 3:System.out.print(" three ");
	break;

case 4:System.out.print(" four ");
	break;

case 5:System.out.print(" five ");
	break;

case 6:System.out.print(" six ");
	break;
case 7:System.out.print(" seven ");
	break;

case 8:System.out.print(" eight ");
	break;

case 9:System.out.print(" nine ");
	break;
	
default:System.out.print(" Invalid number ");

}
}
}
}