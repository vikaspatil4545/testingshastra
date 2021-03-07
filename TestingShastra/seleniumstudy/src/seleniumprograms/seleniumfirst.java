
package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumfirst 
{
	public void tc_01()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver ch=new ChromeDriver();
	ch.get("file:///D:/htmlprog/first.html");

		WebElement Username= ch.findElement(By.id("uname"));
		Username.sendKeys("ajay");
		ch.findElement(By.name("passwd")).sendKeys("12345");
		ch.findElement(By.tagName("button"));
		//WebElement Password= ch.findElement(By.name("passwd"));
		//Username.sendKeys("Vik@12345");
	}
	public static void main(String[] args)
		{
			new seleniumfirst().tc_01();
			System.out.println("hello");
		}	
	
}
