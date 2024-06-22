package testCase1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SucessfulLoginTestNg {

	
	
	@BeforeTest
	    public void m1()
	    {
		SucessfulLogin.setup();
	    }
	
	@BeforeMethod
	    public void m2()
	    {
		SucessfulLogin.puturl();
	    }
	
	@Test
    	public void m3()
	    {
		SucessfulLogin.login("standard_user", "secret_sauce");
	    }
	
	@AfterMethod
    	public void m4()
	    {
		SucessfulLogin.click();
	    }
	
	@AfterTest
	    public void m5()
	    {
		SucessfulLogin.quit();
	    }
}
