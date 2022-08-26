package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CreateAccountPage;
import Pom.Mobilenumber;

public class MobileNumberLength extends BaseTest
{
	@Test
public void Mobile() throws InterruptedException
{
		CreateAccountPage cm=new CreateAccountPage(driver);
		cm.CreateAccountMethod();
		Mobilenumber mn=new Mobilenumber(driver);
		mn.MobileNo();
		 
		   
		
}
}
