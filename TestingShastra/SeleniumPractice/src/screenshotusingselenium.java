import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotusingselenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File("D:\\screenshot/3img.PNG"));
		
	}

}
