package testCase6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
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
	
	public static void screens() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)wd;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\sowmi\\eclipse-workspace\\Testcases\\target\\"+"Sowmiya"+".png");
		
		FileHandler.copy(source, target);
		
	}
	
	public static void quit()
	{
		wd.quit();
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Screenshot.setup();
		//Screenshot.puturl();
		//Screenshot.login("standard_user", "secret_sauce");
		//Screenshot.screens();
		
		
		
	}

}
