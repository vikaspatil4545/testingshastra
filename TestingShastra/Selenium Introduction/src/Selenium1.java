import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {
	
	public void tc_01() 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://www.testingshastra.com/");
	//WebElement placedCount=driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div[2]/span"));
	WebElement placedCount=driver.findElement(By.xpath("/html/body/div/div/section[4]/div/div/div[2]/div[2]/span[@class=\"counter_count\"]"));
	//WebElement placedCount1=driver.findElement(By.xpath("//div[@class='counter_two_wrap wow fadeInUp']/span[@class='counter_']"));
	System.out.println("Total students placed so far: "+placedCount.getText());
	System.out.println("done");
	//WebElement Username= driver.findElement(By.id("uname"));
	//Username.sendKeys("Vikas");
	
	//WebElement Password= driver.findElement(By.id("passwd"));
	//Username.sendKeys("Vik@12345");
	}

	public static void main(String[] args) {
		///WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chome.driver", "C:\\Users\\dell\\Desktop\\chromedriver.exe");
		///WebDriver ch = new ChromeDriver();
		///ch.get("https://www.facebook.com");
		
		//ChromeDriver ch=new ChromeDriver();
		new Selenium1().tc_01();
		
		

	}

}
