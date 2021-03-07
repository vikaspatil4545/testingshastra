package com.handlingtable;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HandlingDynamicTable {

	@Test
	public static void handlingTable() throws InterruptedException {

		
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://money.rediff.com/companies/market-capitalisation?src=moneyhome_topmarketcapital_more");
		  //driver.get("https://money.rediff.com/index.html");
		  //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
		    WebElement table = driver.findElement(By.cssSelector("[class=\"dataTable\"]")); 
		    if(table.isDisplayed()) 
		    { 
		    System.out.println("my table is ready to test");
		  List<WebElement> rows =driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
		  System.out.println("Printing number of rows:-" + rows.size());
		  
		  List<WebElement> cols=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));
		  System.out.println("Printing number of colums:-" + cols.size());
		  
		  String text=driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td[4]")).getText();
		  System.out.println("Printing text of 1st row 4th column:-"+text);
		   } 
		  // Thread.sleep(5000); // JavascriptExecutor js=(JavascriptExecutor)driver;
		  // js.executeAsyncScript("window.scrollBy(0,5000)"); 
		    String title =driver.getTitle(); 
		 Assert.assertTrue(title.equals(title),"Title is in correct"); }
	}

