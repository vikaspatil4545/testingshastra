package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxbrowserdemo 
{
	public static void main(String[] args) 
	{
		
		/*WebDriverManager.iedriver().setup();
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("");
		*/
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("");
		
	}

}
