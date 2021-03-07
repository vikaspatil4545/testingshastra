package com.createaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicedifferentfunctions {
	RemoteWebDriver driver;
	String parent;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		parent = driver.getWindowHandle();
	}
/**
 * To verify MouseDrag is performed.
 */
	@Test
	public void tc_01() {
		driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/draggable/\"]")).click();
		driver.switchTo().frame(0);
		WebElement hold = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));// .click();
		Actions action = new Actions(driver);
		action.dragAndDropBy(hold, 30, 40).build().perform();

	}
/**
 * To verify Mouse is Drag and Drop to the correct Destination
 */
	@Test
	public void tc_02() throws InterruptedException {
		driver.switchTo().window("");
		driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/droppable/\"]")).click();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDrop(drag, drop).build().perform();
		Assert.assertEquals(drop.getText(), "droppable");

	}
/**
 * To verify Proper date is to be select
 */
	@Test
	public void tc_03() {
		driver.switchTo().window("");
		driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/datepicker/\"]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"25\"]")).click();
	}
/**
 * To verify Tool tip is Shown after Mousehover
 */
	@Test
	public void tc_04() {
		driver.switchTo().window("");
		driver.findElement(By.xpath("//a[text()=\"Tooltip\"]")).click();
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		action.moveToElement(driver.findElement(By.xpath("//a[text()=\"Tooltips\"]"))).build().perform();

	}
	
/**
 * To Resize the textfeild
 */
	@Test(priority = 1)
	public void tc_05() {
		driver.switchTo().window("");
		driver.findElement(By.xpath("//a[text()=\"Resizable\"]")).click();
		driver.switchTo().frame(0);
		WebElement resizable = driver.findElement(By.xpath("//div[3][@style=\"z-index: 90;\"]"));
		Actions action = new Actions(driver);
		action.clickAndHold(resizable).dragAndDropBy(resizable, 30, 30).build().perform();

	}
	
	/**
	 * To verify the spin 
	 */
	@Test
	public void tc_06() throws InterruptedException {
		driver.switchTo().window("");
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[text()=\"Spinner\"]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		driver.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-triangle-1-s\"]"));
		driver.findElement(By.xpath("//span[@class=\"ui-button-icon ui-icon ui-icon-triangle-1-n\"]")).click();
		WebElement disable=driver.findElement(By.xpath("//button[@id=\"disable\"]"));
		disable.click();
		Thread.sleep(3000);
		WebElement toggle=driver.findElement(By.xpath("//button[@id=\"destroy\"]"));
		action.doubleClick(toggle).build().perform();
		action.release(toggle);
		System.out.println("double clcik is performed");
		WebElement getvalue=driver.findElement(By.xpath("//button[@id=\"getvalue\"]"));
		action.click(getvalue).build().perform();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebElement setvalue=driver.findElement(By.xpath("//button[@id=\"setvalue\"]"));
		action.click(setvalue).build().perform();
		
		
	}

}
