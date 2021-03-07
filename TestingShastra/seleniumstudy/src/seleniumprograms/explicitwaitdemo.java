package seleniumprograms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/*import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
*/


	public class explicitwaitdemo 
	{
		
	void tc_01()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9921191942");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("vikas");
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.pollingEvery(10, TimeUnit.SECONDS);
		wait.ignoring(ArithmeticException.class,TimeoutException.class);
		wait.withMessage("Elements is not clickable at the moment");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")));
		driver.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click();
		System.out.println("click on sign up button");
		
		
	}
	public static void main(String[] args) {
		explicitwaitdemo obj =new  explicitwaitdemo();
		obj.tc_01();
	}
	}
	
	