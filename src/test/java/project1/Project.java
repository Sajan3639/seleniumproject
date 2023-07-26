package project1;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Project 
{
  //@List
  public void bloodBank() throws Exception 
  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  WebDriver driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  // URL
	  driver.navigate().to("https://bloodbanktoday.com/");
	  Thread.sleep(2000);
// REGISTRATION PROCESS	  
//	  driver.findElement(By.linkText("REGISTER")).click();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[1]/div/div/div[2]/div/div[2]/div/a[1]")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtName")).sendKeys("G RAJENDER GOUD");
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("rajendergoud33@gmail.com");
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("9963869366");
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLoginPassword")).sendKeys("Hello@123");
//	  Thread.sleep(2000);
//	  
//	  // Scroll Down 
//	  JavascriptExecutor j = (JavascriptExecutor)driver;
//	  j.executeScript("window.scrollBy(0,400)");
//	  Thread.sleep(2000);
//	  
//	  // Blood Group Selection no DD
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboBloodGroup-button")).click();
//	  Thread.sleep(2000);
//	  driver.findElement(By.id("ui-id-9")).click();
//	  
//	  // Gender Selection no DD
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboGender-button")).click();
//	  Thread.sleep(2000);
//	  driver.findElement(By.id("ui-id-10")).click();
//	  // Date Selection
//	  Select d = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboDobDay\"]")));
//	  d.selectByVisibleText("30");
//	  // Month Selection no DD
//	  Select m = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboDobMonth")));
//	  m.selectByVisibleText("Nov");
//	  // Year Selection
//	  Select y = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboDobYear")));
//	  y.selectByVisibleText("1994");
//	  // Weight Entry
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWeight")).sendKeys("70");
//	  Thread.sleep(2000);
//	  
//	  // Last Donation Date
//	  // DATE
//	  Select ld = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboLastDay")));
//	  ld.selectByVisibleText("25");
//	  //MONTH
//	  Select lm = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboLastMonth")));
//	  lm.selectByVisibleText("Aug");
//	  // YEAR
//	  Select ly = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboLastYear")));
//	  ly.selectByVisibleText("2018");
//	  // Scroll Down
//	  JavascriptExecutor r = (JavascriptExecutor)driver;
//	  r.executeScript("window.scrollBy(0,400)");
//	  
//	  // CONTACT INFO
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboShowMobile-button")).click();
//	  Thread.sleep(2000); 
//	  driver.findElement(By.id("ui-id-13")).click();
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboSmsAlert-button")).click();
//	  Thread.sleep(2000);
//	  driver.findElement(By.id("ui-id-15")).click();
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPinCode")).sendKeys("501203");
//	  
//	  Select ts = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboState")));
//	  ts.selectByVisibleText("Telangana");
//	  Thread.sleep(3000);
//	  
//	  Select cd = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboCity")));
//	  cd.selectByVisibleText("Rangareddy");
//	  Thread.sleep(2000);
//	  
//	  Select t = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboTeh")));
//	  t.selectByVisibleText("Chevella");
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress")).sendKeys("SHERIGUDA");
//	  
//	  JavascriptExecutor r1= (JavascriptExecutor)driver;
//	  r1.executeScript("window.scrollBy(0,200)");
//	  // SUBMIT BUTTON
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();
//	  
//	  // OTP
//	  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtOtp")).sendKeys("MOBILE OTP");  
//	  driver.findElement(By.linkText("Submit")).click();
	  
	  
	  
// LOGIN PROCESS
	  driver.findElement(By.linkText("LOGIN")).click();
	  driver.findElement(By.id("txtLoginUserName")).sendKeys("rajendergoud33@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("txtLoginPassword")).sendKeys("Hello@123");
	  Thread.sleep(2000);
	  driver.findElement(By.id("btnSave")).click();
	  Thread.sleep(2000);
	  JavascriptExecutor r = (JavascriptExecutor)driver;
	  r.executeScript("window.scrollBy(0,300)");
	  Thread.sleep(2000);
	  JavascriptExecutor r1 = (JavascriptExecutor)driver;
	  r1.executeScript("window.scrollBy(0,300)");
	  Thread.sleep(2000);
	  JavascriptExecutor r2 = (JavascriptExecutor)driver;
	  r2.executeScript("window.scrollBy(0,-600)");
	  // Left Side Mouse Hover
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[3]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[4]/a")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[4]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[5]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[5]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[6]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[7]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[8]/a")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"main-menu-inner\"]/ul/li[2]/a")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	// Top Side Mouse Hower
//	  driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div[1]/div/div[1]/a")).click();
//	  Thread.sleep(2000); 
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[2]/a")).click();
//	  Thread.sleep(2000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[3]/a")).click();
//	  Thread.sleep(1000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[4]/a")).click();
//	  Thread.sleep(1000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[5]/a")).click();
//	  Thread.sleep(1000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[6]/a")).click();
//	  Thread.sleep(1000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[7]/a")).click();
//	  Thread.sleep(1000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[9]/a")).click();
//	  Thread.sleep(2000);
//	  driver.navigate().refresh();
//	  driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/a[1]")).click(); // DONATE US
//	  Thread.sleep(2000);  
//	  driver.navigate().refresh();
//	  JavascriptExecutor r3 = (JavascriptExecutor)driver;
//	  r3.executeScript("window.scrollBy(0,500)");
//	  JavascriptExecutor r4 = (JavascriptExecutor)driver;
//	  r4.executeScript("window.scrollBy(0,500)");
//	  JavascriptExecutor r5 = (JavascriptExecutor)driver;
//	  r5.executeScript("window.scrollBy(0,500)");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	// LOGOUT PROCESS
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}