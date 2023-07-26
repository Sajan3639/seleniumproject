package webelementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods1 {
public static void main(String[] args) throws InterruptedException    {
	
	//step-1 Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//step-2 Maximize the window
		driver.manage().window().maximize();
		
		//step-3 Load the URL Demo- ActiTime app
		driver.get("https://demo.actitime.com/login.do");
		
		//WebElement method - sendKeys()
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		//WebElement method - clear()
		driver.findElement(By.className("textField")).clear();
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//WebElement method - click()
		//driver.findElement(By.id("loginButton")).click();
		
		//WebElement method - getAttribute(String attribute Name)
		String attribute = driver.findElement(By.id("loginButton")).getAttribute("href");
		System.out.println(attribute);
		
		//WebElement method - getTagName()
		String tag = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(tag);
		
		//WebElement method - getText()
		String text = driver.findElement(By.id("loginButton")).getText();
		System.out.println("visible text od web element is "+text);
		
		//WebElement method - getLocation() - position of the web element
		Point position = driver.findElement(By.id("loginButton")).getLocation();
		int posX=position.getX();
		System.out.println("xth position is "+posX);
		int posY=position.getY();
		System.out.println("yth position is "+posY);
		
		//WebElement method - getSize() - Dimension of web element
		Dimension size = driver.findElement(By.id("loginButton")).getSize();
		int height=size.getHeight();
		System.out.println("element height is "+height);
		int width=size.getWidth();
		System.out.println("element height is "+width);
		
		//WebElement method - getReact() - Position and Dimension of the web element
		Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
		int x=rect.getX();
		System.out.println("x using rectange "+x);
		int y=rect.getY();
		System.out.println("y using rectange "+y);
		int h=rect.getHeight();
		System.out.println("height using rectange "+h);
		int w=rect.getWidth();
		System.out.println("width using rectange "+w);
		
		//WebElement method - getCssValue(String CssPropertyName)
		String cssValue = driver.findElement(By.id("loginButton")).getCssValue("display");
		System.out.println("CSS value is "+cssValue);
		
		//WebElement method - getAriaRole() - To get the element design type
		String role = driver.findElement(By.id("loginButton")).getAriaRole();
		System.out.println("aria role is "+role);
		String roleUserName = driver.findElement(By.className("textField")).getAriaRole();
		System.out.println("aria role is "+roleUserName);
		
		//WebElement method - getAccessibleName() - To get the element accessibility Name
		String accessibleName = driver.findElement(By.className("textField")).getAccessibleName();
		System.out.println("accessibleName is "+accessibleName);
		String accessibleNameBtn = driver.findElement(By.id("loginButton")).getAccessibleName();
		System.out.println("accessibleName is "+accessibleNameBtn);
		
		driver.get("http://localhost:8888");
		String name = driver.findElement(By.name("user_name")).getAccessibleName();
		System.out.println("name is "+name);
		
		//WebElement method - isDisplayed() - To Check if the element is displayed/present in the DOM
		boolean elementDisplayed = driver.findElement(By.name("user_name")).isDisplayed();
		if(elementDisplayed==true)
		{
			driver.findElement(By.name("user_name")).sendKeys("admin");
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("element not present");
		}
		
		//WebElement method - isEnabled() - To check if the element is displayed/present in the DOM
		boolean enabled = driver.findElement(By.name("user_name")).isEnabled();
		if(enabled==true)
		{
			driver.findElement(By.name("user_name")).clear();
			System.out.println("element enabled");
		}
		else
		{
			System.out.println("element not enabled");
		}
		
		////WebElement method - isSelected() - To check if the element are selected or not
		boolean select = driver.findElement(By.name("user_name")).isSelected();
		System.out.println("element selected");
		if(select==true)
		{
}
else
{
	System.out.println("element not selected");
}
		
		//WebElement method -getDOmAttribute() - To get the DOM Attribute value
		String domAttribute = driver.findElement(By.name("user_name")).getDomAttribute("type");
		System.out.println("DOM Attribute value is "+domAttribute);
		
		//WebElement method -getDOMProperty() - To get the DOM Property name
				driver.findElement(By.name("user_name")).sendKeys("admin");
				String propertyvalue = driver.findElement(By.name("user_name")).getDomProperty("value");
				System.out.println(propertyvalue);
		
		//WebElement method - submit()
				driver.findElement(By.name("user_password")).sendKeys("manager");
				driver.findElement(By.id("submitButton")).submit();
				System.out.println("submit method worked");
				
		//WebElement method - getSadowRoot() - To get the access of shadowDOM
				SearchContext searchContext = driver.findElement(By.name("user_password")).getShadowRoot();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
