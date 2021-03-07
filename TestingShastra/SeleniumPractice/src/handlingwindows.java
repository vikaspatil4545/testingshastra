import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingwindows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		System.out.println(" "+driver.getTitle());
		String parent=driver.getWindowHandle();
		Set<String> childwindow=driver.getWindowHandles();
		for(String window:childwindow)
		{
			if(window.equals(parent))
			{
				System.out.println("do nothing");
			}
			else {
				driver.switchTo().window(window);
				System.out.println(" "+driver.getTitle());
				driver.close();
				
			}
			
		}
		driver.switchTo().window(parent);
		System.out.println(" "+driver.getTitle());
	}

}
