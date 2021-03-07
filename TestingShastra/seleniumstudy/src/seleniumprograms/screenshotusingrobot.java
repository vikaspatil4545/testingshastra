package seleniumprograms;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotusingrobot {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/htmlprog/first.html");
		 driver.manage().window().maximize();
		 Rectangle rect=new Rectangle();
		 rect.setRect(0,0,2000,2000);
		 Robot robo=new Robot();
		 BufferedImage img=robo.createScreenCapture(rect);
		
		 try {
			ImageIO.write(img, "PNG", new File("D:\\screenshot/facebookscreemshot.PNG"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	