package ReadWriteExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WriteEx
{
	@Test
	public void WriteFromEx() {
		
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D://Drivers Path//chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	}
}
