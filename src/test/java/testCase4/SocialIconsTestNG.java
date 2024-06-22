package testCase4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SocialIconsTestNG {
     
	@BeforeTest
	    public void method1()
	    {
	 	SocialIcons.setup();
	    }
	 
	@BeforeMethod
	    public void method2()
	    {
		SocialIcons.puturl();
	    }

	@Test
	    public void method3()
	    {
		SocialIcons.login("standard_user", "secret_sauce");
        }
	
	@AfterMethod
	    public void method4()
	    {
	    SocialIcons.socialmedia();
	    }
	
	@AfterTest
	    public void method5()
	    {
		SocialIcons.quit();
	    }
	
}
