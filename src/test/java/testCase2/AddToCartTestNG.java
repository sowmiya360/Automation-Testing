package testCase2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCartTestNG {


	@BeforeTest

	    public void method1()
     	{
		  AddToCart.setup();
	    }
	
	@BeforeMethod
		public void method2()
		{
			AddToCart.puturl();
		}
	
	@Test
		public void method3()
		{
			AddToCart.login("standard_user", "secret_sauce");
			AddToCart.items();
			AddToCart.cart();
		}
		
	@AfterMethod
		public void method4()
		{
			AddToCart.viewcart();

		}
	@AfterTest
		public void method5()
		{
			AddToCart.quit();
		}
      
		
		
		
	
}
