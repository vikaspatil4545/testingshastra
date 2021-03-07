package myproject;

public class arrayexp {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int b[][]= {{1,2,3,5},{4,5,6,5},{7,8,9,5},{10,11,12,13}};
	for (int i = 0; i <4; i++) {
		for (int j = 0; j < 4; j++) {
			
			System.out.print(b[i][j]+ " ");
		}
		System.out.println();
	}
		
Class c=b.getClass();
String name=c.getName();
System.out.println(name);
}
}
