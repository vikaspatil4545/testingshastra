package myproject;
import java.util.Scanner;

public class userdefinedarray {
	public static void main(String[] args) {
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  limit  of the aaray");
		int no=sc.nextInt();
		int[]a=new int[no];
		for (int i = 0; i< a.length; i++)
		{
		a[i]=sc.nextInt();
	
		}
		//System.out.println("printing the elements of the array");
		for (int i = 0; i < a.length; i++) 
		{	
			if(a[i]>=max)
		{
				max=a[i];
		}	
		}
		System.out.println("maximum element from the array is: "+max);
		
	
	}

}
