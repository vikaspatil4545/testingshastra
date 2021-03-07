package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousedraganddrop {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		//driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement hold=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Thread.sleep(5000);
		action.dragAndDrop(hold, drop).perform();
		
	}
}
