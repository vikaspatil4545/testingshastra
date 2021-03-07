package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implictwaitdemo {
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("vikas");
	driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("chorghade");
	
	
	}
}
