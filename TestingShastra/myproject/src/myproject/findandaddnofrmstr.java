package myproject;

public class findandaddnofrmstr {

	public static void main(String[] args) {
	
		String st="vikas4 is8 good4 boy3";
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
		char temp=st.charAt(i);
		if(Character.isDigit(temp))
		{
			int b=Integer.parseInt(String.valueOf(temp));
			sum=sum+b;
		}
		}
		System.out.println();
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
