package myproject;

import java.io.IOException;

public class throwsdemo 
{
void method()throws IOException
{
	System.out.println("device operation performed");
	throw new java.io.IOException("device error");
}

public static void main(String a[]) throws IOException
{
	/*try
	{
		throwsdemo obj=new throwsdemo();
		obj.method();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}*/
	throwsdemo obj=new throwsdemo();
	obj.method();
	System.out.println("normal flow");
		}

}



