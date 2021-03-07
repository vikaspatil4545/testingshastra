import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.security.Credentials;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingalert {
	public static void main(String a[]) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//example of simple alert
		/*driver.get("http://testingshastra.com/Assignments/SimpleAlert.html");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		System.out.println("first time clicked");
		driver.findElement(By.name("YourName")).sendKeys("Vikas");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		System.out.println(" clicked successfully");
		driver.findElement(By.name("YourName")).clear();
		System.out.println("hence cleared successfully");
		*/
		//example of prompt alert
		/*driver.get("http://testingshastra.com/Assignments/prompt.html");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("vikas");
		Thread.sleep(5000);
		al.accept();
		al.sendKeys("26");
		Thread.sleep(5000);
		al.accept();
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);
		alt.accept();
		*/
		
		
		//example of confirmation alert
		driver.get("http://testingshastra.com/Assignments/ConfirmationAlert.html");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		System.out.println("canceled successfully");
		
		
	}

}
