package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingpopups {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		String parent=driver.getWindowHandle();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.findElement(By.xpath("//a[@onclick=\"click_savebtn()\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"w3-btn w3-red\"]")).click();
		String name=driver.getTitle();
		System.out.println("Title of the page is: "+name);
		System.out.println(parent);
		
	}

}
