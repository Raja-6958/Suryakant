package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
    @FindBy(xpath = "//input[@id='login-username']")
    private WebElement EmailidTestfield;
    
    @FindBy(xpath = "//input[@name='persistent']")
    private WebElement StaysignedIn;
    
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement Nextbutton;
    
    @FindBy(xpath = "//input[@id='login-passwd']")
    private WebElement passTextfield;
    
    @FindBy(xpath = "//button[@name='verifyPassword']")
    private WebElement nextbutton;
    
    public SignInPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void MobileNoMethod()
    {
    	EmailidTestfield.sendKeys("suryakant_muduli");
    	StaysignedIn.click();
    	Nextbutton.click();
    	passTextfield.sendKeys("Raja@2000");
    	nextbutton.click();
    	
    }
    
}
