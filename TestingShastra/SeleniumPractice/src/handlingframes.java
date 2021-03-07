import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingframes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://canarabank.com/english/");
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"market_update\"]")));
		 WebElement name=driver.findElement(By.xpath("//span[contains(text(),\"NSE\")]"));
		 System.out.println(" "+name.getText());
	}

}
