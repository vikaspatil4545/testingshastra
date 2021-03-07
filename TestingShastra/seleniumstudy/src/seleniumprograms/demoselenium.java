package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoselenium {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver ch=new ChromeDriver();
		ch.get("http://www.facebook.com/");
		System.out.println("facebook is opened");
	}

}
