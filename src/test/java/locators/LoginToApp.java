package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {
public static void main(String[] args) {
	
	//step-1 Launch the Browser
	WebDriver driver=new ChromeDriver();
	
	//step-2 Maximize the window
	driver.manage().window().maximize();
	
	//step-3 Load the URL Demo- vtiger app
	driver.get("http://localhost:8888/");
	
	//step-4 identify UserName in Demo Vtiger
	WebElement usernameEle = driver.findElement(By.name("user_name"));
	//perform action on webelement identified
	usernameEle.sendKeys("admin");
	
	//step-5 identify Password in Demo Vtiger
	WebElement passwordEle = driver.findElement(By.name("user_password"));
	//perform action on webelement identified
	passwordEle.sendKeys("admin");
	
	//step-6 identify login button in Demo Vtiger
	//identify the login button in Demo vtiger
	driver.findElement(By.id("submitButton")).click();
//	WebElement loginEle = driver.findElement(By.id("submitButton"));
	
	//perform action on webelement identified
//	loginEle.click();
	
}
}
