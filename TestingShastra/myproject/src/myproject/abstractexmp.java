package myproject;
abstract class Bank
{
	int a;
	
	abstract int rateofintrest();
	public Bank() {
		// TODO Auto-generated constructor stub
		 a=20;
	System.out.println(a);

	}
	int changeofintrest() {
		return 0;
		
	}
	
}
 class axis extends Bank
{
	int rateofintrest()
	{
		return 8;
		
	}
	
}
 class icici extends Bank
{
	int rateofintrest()
	{
		return 9;
		
	}
}
 class BOI extends Bank
{
	int rateofintrest()
	{
		return 8;
	}
}
public class abstractexmp {
public static void main(String[] args) {
	
	Bank b=new BOI();
	icici i=new icici();
	axis x=new axis();
	int a1=b.changeofintrest();
	int Bankofindiaintrest =b.rateofintrest();
	int icicbankintrest=i.rateofintrest();
	int axisbankintrest=x.rateofintrest();
	System.out.println(Bankofindiaintrest);
	System.out.println(icicbankintrest);
	System.out.println(axisbankintrest);
	System.out.println(a1);
}
}
