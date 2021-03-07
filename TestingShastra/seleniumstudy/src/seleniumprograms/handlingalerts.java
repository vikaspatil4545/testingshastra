package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class handlingalerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//example of simple alert
		driver.get("http://testingshastra.com/Assignments/SimpleAlert.html");
		driver.findElement(By.name("YourName")).sendKeys("vikas");
		driver.findElement(By.xpath("//button[contains(text(),'Me')]")).click();
			Alert alert=driver.switchTo().alert();
			
			Thread.sleep(5000);
		alert.accept();
		//driver.findElement(By.xpath("//button[contains(text(),'Me')]")).click();
		//Thread.sleep(5000);
		//alert.accept();
		//example of prompt alert
		/* driver.get("http://testingshastra.com/Assignments/prompt.html");
		 driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		  Alert alert=driver.switchTo().alert(); alert.sendKeys("vikas");
		  alert.accept();
		  driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		 */	
		//example of comfirmation alert
		/*driver.get("http://testingshastra.com/Assignments/ConfirmationAlert.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		alt.accept();
		*/
	}	
	} 
		
//http://testingshastra.com/Assignments/SimpleAlert.html
