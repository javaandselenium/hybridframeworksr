package testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.Addtocart;
import pompages.DemoappLogin;
import pompages.SkillraryLogin;

public class AddingTocart extends BaseClass{
	@Test
	public void addingTocart() throws FileNotFoundException, IOException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.gerasbtn();
		s.srdemoapp();
		
		u.switchingtab(driver);
		
		DemoappLogin l=new DemoappLogin(driver);
		u.mouseHover(driver,l.getCousetab());
		l.seleniumcourse();
		
		Addtocart a=new Addtocart(driver);
		u.doubleClick(driver,a.getAddbtn());
		a.sumbittocart();
		u.alertpopup(driver);
		a.addtocart();
		a.gotocartbtn();
	//	Assert.assertEquals(driver.getTitle(),p.getdata("title"));
	}

}
