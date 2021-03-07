package myproject;

interface I1
{
 void run1();


}
interface  I2 
{
	 void run1();
	default void run()
	{
		System.out.println("i am default concrete method of m2");
	}
}
public class interfacedemo implements I1,I2 {
	
	 public void run1()
	 {
		 System.out.println("bye");
	 }
	public static void main(String[] args) {
		
		interfacedemo d=new interfacedemo();
		d.run1();
		d.run();
	}

}
