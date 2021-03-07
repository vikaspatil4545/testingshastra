package Ashotdemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Ashotscreenshotdemo {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com/");
		//AShot ashot=new AShot();
		AShot ashot =new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot sc=ashot.takeScreenshot(driver);
		BufferedImage image=sc.getImage();
		ImageIO.write(image, "PNG", new File("D:\\screenshots/second.png"));

	}

}
