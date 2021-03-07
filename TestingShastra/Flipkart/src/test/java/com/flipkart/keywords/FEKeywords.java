package com.flipkart.keywords;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEKeywords {
	public static WebDriver driver;
	private static Logger log = Logger.getLogger(FEKeywords.class);

	public static void openBrowser(String browsername) {
		switch (browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Opening" + browsername + "browser");
			break;
		case "Firefox":

			driver = new ChromeDriver();
			log.info("Opening" + browsername + "browser");
			break;
		case "InternetExplorer":
				driver = new ChromeDriver();
			log.info("Opening" + browsername + "browser");
			break;
			
		case "Headless":
			driver = new HtmlUnitDriver();
		log.info("Opening" + browsername + "browser");
		break;

		default:
			log.error("Invalid browser name");
			break;
		}

	}
	
	public static void openUrl(String url)
	{
		driver.get(url);
	}
	
	public static void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}

}



