package FindingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindingElements

{

	WebDriver driver;
	
	@Test(priority=1)
	public void VerifyElementIsEnable() {
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers Path//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fb.com");
		
	WebElement element=driver.findElement(By.name("websubmit"));
	
	boolean flag=element.isEnabled();	
	
	
	System.out.println("the element is enabled" +flag);
	
	Assert.assertTrue(flag);
	
	}
	
	@Test(priority=2)
	public void VerifyElementIsDispalyed() 
	{
	
		System.setProperty("webdriver.chrome.driver", "D://Drivers Path//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fb.com");
		
		WebElement element=driver.findElement(By.cssSelector("div[class='mbs _52lq fsl fwb fcb'] span"));
		
		String text=element.getText();
		System.out.println("text is" +text);
		
		boolean flag=element.isDisplayed();
		
		
		System.out.println("Element is Displayed" +flag);
		
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void VerifyElementIsSelected() 
	{
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers Path//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		
		WebElement element=driver.findElement(By.id("restapibox"));
		boolean flag=element.isSelected();
		Assert.assertTrue(flag);
		
	/*	WebElement element1=driver.findElement(By.id("seleniumbox"));
		boolean flag1=element1.isSelected();
		Assert.assertTrue(flag1);*/
	}
}
