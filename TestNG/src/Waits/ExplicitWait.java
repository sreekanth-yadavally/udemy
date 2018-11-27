package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait 
{

	
WebDriver driver;


	
	@Test
	public void DropDown() {
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers Path//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fb.com");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebElement day=driver.findElement(By.id("day"));		
		
		WebElement month=driver.findElement(By.id("month"));
		
		WebElement year=driver.findElement(By.id("year"));
		
			
		
		
		Select select=new Select(day);		
		select.selectByIndex(21);
		
		Select select1=new Select(month);
		select1.selectByVisibleText("Mar");
		
		Select select2=new Select(year);
		select2.selectByValue("1992");
	}
}
