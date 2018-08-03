package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test
	public void test1() {
		System.out.println("test 1 method");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test2() {
		System.out.println("test 2 method");
	}
	
	

}
