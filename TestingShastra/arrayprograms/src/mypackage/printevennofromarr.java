package mypackage;

public class printevennofromarr 
{
public static void main(String[] args) 
{
int a[][]= {{10,45,98,47,63,},{12,0,2,8,9,5,7,},{33,5,8,7,6,9,}};
for (int i = 0; i < a.length; i++) 
{
for (int j = 0; j < a[i].length; j++) 
{
if(a[i][j]%2==0)
{
	System.out.print(" "+a[i][j]);
}
}	
System.out.println();
}

}
}
