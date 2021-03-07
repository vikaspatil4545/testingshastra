import java.io.File;
import java.io.IOException;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class screenshotusingashot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com/");
		AShot ashot=new AShot();
		/*Screenshot sc=ashot.takeScreenshot(driver);
		ImageIO.write(sc.getImage(), "PNG", new File("D:\\screenshot/screenshot2.PNG"));
	*/
		//screenshotusing shootingstragies
		Screenshot sc=ashot.shootingStrategy
				(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(sc.getImage(),"PNG", new File("D:\\screenshot/screenshot.PNG"));
	}
}
