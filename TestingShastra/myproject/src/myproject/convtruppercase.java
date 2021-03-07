package myproject;

import java.util.Scanner;

public class convtruppercase {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String lowercase="",uppercase="";
		lowercase=str.toUpperCase();
		uppercase=str.toLowerCase();
		System.out.println("original string:-"+str);
		System.out.println("Lower case  string:-"+lowercase);
		System.out.println("Lower case  string:-"+uppercase);
		
		// TODO Auto-generated method stub

	}

}
