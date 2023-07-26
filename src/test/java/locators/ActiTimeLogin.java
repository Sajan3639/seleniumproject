//ACTTIME HOME PAGE
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.name("username")).sendKeys("trainee");
	driver.findElement(By.name("pwd")).sendKeys("trainee");
	driver.findElement(By.id("loginButton")).click();
	
}
}
