package com.demo.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUpPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("http://www.facebook.com");
driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Vishal");

driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7020301924");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vishal");


driver.manage().window().maximize();

	}

}
