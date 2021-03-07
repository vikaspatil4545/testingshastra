package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehandlingdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		WebElement course=driver.findElement(By.xpath("//a[contains(text(),'Courses')]"));
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(course).perform();
		
		
	}

}
