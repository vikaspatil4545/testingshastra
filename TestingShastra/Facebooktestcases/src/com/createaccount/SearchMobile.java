/*1.Open a browser
2.Enter url as www.flipkart.com
3.Check whether flipkart page is opened or not
4.If it is opened perform the required operations and display on the console that flipkart page is opened.
5.Perform mouse over electronics
6.Click on Mobiles
7.Click on samsung
8.Select the price range
9.Select the first mobile
10.Close the browser

Automation script:
-------------------------
FlipKartTestCase.java
----------------------------
*/

package com.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchMobile {
	RemoteWebDriver driver;
	String expecteTitle = "Online Shopping site for mobile";
	String actualValue;

	@BeforeTest
	public void launchingIEBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		actualValue = driver.getTitle();
		System.out.println(actualValue);

	}

	@Test(priority = -1)
	public void closingpupup() {
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		System.out.println("popup window is closed successfully");

	}

	@Test(priority = 0)
	public void testScript() throws InterruptedException {

		Actions a = new Actions(driver);
		WebElement name = driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
		a.moveToElement(name).build().perform();
		Thread.sleep(2000);
	}

	// clcik on mobiles
	@Test(priority = 1)
	public void chooseMobile() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[@title=\"Apple\"]")).click();
		Thread.sleep(2000);
	}

	// select the price range
	@Test(priority = 2)
	public void selectTheIphone8plus() {
		driver.findElement(By.xpath("//div[@data-tkid=\"M_30ce68fa-dbbd-4b54-b2e7-d08276ef723c_7.W8OZI07LNL\"]"))
				.click();

	}

}
