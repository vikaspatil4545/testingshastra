package com.demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tcs1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver;
 WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
 driver.get("https://accounts.google.com/signup");
 String s1=driver.getCurrentUrl();
 
 if(s1.equals("https://accounts.google.com/signup")) {
	 System.out.println("pass");
 }else {
	 System.out.println("Fail");
 }
 
 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("vishal");
 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("khaladkar");
 driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("v04406177");
 driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Vishal@123");
 driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Vishal123");
 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
 
 Thread.sleep(5000);
 
 driver.quit();

	}

}
