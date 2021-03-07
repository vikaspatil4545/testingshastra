package com.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookbus {
	 RemoteWebDriver driver;
	 public String expected = null;
	    public String actual = null;
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	         WebDriverManager.chromedriver().setup();
	         driver =new ChromeDriver();
	         driver.manage().window().maximize();
	          driver.get("https://www.redbus.in/");
	          
	      }
	      
	      
	          @Test(priority = 0)
	      public void bookBus() throws InterruptedException{
	        	  driver.findElement(By.xpath("//input[@tabindex=\"1\"]")).sendKeys("Pune");
	        	  driver.findElement(By.xpath("//input[@tabindex=\"2\"]")).sendKeys("Mumbai");
	        	driver.findElement(By.xpath("//label[contains(text(),\"Onward\")]")).click();
	        	driver.findElement(By.xpath("//div[@id=\"rb-calendar_return_cal\"]/table/tbody/tr/td[@class=\"monthTitle\"]"));
	        	driver.findElement(By.xpath("//button[@class=\"fl button\"]")).click();
	      }
	      
	       
	     
}
