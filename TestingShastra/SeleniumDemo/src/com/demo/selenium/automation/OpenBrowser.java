package com.demo.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9921194982");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Vik@1216");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Account']/i"));
		//driver.findElement(By.)
		driver.findElement(By.xpath("//span[contains(@text,'Log Out')]")).click();
		
	}
}
