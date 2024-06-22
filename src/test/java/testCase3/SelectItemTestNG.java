package testCase3;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectItemTestNG {

	
	@BeforeTest
	    public void method1()
	    {
		SelectItem.setup();
	    }
	
	@BeforeMethod
	    public void method2()
	    {
		SelectItem.puturl();
	    }
	
	@Test
	    public void method3()
	    {
		SelectItem.login("standard_user", "secret_sauce"); 
	    }
	
    @AfterMethod
        public void method4()
        {
		SelectItem.cart();
        }

    @AfterTest
        public void method5()
        {
    	SelectItem.quit();
        }
}
