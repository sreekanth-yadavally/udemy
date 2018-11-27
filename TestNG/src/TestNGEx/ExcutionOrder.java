package TestNGEx;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcutionOrder {
	
	@BeforeSuite
	public void FirstMethod() {
		
		System.out.println("@BeforeSuite");
	}
@BeforeTest
public void SecondMethod() {
		
		System.out.println("@BeforeTest");
	}

@BeforeClass
public void ThirdMethod() {
	
	System.out.println("@BeforeClass");
}

@BeforeMethod
public void FourthMethod() {
	
	System.out.println("@BeforeMethod");
}

@Test
public void FifthMethod() {
	
	System.out.println("Test MEthod");
}

@AfterMethod
public void SixthMethod() {
	
	System.out.println("@AfterMethod");
}

@AfterClass
public void SeventhMethod() {
	
	System.out.println("@AfterClass");
}

@AfterTest
public void EigthMethod() {
	
	System.out.println("@AfterTest");
}

@AfterSuite
public void NingthMenthod() {
	
	System.out.println("@@AfterSuite");
}

}
