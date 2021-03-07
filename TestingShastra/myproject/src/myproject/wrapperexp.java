package myproject;

public class wrapperexp {
	public static void main(String[] args) {
		int i=10;
		int a=i;//Integer a=Integer.valueOf(i);
		Integer b=new Integer(20);
		int j=i;
		System.out.println(i+" "+a+" "+j+" "+b );
	}

}
