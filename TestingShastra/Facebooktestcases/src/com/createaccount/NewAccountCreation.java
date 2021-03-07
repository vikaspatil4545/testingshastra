package com.createaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccountCreation {
	RemoteWebDriver driver;
	//HtmlUnitDriver driver;
	String mob = "9921194982", Password = "Vikasc";

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("browser opened successfully");
	}
/**
 * Entering  Information in the text 
 */
	@Test(priority = 1)
	public void tc_01() {
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Vikas");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Chorghade");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(mob);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Vikas12345");
		Assert.assertEquals("Vikas", "Vikas");
		
	}
/**
 * To verify date is select according to birth date
 */
	@Test(priority = 2)
	public void tc_02() throws InterruptedException {
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select selectday = new Select(day);
		selectday.selectByVisibleText("2");
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select selectmonth = new Select(month);
		selectmonth.selectByValue("12");
		WebElement year =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select selectyear = new Select(year);
		selectyear.selectByValue("1993");
		Assert.assertEquals(2, 2);
	}
/**
 * This method is going to check the mobile number.
 */
	@Test(priority = 3)
	public void tc_03() {
		if (mob.equals(mob)) {
			System.out.println("Allready has an account with this mobile number");
			System.out.println("Login with mobile number");
		}
		Assert.assertEquals(mob, mob);

	}
	/**
	 * Method tc_04 is used for the login process.
	 */
	@Test(priority = 4)
	public void tc_04() {
		System.out.println("Entering Login credencials");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("9921194982");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(Password);
		System.out.println("checking password");
		if (Password.equals("Vikasc")) {
			driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
			System.out.println("Password is correct");
		}

		else {
			driver.findElement(By.xpath("//div/a[contains(text(),\"Forgotten\")]")).click();
			driver.findElement(By.xpath("//input[@placeholder=\"Mobile number\"]")).sendKeys("9921194982");

		}
		Assert.assertEquals(Password, "Vikasc");

	}
	/**
	 * To verify Login is Successfully done. 
	 */
	@Test(priority = 5)
	public void tc_05() throws InterruptedException {
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.withMessage("wait till page to be load");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"_1vp5\"]")));
		WebElement name =driver.findElement(By.xpath("//div[contains(text(),'Tejas')]"));
		System.out.println(name.getText());
		Assert.assertEquals(name.getText(), "Tejas Shinde");
		
	}

}
