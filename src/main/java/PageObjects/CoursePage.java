package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CoursePage extends Capability {
	 AndroidDriver<AndroidElement> driver;
	public CoursePage(AndroidDriver driver) {
		
		this.driver=driver;
	}
	
	By selctlangbtn=MobileBy.AndroidUIAutomator("UiSelector().text(\"Select language\")");
	By clickEnglish=MobileBy.AndroidUIAutomator("UiSelector().text(\"English\")");

	By selectCoursebtn=MobileBy.AndroidUIAutomator("UiSelector().text(\"Computer programming\")");
	//Webappview
	By WebappViewbtn=MobileBy.AccessibilityId("android:id/text1");
	//Just Once btn
	By JustOnce= MobileBy.id("android:id/button_once");
	//Start from the basic
	By startfrombasicbtn=MobileBy.AccessibilityId("Start from the basics");
	//play btn
	By Playbtn=MobileBy.xpath("//android.widget.Button[@content-desc=\"Play\"]");
	//pausebtn
	By pauseBtn=MobileBy.AccessibilityId("pause pause playback");
	//2 back
	//scroll down
	
	public void select_English_Lang()
		{
		try
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select language\"))");
			driver.findElement(selctlangbtn).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(clickEnglish).click();
			driver.findElement(clickEnglish).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	public void play_course()
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(selectCoursebtn).click();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			//driver.findElement(WebappViewbtn).click();
			driver.findElement(JustOnce).click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.findElement(startfrombasicbtn).click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.findElement(Playbtn).click();
			driver.findElement(pauseBtn).click();
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	
	



