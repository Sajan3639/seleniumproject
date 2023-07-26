package pratice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Aa {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kritiindustries--qa.sandbox.lightning.force.com/lightning/n/journet_creation");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kriti_admin@krazy-tech.com.qa");
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	Actions a=new Actions(driver);
	a.doubleClick(pass).perform();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("krazy098");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("18-Jun-2023");
	Thread.sleep(5000);
	//WebDriver f=driver.findElement(By.xpath("//button[@aria-hasspopup='listbox' and @aria-label=\"select"]")).sen
		//	Select t=new Select(f);
			//t.selectByValue("Agriculture");
}
}
