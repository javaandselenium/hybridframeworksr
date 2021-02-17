package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoappLogin {
	@FindBy(id="course")
	private WebElement cousetab;
	
	@FindBy(name="addresstype")
	private WebElement cousedd;

	public WebElement getCousedd() {
		return cousedd;
	}

	public WebElement getCousetab() {
		return cousetab;
	}
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public DemoappLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumcourse() {
		seleniumtraining.click();
	}

}
