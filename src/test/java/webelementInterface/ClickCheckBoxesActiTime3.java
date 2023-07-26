package webelementInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBoxesActiTime3 {
public static void main(String[] args) throws InterruptedException {
	
			//step-1 Launch the Browser
			WebDriver driver=new ChromeDriver();
			
			//step-2 Maximize the window
			driver.manage().window().maximize();
			
			//step-3 Load the URL Demo- ActiTime app
			driver.get("https://demo.actitime.com/login.do");
			
			//step-4 Identify the username textField and enter UserName
			driver.findElement(By.className("textField")).sendKeys("admin");
			
			//step-5 Identify the password textField and enter password
			driver.findElement(By.name("pwd")).sendKeys("manager");
			
			
		//step-6 Identify the login button and click
			driver.findElement(By.id("loginButton")).click();
			
			//step-7 clicks on task
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
			
			//step-8 click on all check boxes
			Thread.sleep(2000);
			 List<WebElement> list = driver.findElements(By.xpath("//div[@class='img']"));
			for(WebElement ele:list)
			{
				ele.click();
				Thread.sleep(1000);
			}
}
}
