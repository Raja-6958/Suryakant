package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage 
{
	public WebDriver driver;
	
   @FindBy(xpath = "//input[@name='firstName']")
   private WebElement FirstnameTextfield;
   
   @FindBy(xpath = "//input[@name='lastName']")
   private WebElement LastnameTextfield;
   
   @FindBy(xpath = "//input[@name='userId']")
   private WebElement yahoomailTextfield;
   
   @FindBy(xpath = "//input[@name='password']")
   private WebElement passwordTextfield;
   
   @FindBy(xpath = "//input[@name='birthYear']")
   private WebElement BirthyearTextfield;
   
   @FindBy(xpath = "//button[@name='signup']")
   private WebElement Continuebutton;
   
   @FindBy(xpath = "//a[@class='termsLink']")
   private WebElement Term;
   
   public CreateAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
   
   public void CreateAccountMethod()
   {
   FirstnameTextfield.sendKeys("Suryakant");
   LastnameTextfield.sendKeys("Muduli");
   yahoomailTextfield.sendKeys("suryakant_muduli12");
   passwordTextfield.sendKeys("Raja@2000");
   BirthyearTextfield.sendKeys("2000");
   Continuebutton.click();
   }
   
   public void TermMethod() throws InterruptedException
   {
   Term.click();
   Thread.sleep(3000);
   }
}
