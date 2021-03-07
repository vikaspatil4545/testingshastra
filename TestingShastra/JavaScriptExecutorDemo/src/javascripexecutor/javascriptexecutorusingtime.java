package javascripexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutorusingtime {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		long start=System.currentTimeMillis();
		((JavascriptExecutor)driver).executeAsyncScript("window.setTimeout(arguments[agruments.length-5])");
		System.out.println("Elapsed time: "+(System.currentTimeMillis()-start));
		jse.executeAsyncScript("window.scrollBy(0,2000)",10);
		
	}

}
