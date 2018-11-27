package bsnl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BSNL_NGN_Portal 
{

	 WebDriver driver;
		
	 String ChromePath="D://Drivers Path//chromedriver.exe";
	 String GeckoPath="D://Drivers Path//geckodriver.exe";
	 String IEPath="D://Drivers Path//IEDriverServer.exe";
	
	
	 public  void invokeDriver(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ChromePath);
			driver=new ChromeDriver();			
			
		}else if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", GeckoPath);
			driver=new FirefoxDriver();		
			
		}else{
			
			System.setProperty("webdriver.ie.driver", IEPath);
			driver=new InternetExplorerDriver();		
		}
		
	}
	
	@Test(priority=2)
	public void Login() {
		
		driver.findElement(By.name("txtUserName")).sendKeys("9866243344");
		
		driver.findElement(By.name("txtPassword")).sendKeys("bsnl1234");
		
		driver.findElement(By.id("btnLogin")).click();
	}


@Test(priority=1)
public void driverName() {
	
	invokeDriver("chrome");
	driver.manage().window().maximize();
	driver.get("http://ngnhelpline.bsnl.co.in/");
}

@Test(priority=3)
public void dashboard() {
	
	driver.findElement(By.xpath("//span[contains(text(),'Reports')]")).click();
	
	driver.findElement(By.id("112")).click();
	
}
}
