package testCase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialIcons {
	
	public static WebDriver wd;
	
	public static void setup()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\sowmi\\\\eclipse-workspace\\\\Testcases\\\\src\\\\test\\\\resources\\\\chromedriver.exe");
	    wd=new ChromeDriver();
	}
	
	public static void puturl()
	{
		wd.get("https://www.saucedemo.com");
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
	
	public static void socialmedia()
	{
		WebElement link=wd.findElement(By.linkText("LinkedIn"));
		link.click();
		
		WebElement face=wd.findElement(By.linkText("Facebook"));
	    face.click();
	
	    WebElement twit=wd.findElement(By.linkText("Twitter"));
	    twit.click();
	
	}
	
	public static void quit()
	{
		wd.quit();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//SocialIcons.setup();
		//SocialIcons.puturl();
		//SocialIcons.login("standard_user", "secret_sauce");
		//SocialIcons.socialmedia();
		
		
		
		
		
	}

}


