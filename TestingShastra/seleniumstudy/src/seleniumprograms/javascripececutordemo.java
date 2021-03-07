package seleniumprograms;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class javascripececutordemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\screenshot/image1.jpng"));

	}
}

/*
 * JavascriptExecutor jse=(JavascriptExecutor)driver; Thread.sleep(3000);
 * jse.executeScript("scrollby(0,2500)");
 * jse.executeScript("scrollBy(0,2500)");//, arg1)
 */