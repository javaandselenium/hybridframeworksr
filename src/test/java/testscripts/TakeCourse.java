package testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.CorejavaTraining;
import pompages.Selenium;
import pompages.SkillraryLogin;

public class TakeCourse extends BaseClass{
	@Test
	public void takejavaCourse() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.serachcourse(p.getdata("cn"));
		Selenium s1=new Selenium(driver);
		s1.corejavaCourse();
		CorejavaTraining c=new CorejavaTraining(driver);
		u.frame(driver);
		c.palyvideo();
		u.switchbaccktoFrame(driver);
		c.takecourse();
		//u.verify(driver,p.getdata("resultpage"),"login");
	
		
	}

}
