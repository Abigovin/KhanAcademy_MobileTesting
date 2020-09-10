package TestCases;

import org.testng.annotations.Test;

import PageObjects.Capability;
import PageObjects.MyCoursePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_02_Mycourse extends Capability{

	//public AndroidDriver<AndroidElement> driver;
	
	MyCoursePage MCP;
	
	@Test
	public void My_Course_Action()
	{ 
		MCP= new MyCoursePage(driver);
		MCP.click_on_getStarted();
		MCP.select_course();
	}
}
