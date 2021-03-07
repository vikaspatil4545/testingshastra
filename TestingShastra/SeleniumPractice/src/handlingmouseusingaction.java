import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingmouseusingaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	String parent = driver.getWindowHandle();
	Set<String> childwindows = driver.getWindowHandles();
	for (String window : childwindows) {
		if (window.equals(parent)) {
			System.out.println("do nothing");
		} else {
			driver.switchTo().window(window);
			System.out.println(" " + driver.getTitle());
			driver.close();
		}
	}
	Actions action= new Actions(driver);
		driver.switchTo().window(parent);
		WebElement clk = driver.findElement(By.xpath("//a//div[contains(text(),\"Jobs\")]"));
		action.moveToElement(clk);
		action.perform();
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//div//ul//li//div//a[@title=\"Search Jobs\"]"));
		action.contextClick(name);
		action.perform();
	}

	
}
