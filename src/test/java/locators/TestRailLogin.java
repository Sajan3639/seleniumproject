package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRailLogin {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://wppe9ab.testrail.io/index.php?/auth/login/");
	Thread.sleep(3000);
	driver.findElement(By.id("name")).sendKeys("manikanta.wppe7@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("Qspbtr@123");
	Thread.sleep(3000);
	driver.findElement(By.id("button_primary")).click();
	Thread.sleep(3000);
}
}
