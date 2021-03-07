package seleniumprograms;


import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usingrobot {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		/*
		 * FluentWait wait=new FluentWait(driver);
		 * //wait.ignoring(TimeoutException,ElementNotInteractableException);
		 * wait.ignoring(TimeoutException.class, ArithmeticException.class);
		 * //wait.withMessage("Url is not hitting at this moment");
		 * //wait.until(ExpectedConditions.urlContains("https://www.naukri.com/"));
		 */
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		Set<String>childwindows=driver.getWindowHandles();
		for(String window:childwindows)
		{
			if(parent.equals(window))
			{
				System.out.println("do nothing");
			}
			else
			{
				driver.switchTo().window(window);
				System.out.println("get title of child windows:"+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Actions act=new Actions(driver);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		System.out.println("tab is press first time");
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		System.out.println("tab is press second time");
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		//robot.keyRelease(KeyEvent.VK_A);
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		//WebElement click=driver.findElement(By.xpath("//div[@class=\"subMenu c2\"]/ul/li/a[@href=\"https://www.naukri.com\"]"));
		//System.out.println("going to clcik on the mouse");
		//act.moveToElement(click);
		//robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		//robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		/*
		 * act.keyDown(Keys.TAB); act.keyUp(Keys.TAB); act.build().perform();
		 * System.out.println("tab is click first time");
		 * 
		 * act.keyDown(Keys.TAB); act.keyUp(Keys.TAB); act.build().perform();
		 * System.out.println("tab is click second time");
		 * 
		 * WebElement click=driver.findElement(By.
		 * xpath("//div[@class=\"subMenu c2\"]/ul/li/a[@href=\"https://www.naukri.com\"]"
		 * )); act.contextClick(click);
		 */
	}

}
