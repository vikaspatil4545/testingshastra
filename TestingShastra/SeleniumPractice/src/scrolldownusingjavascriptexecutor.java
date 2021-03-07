
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolldownusingjavascriptexecutor {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("window.scrollBy(0,2500)");

	}

}
