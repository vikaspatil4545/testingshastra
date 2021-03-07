
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingdifferentbroswer {

	RemoteWebDriver driver;

	@Parameters({ "browsername" })
	@Test
	public void launchdifferentbrowser(String browsername) {
		switch (browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("chrome browser is opened");
			break;

		case "Internetexplorer":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			System.out.println("hiting url in the brower");
			driver.get("https://www.facebook.com/");
			System.out.println("Internet Explorer browser is opened");
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("Firefox browser is opened");
			break;

		default:
			System.out.println("Invalid browser selected");

		}
	}

}
