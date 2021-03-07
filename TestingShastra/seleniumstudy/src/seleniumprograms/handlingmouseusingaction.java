package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingmouseusingaction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().deleteAllCookies();
		//driver.get("http://www.testingshastra.com/");
		driver.get("http://www.testingshastra.com/");
		driver.manage().window().maximize();
		WebElement mouclick=driver.findElement(By.xpath("//a[@class=\"sf-with-ul\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouclick).perform();
		List<WebElement> ele= driver.findElements(By.xpath("//ul[@class=\"sub-menu\"]/li"));
		for(WebElement element:ele)
		{
			
			System.out.println("\t"+element.getText());
		}
	
		/*driver.get("https://www.facebook.com");
		WebElement phoneno=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		WebElement log=driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
		Actions act=new Actions(driver);
		act.sendKeys(phoneno,"9921194982");
		System.out.println("Phone number is entered");
		act.sendKeys(pass,"Vikasc");
		System.out.println("password is entered");
		act.build().perform();
		System.out.println("going to click on log in button");
		act.moveToElement(log).click().perform();
			
*/
	}

}
