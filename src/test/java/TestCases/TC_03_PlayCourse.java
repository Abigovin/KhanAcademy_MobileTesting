package TestCases;

import org.testng.annotations.Test;

import PageObjects.Capability;
import PageObjects.CoursePage;

public class TC_03_PlayCourse extends Capability {
	CoursePage CP;
	
	@Test
	public void Play_course()
	{    CP= new CoursePage(driver);
		CP.play_course();
		//CP.select_English_Lang();
	}

}
