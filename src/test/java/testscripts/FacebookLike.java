package testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.DemoappLogin;
import pompages.Facebook;
import pompages.SkillraryLogin;
import pompages.Testing;

public class FacebookLike extends BaseClass{
	@Test
	public void likefacebook() throws FileNotFoundException, IOException {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.gerasbtn();
		s.srdemoapp();
		u.switchingtab(driver);
		DemoappLogin d=new DemoappLogin(driver);
		u.dropDown(d.getCousedd(),p.getdata("coursedd"));
		Testing t=new Testing(driver);
		t.facebooklogo();
		Facebook f=new Facebook(driver);
		f.likebtn();
	}

}
