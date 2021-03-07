package myproject;

 class overriding 
{
	    void honda()
	{
		System.out.println("honda is a brand of bikes");
	}
}
	class overridingdemo extends overriding
	{
		 void honda() 
		{
			System.out.println("unicorn is my favourite bike");
		}
		public static void main(String[] args) {
			
			overridingdemo o=new overridingdemo();
			o.honda();
			
		}
	}
	
	
