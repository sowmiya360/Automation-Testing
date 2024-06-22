package testCase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sowmi\\eclipse-workspace\\Testcases\\src\\test\\resources\\chromedriver.exe");
        wd=new ChromeDriver();	
	
	}
	
	public static void puturl()
	{
		wd.get("https://www.saucedemo.com/");
	    wd.manage().window().maximize();
	}
	
	public static void login(String username,String password)
	{
		WebElement user=wd.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		WebElement pass=wd.findElement(By.xpath("//input[contains(@id,'password')]"));
		WebElement login=wd.findElement(By.xpath("//input[contains(@id,'login-button')]"));
		
		user.sendKeys(username);
		pass.sendKeys(password);
		login.click();
		
	}
	
	public static void items()
	{
		
		WebElement item=wd.findElement(By.xpath("//div[contains(@class,'inventory_item_name ')]"));
        item.click();	
	}
	
	
	public static void cart()
	{
	  WebElement cart=wd.findElement(By.xpath("//button[contains(@data-test,'add-to-cart')]"));	
       cart.click();	
 	}
	
	public static void viewcart()
	{
	    WebElement view=wd.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));	
	    view.click();
	
	}
	
    public static void quit()
    {
    	wd.quit();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AddToCart.setup();
		//AddToCart.puturl();
		//AddToCart.login("standard_user", "secret_sauce");
		//AddToCart.items();
	    //AddToCart.cart();
	    //AddToCart.viewcart();
	}

}
