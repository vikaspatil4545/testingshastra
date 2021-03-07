package com.demo.seleniumautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenBrowser {

public static void main(String[] args) {
	RemoteWebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signin");
	System.out.println("Chromebrowser is opened successfully");
	
}

		

	  

}

