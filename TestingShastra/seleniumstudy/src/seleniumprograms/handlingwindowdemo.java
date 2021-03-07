package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingwindowdemo {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
	
		Set<String> allwindows=driver.getWindowHandles();
		for(String window:allwindows)
		{
			if(window.equals(parent))
			{
				System.out.println("Do nothing");
			}
			else
			{
				driver.switchTo().window(window);
				System.out.println("Closing child window: "+driver.getTitle());
				driver.close();
			
			}
			}
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//div[@data-ga-track=\"Jobs4U Section|Create New Alert\"]")).click();
		
		}
		
		
	}

