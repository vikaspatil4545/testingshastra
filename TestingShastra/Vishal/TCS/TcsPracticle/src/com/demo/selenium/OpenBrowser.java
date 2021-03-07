package com.demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	System.out.println("Browser Open Successfully");
	
driver.get("http://Amazon.in");

driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("LG Washing Machine");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

driver.findElement(By.linkText("LG 6.5 Kg 5 Star Smart Inverter Fully-Automatic Top Loading Washing Machine (T65SNSF1Z, Middle Free Silver, TurboDrum)")).click();
driver.switchTo().frame("");

driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
Thread.sleep(5000);

driver.quit();

	}

}
