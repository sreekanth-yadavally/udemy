package TestNGEx;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

	@Test
	public void FirstMethod() {
		
			System.out.println("Method 1");
	}
	
	@Test (enabled=false)
	public void SecondMethod() {
		System.out.println("Method 2");		
		
	}	
	
	@Test
	public void ThirdMethod() {
		if(false) {
		System.out.println("Method 3");
		}else {
		throw new SkipException("skipping this method");
	}
	}
	@Test
	public void FourthMethod() {
		System.out.println("Method 4");
		
		throw new SkipException("Skipping this method");
	}
}
