package mypackage;

public class fndprtnonvovel  
{
public static void main(String[] args) 
{
char a[][]= {{'a','b','c','d'},{'a','e','i','z','m','n'},{'d','e','k'},{'o','p','w','q'}};
for (int i = 0; i < a.length; i++) 
{
for (int j = 0; j < a[i].length; j++)
{
if(a[i][j]!='a'&& a[i][j]!='e'&& a[i][j]!='i'&&  a[i][j]!='o'&& a[i][j]!='u')
{
	System.out.print(" "+a[i][j]);
}
}
System.out.println();
}

}
}
