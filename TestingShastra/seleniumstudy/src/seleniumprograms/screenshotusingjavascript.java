package seleniumprograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotusingjavascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,2000)");
	

	}

}
