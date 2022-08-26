package Test;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CreateAccountPage;

public class Createyahoomail extends BaseTest
{
	@Test
public void create()
{
	CreateAccountPage cr=new CreateAccountPage(driver);
	cr.CreateAccountMethod();
}
}
