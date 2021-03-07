import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;

public class fullpagescreenshotusingashot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com/");
		AShot ashot=new AShot();
		

	}

}
