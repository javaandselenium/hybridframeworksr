package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement sumbitbtn;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement addtocarticon;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	private WebElement gotocart;
	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sumbittocart() {
		sumbitbtn.click();
	}
	
	public void addtocart() {
		addtocarticon.click();
	}
	
	public void gotocartbtn() {
		gotocart.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

}
