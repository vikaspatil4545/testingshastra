package seleniumprograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousescrollusingaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.testingshastra.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		Thread.sleep(5000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();

	}

}
