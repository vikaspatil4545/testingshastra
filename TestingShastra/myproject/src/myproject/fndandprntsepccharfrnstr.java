package myproject;

import java.util.regex.Pattern;

public class fndandprntsepccharfrnstr {

	public static void main(String[] args) {
		String s="add # *& ; ,! ...////";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("i");
		String REGEX="[^&%$#@!~,]*";
		Pattern pattern=Pattern.compile(REGEX);
		/*Matcher matcher=Pattern.matcher();
		if(matcher.matches())
		{
			System.out.println("matched");
		}*/
		// TODO Auto-generated method stub

	}

}
