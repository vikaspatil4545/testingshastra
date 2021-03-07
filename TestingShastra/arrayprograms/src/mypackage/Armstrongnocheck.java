package mypackage;

import java.util.Scanner;

public class Armstrongnocheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem,sum=0,no;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		no=num;
		while (num!=0) {
			rem=num%10;
			sum=rem*rem*rem+sum;
			num=num/10;
			
		}
		if(sum==no)
		{
			System.out.println("Given number is armstrong:"+sum);
		}
		else {
			System.out.println("Given number is not armstrong:"+sum);
		}
		sc.close();
		

	}

}
