package testCase7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigate {

	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Testcases\\src\\test\\resources\\chromedriver.exe");
	    wd=new ChromeDriver();
	}
	 
	public static void puturl()
	{
		wd.get("https://www.saucedemo.com/");
	}
	
	
	public static void login(String username,String password)
	{
		WebElement user=wd.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
	    WebElement pass=wd.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
	    WebElement login=wd.findElement(By.xpath("//input[contains(@data-test,'login-button')]"));
	
	    user.sendKeys(username);
	    pass.sendKeys(password);
	    login.click();

	    
	    wd.navigate().back();
	    
	}
	
	public static void loginagain(String username, String password)
	{
		WebElement user=wd.findElement(By.xpath("//input[contains(@placeholder,'Username')]"));
	    WebElement pass=wd.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
	    WebElement login=wd.findElement(By.xpath("//input[contains(@data-test,'login-button')]"));
	
	    user.sendKeys(username);
	    pass.sendKeys(password);
	    login.click();

	    
	    if(username.equals("standard_user"))
	    {
	    	
	    	if(password.equals("secret_sauce"))
	    	{
	    		
	    	  wd.navigate().forward();
	    	}
	    }
	    else
	    {
	    	System.out.println("incorrect username,password");
	    }
	}
	
	public static void quit()
	{
		wd.quit();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      //Navigate.setup();
      //Navigate.puturl();
      //Navigate.login("standard_user", "secret_sauce");
	  //Navigate.loginagain("ss", "bb");
		
		
	}

}
