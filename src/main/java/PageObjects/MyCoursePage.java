package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MyCoursePage extends Capability {
	 AndroidDriver<AndroidElement> driver;
	public MyCoursePage(AndroidDriver<AndroidElement> driver) {
		
		this.driver=driver;
	}
	
	//Get Started Btn
	
By GetStartedBtn=MobileBy.AndroidUIAutomator("UiSelector().text(\"Get started\")");
//edit btn
By editbtn= MobileBy.AndroidUIAutomator("UiSelector().text(\"Edit\")");
	//Graduate studies
	By GraduateStudieslnk=MobileBy.AndroidUIAutomator("UiSelector().text(\"Graduate studies\")");
	//Comuputer programming btn
	By ComputerProgrammingbnt=MobileBy.AndroidUIAutomator("UiSelector().text(\"Computer programming\")");
	//Done btn
	By doneBtn=MobileBy.AndroidUIAutomator("UiSelector().text(\"Done\")");
	
	
	public void click_on_getStarted() 
	{ 
		try
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(editbtn).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Graduate studies\"))");
		//driver.findElement(GraduateStudieslnk).click();
	}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void select_course()
	{
		try
		{
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Computer programming\"))");
			//driver.findElement(ComputerProgrammingbnt).click();
			driver.findElement(doneBtn).click();
			
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	



}
