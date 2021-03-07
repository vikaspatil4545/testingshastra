import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstselenium {
	
	public void tc_01() 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	//driver.get("file:///D:/htmlprog/first.html");
	driver.get("file:///D:/htmlprog/first.html");
	WebElement Username= driver.findElement(By.id("uname"));
	Username.sendKeys("Vikas");
	
	WebElement Password= driver.findElement(By.id("passwd"));
	Username.sendKeys("Vik@12345");
	}
	private void mai() {
		// TODO Auto-generated method stub
		new firstselenium().tc_01();
		System.out.println("hello");

	}
	
}


