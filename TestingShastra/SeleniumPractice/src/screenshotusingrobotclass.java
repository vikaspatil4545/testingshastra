import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotusingrobotclass {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Robot robot = new Robot();
		Rectangle rect = new Rectangle();

		rect.setRect(0, 0, 1500, 100);
		BufferedImage img = robot.createScreenCapture(rect);
		ImageIO.write(img, "PNG", new File("D:\\screenshot/img.PNG"));

	}

}
