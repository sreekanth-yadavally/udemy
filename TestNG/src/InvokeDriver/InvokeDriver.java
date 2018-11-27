package InvokeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InvokeDriver 
{

	 WebDriver driver;
	
	 String ChromePath="D://Drivers Path//chromedriver.exe";
	 String GeckoPath="D://Drivers Path//geckodriver.exe";
	 String IEPath="D://Drivers Path//IEDriverServer.exe";
	
	@Test
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
	
	@Test
	public void driverName() {
		
		invokeDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
	}
	
}
