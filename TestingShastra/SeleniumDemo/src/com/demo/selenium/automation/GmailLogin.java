package com.demo.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
WebDriverManager.chromedriver().setup();

driver=new ChromeDriver();
driver.get("https://accounts.google.com/signup");
//driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vishal");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//driver.findElement(By.xpath("//span[contains(text(),'Use my current email address instead')]")).click();



Thread.sleep(10000);
driver.quit();

	}

}
