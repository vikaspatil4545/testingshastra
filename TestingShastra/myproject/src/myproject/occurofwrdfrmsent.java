package myproject;
public class occurofwrdfrmsent {

	public static void main(String[] args) {
		//String string="Spring is beautiful but so is winter";
		String string=" is  is is winter";
		
		String word="is";
		String temp[]=string.split("");
		int count=0;
		for (int i = 0; i < temp.length; i++) {
			if(word.equals(temp[i]))
				count++;
		}
		System.out.println("The strng is:-"+string);
		//System.out.println(count);
		System.out.println("The word "+ word + " occurs "+ count +" times in the above string");
		
		// TODO Auto-generated method stub

	}

}
