package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCapturePhonesAmazon1 {
public static void main(String[] args) throws InterruptedException {
	
	//step-1 Launch the Browser
		WebDriver driver=new ChromeDriver();
		
			
	//step-2 Maximize the window
		driver.manage().window().maximize();
		
	//step-3 Navigate to Amazon.com
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		
	//step-4 search for redMi Phones         
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		//System.out.println("search button is clicked");
		
	//step-5 capture all the phones
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for(WebElement element1:list)
		{
		String value = element1.getText();
			System.out.println(value);
		}

}
}
