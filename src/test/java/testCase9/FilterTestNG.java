package testCase9;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;



public class FilterTestNG {

	@BeforeTest
		public void method1()
		{
			Filter.setup();
		}
		
	@BeforeMethod
	    public void method2()
		{
		Filter.puturl();		
		}
		
		
    @Test 
		public void method3()
		{
		Filter.login("standard_user", "secret_sauce");
		}
	
	@AfterMethod
	    public void method4()
	    {
		Filter.filters();
	    }
	
	@AfterTest
        public void method5()
	    {
		Filter.quit();
	    }
	
	
	
	
}
