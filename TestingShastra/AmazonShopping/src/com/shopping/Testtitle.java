package com.shopping;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testtitle {
	
	 RemoteWebDriver driver;
	 public String expected = null;
	    public String actual = null;
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	         WebDriverManager.chromedriver().setup();
	         driver =new ChromeDriver();
	         driver.manage().window().maximize();
	          driver.get("http://demo.guru99.com/test/newtours/");
	          
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	          @Test(priority = 0)
	      public void register(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	      }
	          @Test(priority = 1)
	      public void support() {
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	      }
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	            driver.findElement(By.linkText("Home")).click() ;
	      }
	       
	      @AfterTest
	      public void terminateBrowser() throws InterruptedException{
	    	  Thread.sleep(1000);
	          driver.close();
	      }
}
