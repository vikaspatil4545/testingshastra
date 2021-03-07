package myproject;
import java.util.*;

public class scannerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the Roll no of student");
		int Rollnum=sc.nextInt();
		System.out.println("enter the name of student");
		String name=sc.next();
		System.out.println("enter the age of student");
		int age=sc.nextInt();
		System.out.println("entert the class of student");
		String Class= sc.next();
		System.out.println("Roll no:-"+Rollnum+"\tName:-"+name+"\tAge:-"+age+"\t\tClass is:-"+Class);
		sc.close();
		
	}
}