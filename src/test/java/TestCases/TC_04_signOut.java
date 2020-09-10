package TestCases;

import org.testng.annotations.Test;

import PageObjects.Capability;
import PageObjects.SignInPage;

public class TC_04_signOut extends Capability{
	SignInPage SI;
	
	@Test
	public void Signout()
	{
		SI=new SignInPage(driver);
		SI.signOut();
	}

}
