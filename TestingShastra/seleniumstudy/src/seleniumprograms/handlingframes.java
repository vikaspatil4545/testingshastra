package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingframes {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.canarabank.com/english/");
		driver.findElement(By.xpath("//a[@href=\"/english/bank-services/personal-banking/\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"iframe-container1\"]/iframe[@id=\"market_update\"]")));
	WebElement var=driver.findElement(By.xpath("//span[@id=\"BSECurrentLabel\"]"));
		System.out.println(" "+var.getText());
		
		  	}

}
