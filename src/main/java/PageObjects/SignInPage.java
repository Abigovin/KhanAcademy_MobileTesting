package PageObjects;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.Capability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SignInPage extends Capability{
	AndroidDriver<AndroidElement> driver;
	public SignInPage(AndroidDriver driver) {
		this.driver=driver;
	}
	
	public static String GmailId="";
	
	
	//1st Dismiss 	
	By dismiss = By.xpath("//*[@text='Dismiss']");
	//2nd Dismiss
	By dismiss1= By.xpath("//android.widget.Button[@content-desc=\"Dismiss\"]/android.widget.TextView");
	//Sign in Btn
	By signInbtn= MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")");
	//ContinuewithGoogle
	By continueWithGooglelnk=MobileBy.AndroidUIAutomator("UiSelector().text(\"Continue with Google\")");
	//click on username
	By gmailId= MobileBy.id("com.google.android.gms:id/account_name");
	//settings: 
	By settingbtn= By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]");
	//username
	By usr=By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
     //sign out
    By signoutbtn= MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign out\")");
	
	
	public void Open_APP() throws Exception {
	     driver = desiredCapability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void click_On_dismiss() throws Exception 
	{

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(dismiss).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(dismiss1).click();

	}

	public void Signin_click() throws InterruptedException {
		try {
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.findElement(signInbtn).click();
		 } 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click_on_ContinueWithGoogle() {
		try {
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.findElement(continueWithGooglelnk).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	public String click_on_gmailId(String Username)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String fullgmail=driver.findElement(gmailId).getText();
			GmailId=fullgmail.split("@")[0].toString();
			driver.findElement(gmailId).click();
			System.out.println(GmailId);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return GmailId;
		
	}
	
	public void Verify_username(String username)
	{
		try
		{
			driver.findElement(settingbtn).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//WebElement actualuser=driver.findElements(usr).get(0);
			//String actualGmail=actualuser.getText();
			String actualGmail=driver.findElement(usr).getText();
						
		    try
		    {
		    	Assert.assertEquals(actualGmail, GmailId,"username is same");
		    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
			}
			catch(Exception e)
			{
				driver.findElement(signoutbtn).click();
				
			}

			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	//	return username;
	}
	
	public void signOut()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(settingbtn).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(signoutbtn).click();
	}
	
	
	



	

}
