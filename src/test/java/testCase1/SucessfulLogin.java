package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SucessfulLogin {
	
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
	
	public static void login (String username,String password)
	{
		WebElement user=wd.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		WebElement pass=wd.findElement(By.xpath("//input[contains(@id,'password')]"));
		
		user.sendKeys(username);
		pass.sendKeys(password);
	}
	
	public static void click()
	{
		WebElement login=wd.findElement(By.xpath("//input[contains(@id,'login-button')]"));
		login.click();

	}
	
	public static void quit()
	{
		wd.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SucessfulLogin.setup();
		//SucessfulLogin.puturl();
		//SucessfulLogin.login("standard_user", "secret_sauce");
	    //sucessfulLogin.click();
	}

}
