
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo {
	
	public void tc_01() 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://www.testingshastra.com/");
	WebElement placedCount=driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div[2]/span"));
	//WebElement placedCount1=driver.findElement(By.xpath("//div[@class='counter_two_wrap wow fadeInUp']/span[@class='counter_']"));
	System.out.println("Total students placed so far: "+placedCount.getText());
	//WebElement Username= driver.findElement(By.id("uname"));
	//Username.sendKeys("Vikas");
	
	//WebElement Password= driver.findElement(By.id("passwd"));
	//Username.sendKeys("Vik@12345");
	}
	private void mai() {
		// TODO Auto-generated method stub
		new firstselenium().tc_01();

	}
	
}
