package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookxpathdemo  
  {
	
public void tc_01()
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver ch=new ChromeDriver();
	ch.get("http://www.facebook.com");
	//WebElement 	var=ch.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div[2]/div/div/div/span"));
	WebElement var=ch.findElement(By.xpath
("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label[@for=\"email\"]"));
	System.out.println("Text of the first page"+var.getText());
	
}
public static void main(String[] args)
{
	facebookxpathdemo obj=new facebookxpathdemo();
	obj.tc_01();
	
}

  }
