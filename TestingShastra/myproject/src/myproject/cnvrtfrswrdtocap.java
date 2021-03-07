package myproject;

import java.util.Scanner;

public class cnvrtfrswrdtocap {

	public static void main(String[] args) {
		System.out.println("enter the sentence");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String uppercaseline="";
		Scanner linescan=new Scanner(str);
		while(linescan.hasNext())
		{
			String word=linescan.next();
		uppercaseline+=Character.toUpperCase(word.charAt(0))+word.substring(1)+"";
	
		}
		System.out.println(uppercaseline.trim());
		
		// TODO Auto-generated method stub
       }
       }
