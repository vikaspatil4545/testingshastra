package mypackage;

import java.util.Scanner;

public class printmaxofarr {
	public static void main(String[] args) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of the array");
		int limit = sc.nextInt();
		int a[] = new int[limit];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		System.out.print("Maximum element from the array is: " + max);

	}
}
