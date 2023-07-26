//WEBDRIVER ALL METHODS
package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws Throwable {
		//To Launch Browser
//		WebDriver driver=new ChromeDriver();
//		System.out.println("ChromeBrowser launch");
		
	//	Upcasted to chromedriver to webdriver interface
		WebDriver driver=new ChromeDriver();
		System.out.println("ChromeBrowser launch");
		
	//	To load url
		driver.get("https://www.facebook.com/");
		System.out.println("facebook is loaded");
		
	//To maximize the Browser
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
	//	To capture the page title
		String title = driver.getTitle();
		System.out.println("Page title is = "+title);
		
	//	To capture current URL
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL is = "+URL);
		
	//	To capture the source code of current page
		String sourcecode = driver.getPageSource();
		System.out.println("Page source is = "+sourcecode);
		
	//	To capture the session ID
		String id = driver.getWindowHandle();
		System.out.println("Session ID of current page is = "+id);
		
	//to get the session id
		System.out.println(driver.getWindowHandle());
		
	// refresh the page
		driver.navigate().refresh();
		
	//	come back to previous page
		driver.navigate().back();
	
	//	navigate to next page
		driver.navigate().forward();
		
	//	load URL through navigate interface
		driver.navigate().to("https://www.facebook.com/");
		
		
		Thread.sleep(3000);
	//To close the Browser
		driver.close();
		System.out.println("Browser is closed");//close only the current browser page/window
				
		driver.quit();//close all the current tabs/pages/windows
	}

}
