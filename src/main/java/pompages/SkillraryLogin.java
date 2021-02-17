package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement geras;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
    private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement go;
	
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gerasbtn() {
		geras.click();
	}
	
	public void srdemoapp() {
		 demoapp.click();
	}
	
	public void serachcourse(String coursename) {
		serachtb.sendKeys(coursename);
		go.click();
	}
	
	
}
