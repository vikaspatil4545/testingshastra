package myproject;

public class stringdemo {
public static void main(String arg[])
	{
		String s1="VIKAS       chorghade                           ";
		String s2="ajay";
		String s3="chorghade";
		String s4="vikaschorghade";
		String s5="zebra";
		String replace="kava is programming language kava is robust,kava is object oriented language";
		String replacestring=replace.replace("kava", "java");
		System.out.println(replacestring);
		StringBuilder sb=new StringBuilder("java");
		sb.append("kava");
		System.out.println(sb);
		String s=s1.concat(" "+s3);
		String s6=new String("vikas"); 
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s4.substring(0,6));
		/*StringBuffer sb=new StringBuffer("");
		//System.out.println(sb.capacity());
		//sb.append("java");
		//System.out.println(sb.capacity());
		//sb.append("hi my name is vikas i am 27 yrs old");
		System.out.println(sb.capacity());
	*/
		
		}
		}
	
		
		
