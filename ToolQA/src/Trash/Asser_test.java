package Trash;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asser_test {
	@Test
	public void testCaseVerifyHomePage() {
	
		Assert.assertEquals("g", "g", "Wrong sentenses");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		Assert.assertTrue(isTrue(), "User failed to login");
		Assert.assertFalse(isFalse());
		}
	

private boolean isTrue() {
	System.out.println("222222222");
	return false;
}

private boolean isFalse() {
	System.out.println("11111111");
	return false;
}
}
