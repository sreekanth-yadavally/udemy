package TestNGEx;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	SoftAssert softassert=new SoftAssert();
	
	@Test
	public void HardAssertionMethod() {
		System.out.println("before hard assertion");
		
		assertEquals(3, 3);
		System.out.println("after hard assertion pass");
		
		assertEquals(2, 3);
		System.out.println("after hard assertion fails");
		
	}
	
	
	@Test	
	public void SoftAssertionMethod() {
		System.out.println("before soft assertion");
		softassert.assertEquals(2, 2);
		System.out.println("after soft assetion pass");
		
		softassert.assertEquals(2, 3);
		System.out.println("after soft assertion fails");
		
		//throw new SkipException("Still in Implementation Stage");   //skip this case
		softassert.assertAll();
		
	}

}
