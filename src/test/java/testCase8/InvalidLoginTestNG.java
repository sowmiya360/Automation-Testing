package testCase8;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidLoginTestNG {

	@BeforeTest
	    public void method1()
	    {
	    Invalidlogin.setup();
	    }
	
	@BeforeMethod
	    public void method2()
	    {
		Invalidlogin.puturl();
	    }
	
	@Test
	    public void method3()
	    {
		Invalidlogin.invalidLogins("ss", "vv");
	    }
	
	@AfterMethod
	    public void method4()
	    {
		 Invalidlogin.loginclick();
	    }
	
	@AfterTest
	    public void method5()
	    {
		Invalidlogin.quit();
	    }
	
}
