package Test;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CreateAccountPage;

public class TermsPage extends BaseTest
{
	@Test
	public void terms() throws InterruptedException
	{
		CreateAccountPage acc=new CreateAccountPage(driver);
		acc.TermMethod();
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>();
		al.addAll(windows);
		driver.switchTo().window(al.get(1));
		String title=driver.getTitle();
		if(title.contains("Terms"))
		{
			System.out.println("redirected to terms page");
		}
		else
		{
			System.out.println("not redirected to terms page");
		}
	
	}
}
