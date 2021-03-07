package myproject;

import java.util.Scanner;

public class armstrongno 
{
	public static void main(String[] args) {
		int sum=0, rem,num,temp=0;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:-");
		int no=sc.nextInt();
		num=no;
		
		while(no!=0)
		{
			rem=no%10;
			temp=temp*10+rem;
			//sum=sum+rem*rem*rem;
			//System.out.println(rem);
			no=no/10;
			//System.out.println(sum);
		}
		
		System.out.println("Reverse of a number is:-"+temp);
		/*if(sum==num)
		{
			System.out.println("given number is palindrome:-"+sum );
		}
		else
		{
			System.out.println("given no is not palindrome");
		}*/
	}
}
