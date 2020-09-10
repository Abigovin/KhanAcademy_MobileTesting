package TestCases;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import PageObjects.*;

import PageObjects.SignInPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class TC_01_signIn extends Capability {
	
	SignInPage SI = new SignInPage(driver);
	String username="";
	
	@Test(priority=1)
	public void open_app() throws Exception 
	{ 
		SI.Open_APP();
	}
	
	@Test(priority=2)
	public void click_On_Dismiss_btn() throws Exception
	{
		SI.click_On_dismiss();
	}
	
	@Test(priority=3,dependsOnMethods = "click_On_Dismiss_btn")
	public void SignIn_Using_Google() throws Exception
	{   
		try
		{
		
		SI.Signin_click();
		SI.click_on_ContinueWithGoogle();
		SI.click_on_gmailId(username);
	    SI.Verify_username(username);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	

}

	