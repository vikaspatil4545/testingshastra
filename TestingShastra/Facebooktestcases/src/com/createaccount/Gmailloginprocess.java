package com.createaccount;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailloginprocess {
	RemoteWebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		System.out.println("Chromebrowser is opened successfully");

	}

	  @Test(priority =0)
	  public void loginwithcredentials(){
		driver.findElement(By.id("identifierId")).sendKeys("vikas");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

	}

}
