package seleniumprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingdropdowndemo 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
		Select select=new Select(day);
		select.selectByIndex(2);
		WebElement month=driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
		Select sel=new Select(month);
		sel.selectByIndex(12);
		WebElement year=driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
		Select yr=new Select(year);
		yr.selectByValue("1992");
		 List allmonths=sel.getOptions(); 
		 if(allmonths.size()==13) 
		 {
		 System.out.println("options are correct");
		 } 
		 else
		 {
		 System.out.println("options are not correct"); }
		 }

}
