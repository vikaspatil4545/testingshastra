package seleniumprograms;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webdriiverdemo {
	public static void main(String[] args){
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String parent=driver.getWindowHandle();
	Set<String>allwindows=driver.getWindowHandles();
	for(String windows:allwindows)
	{
		if(windows.equals(parent))
		{
			System.out.println("do nothing");
		}
		else
		{
			driver.switchTo().window(windows);
			System.out.println("closing child window: "+driver.getTitle());
		driver.close();
		}
	}
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//span[@class=\"searchJob\"]")).click();
		
		  driver.findElement(By.xpath("//input[@placeholder=\"Skills, Designations, Companies\"]")).sendKeys("Amdocs");
		  driver.findElement(By.xpath("//input[@placeholder=\"Location/Locality\"]")).sendKeys("pune");
		 driver.findElement(By.xpath("//button[@id=\"qsbFormBtn\"]")).click();
		 							 
	}

}
