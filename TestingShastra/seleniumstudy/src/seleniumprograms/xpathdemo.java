package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo 
{	
	public void tc_01() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver ch=new ChromeDriver();
		//ch.get("file:///D:/htmlprog/first.html");
		ch.get("http://www.testingshastra.com/");
		//WebElement placedcount=ch.findElement(By.xpath("//span[text()='Call Support']"));
		//WebElement placedcount=ch.findElement(By.xpath("html/body/div/a=skip to content"));
		//WebElement placedcount=ch.findElement(By.xpath("html/body/div/div/section[4]/div/div/div[2]/div[2]/span[@class=\"counter_count\"]"));
		//WebElement placedcount=ch.findElement(By.xpath("html/body/div/div/section[4]/div/div/div/div/span[@class=\"counter_count\"]"));
		//WebElement placedcount =ch.findElement(By.xpath("html/body/div/div/section[2]/div/div/div/div[2]/span[@class=\"title_one wow fadeInUp\"]"));
		
		// Absolute Xpath
		//WebElement placedcount=ch.findElement(By.xpath("html/body/div/div/section[4]/div/div/div[2]/div[4]/span[@class='counter_title']"));
		
		// Relative Xpath
		WebElement placedcount=ch.findElement(By.xpath("//span[@class='counter_count']"));
		System.out.println("placed student so far is :-"+placedcount.getText());
	}
	public static void main(String[] args) {
		new xpathdemo().tc_01();
		System.out.println("hello  i am vikas");
	}
}
