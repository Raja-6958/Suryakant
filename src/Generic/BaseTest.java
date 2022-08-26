package Generic;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
		@BeforeMethod
	public void Registration() throws InterruptedException, IOException
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);	
		
	}
	
	
	  @AfterMethod() 
	  public void teardown() 
	  { 
		  driver.quit(); 
	  }
	 
	
}
