package testCase10;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutItemsTestNG {

	
	@BeforeTest
	    public void method1()
	    {
		CheckoutItems.setup();
	    }
	
	@BeforeMethod
		public void method2()
		{
		CheckoutItems.puturl();		
		}
	
	@Test 
	    public void method3()
	    {
		CheckoutItems.login("standard_user", "secret_sauce");
		CheckoutItems.items();
		CheckoutItems.cart();
		CheckoutItems.viewcart();
		CheckoutItems.checkout();
		CheckoutItems.address("ss", "vv","636003");	
		
	    }
	
	@AfterMethod
	    public void method4()
	    {
		CheckoutItems.finish();
	    }

	@AfterTest
	    public void method5()
	    {
		CheckoutItems.quit();
	    }
}
