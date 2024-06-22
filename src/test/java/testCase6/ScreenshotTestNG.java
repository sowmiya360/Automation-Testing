package testCase6;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotTestNG {

	
	@BeforeTest
	    public void method1()
	    {
		Screenshot.setup();
	    }
	
	@BeforeMethod
	    public void method2()
	    {
		Screenshot.puturl();
	    }
	
	@Test
	    public void method3()
	    {
	    Screenshot.login("standard_user", "secret_sauce");	
        }
	
	@AfterMethod
	    public void method4() throws IOException
	    {
	    Screenshot.screens();
	    }
	
	@AfterTest
	    public void method5()
	    {
		Screenshot.quit();
	    }
	
	
	
}
