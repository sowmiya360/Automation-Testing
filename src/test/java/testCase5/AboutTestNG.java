package testCase5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutTestNG {

	
	@BeforeTest
	    public void method1()
	    {
		About.setup();
	    }
	
	@BeforeMethod
	    public void method2()
	    {
		About.puturl();
	    }
	
	@Test
	    public void method3()
	    {
		About.login("standard_user", "secret_sauce");
	    }

	@AfterMethod
	    public void method4()
	    {
		About.aboutop();
	    }
	
	@AfterTest
	    public void method5()
	    {
		About.quit();
	    }
	
	
}
