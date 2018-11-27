package TestNGEx;

import org.testng.annotations.Test;

public class ParellelExecution {
	
	
	@Test(priority=1)
	public void FirstTest() {
		
		System.out.println("this is my first methodd");
	}
	
	@Test
	public void SecondTest() {
		
		System.out.println("this is  my second method");
	}
	

	@Test(priority=3)
	public void ThirdTest() {
		
		System.out.println("this is my Third methodd");
	}
	
	@Test(priority=2)
	public void FourthTest() {
		
		System.out.println("this is  my Fourth method");
	}

	

}
