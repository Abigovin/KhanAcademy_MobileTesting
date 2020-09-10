package TestCases;


import java.util.Set;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.internal.TouchAction;
import org.testng.Assert;

import PageObjects.Capability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class sample extends Capability{
	
		public static void main(String[] args) throws Exception {
			AndroidDriver<AndroidElement> driver= desiredCapability();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
			
		}

	}
