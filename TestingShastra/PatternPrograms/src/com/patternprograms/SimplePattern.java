package com.patternprograms;

class SimplePattern {
	public static void main(String a[]) {
	
		for(int i=0;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}
		
		}