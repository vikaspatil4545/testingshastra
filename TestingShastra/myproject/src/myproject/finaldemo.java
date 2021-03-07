package myproject;
 class student
{
	 final int a;
	 public student() {
		// TODO Auto-generated constructor stub
		 a=10;
		 //System.out.println(a);
		 System.out.println(a);
		 System.out.println();
		 System.out.println();
	}
	 
	final void  study()
	{
		System.out.println("i am method of study of student class");
	}
	//
}
	class finaldemo extends student{
		  
				int speedlimit =100;
							/*void study() {
					System.out.println("i am method of study of finaldemo class");
					
				} */
					void run()
				{
					//speedliit=120;
					System.out.println(speedlimit);
				}
				public static void main(String[] args) {
				
					finaldemo fd=new finaldemo();
					
					fd.study();
					fd.run();
						}
				}
