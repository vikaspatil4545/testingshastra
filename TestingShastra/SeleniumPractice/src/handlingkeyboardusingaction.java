import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingkeyboardusingaction {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		WebElement email= driver.findElement(By.xpath("//input[@type=\"email\"]"));
		act.sendKeys(email, "9921194982").perform();
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		act.sendKeys(pass, "Vikasc").perform();;
		WebElement log=driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
		act.click(log).perform();
	}

}
