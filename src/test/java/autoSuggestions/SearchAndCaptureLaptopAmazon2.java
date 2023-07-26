package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCaptureLaptopAmazon2 {
public static void main(String[] args) throws InterruptedException {
	
	//step-1 Launch the Browser
			WebDriver driver=new ChromeDriver();
			
				
		//step-2 Maximize the window
			driver.manage().window().maximize();
			
		//step-3 Navigate to Amazon.com
			driver.get("https://www.amazon.com/");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[.='✕']")).click();
			
		//step-4 search for laptop        
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
			//driver.findElement(By.id("nav-search-submit-button")).click();
			
		//step-5 capture all the laptop
			Thread.sleep(2000);
			List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			for(WebElement ele:list)
			{
				String laptopName = ele.getText();
				if(laptopName.contains("HP"))
				{
					System.out.println(ele.getText());
					ele.click();
					break;
				}
			}
}
}
