package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathaxeses 
{
		public void tc_01()
		{
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver ch=new ChromeDriver();
			ch.get("https://www.icicibank.com/");
			//WebElement var=ch.findElement(By.xpath("html/body/div/div/div/div/div/div[@class="btn inline-btn"]"));
			WebElement var=ch.findElement(By.xpath("//h2[@ class=\"text-center home-rdblogs\"]"));
			System.out.println(" "+var.getText());
			System.out.println(" "+ch.getTitle());
		}
	
	public static void main(String[] args) 
	{
		xpathaxeses o=new xpathaxeses();
		o.tc_01();
		
	}

}
