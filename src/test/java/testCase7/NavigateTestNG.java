package testCase7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigateTestNG {

	@BeforeTest
	    public void method1()
	    {
		Navigate.setup();
	    }
	
	@BeforeMethod
	    public void method2()
	    {
		Navigate.puturl();
	    }
	
	@Test
	    public void method3()
	    {
		Navigate.login("standard_user", "secret_sauce");
	    }
	
	@AfterMethod
	    public void method4()
	    {
	    Navigate.loginagain("ss", "vv");
	    }
	
	@AfterTest
	    public void method5()
	    {
		Navigate.quit();
	    }
	
}
