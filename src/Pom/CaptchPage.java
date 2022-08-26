package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaptchPage 
{
  @FindBy (xpath = "//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")
  private WebElement clickOn;
  
  @FindBy (xpath = "//button[.='Continue']")
  private WebElement ContinueButton;
  
  public CaptchPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickonMethod()
  {
  clickOn.click();
  ContinueButton.click();
}
}
