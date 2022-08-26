package Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Mobilenumber extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='shortCountryCode']")
	   private WebElement countrycode;
	   
	   @FindBy(id="usernamereg-phone")
	   private WebElement mobilenumber;
	   
	   @FindBy(id="reg-submit-button")
	   private WebElement sendcodebutton;
	  
	   
	   public Mobilenumber(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
	   
	   public void MobileNo() throws InterruptedException
	   {
		   String error=mobilenumber.getText();
		   selectbyvalue(countrycode, "IN");
		   mobilenumber.sendKeys("9692348666565");
		   sendcodebutton.click();
		   if(error.equalsIgnoreCase("That doesn’t look right, please re-enter your phone number."))
		   {
			   System.out.println("enter valid mobile number");
		   }
		   else
		   {
			   System.out.println("bye");
		   }
		   Thread.sleep(5000);
		
			
		  
	   }
	   
	  

}
