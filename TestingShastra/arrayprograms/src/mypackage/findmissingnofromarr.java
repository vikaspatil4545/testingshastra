package mypackage;

public class findmissingnofromarr 
{
public static void main(String[] args) 
{
	int currno=0;
int a[]= {2,5,9,4,6,5,};
for (int i = 0; i < a.length; i++)
{
currno=a[i];
if(a.length!=(i+1))
{
	if(currno+1!=a[i+1])
	{
		currno++;
		for (int j=currno; j <a[i+1]; j++) 
		{
		System.out.print(" "+j);	
		}
	}
}
}
	
}
}
