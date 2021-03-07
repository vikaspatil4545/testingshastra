package myproject;
class b{
	b(){
		super();
		System.out.println("i am in constructor a");
	}
}
class intiliserdemo extends b{
	intiliserdemo()
	{
		
		System.out.println("i am in intiliserdemo constructor");
		
	}
	{
		
	System.out.println("i am in intialiser block");
	}
	public static void main(String[] args) {
		
		intiliserdemo i=new intiliserdemo();
	}
}