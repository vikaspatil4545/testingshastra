import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingkeyboardusingrobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> childwindows = driver.getWindowHandles();
		for (String window : childwindows) {
			if (parent.equals(window)) {
				System.out.println("Do nothing");
			} else {
				driver.switchTo().window(window);
				System.out.println(" " + driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Tab is pressed first time");

		Thread.sleep(5000);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Tab is pressed second time");

		Thread.sleep(5000);

		
		robot.mouseMove(1000, 1000);
		System.out.println(" Mouse action is performed");

		Thread.sleep(3000);

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("mouse action is performed second time");

	}
}
