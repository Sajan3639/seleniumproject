package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_UTC_offsets");
	
	}

}

