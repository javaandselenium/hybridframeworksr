package genericLib;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
/**
 * 
 * @author QSP
 *
 */
public class Utililies {
	/**
	 * To handle all the elements of webpage
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions s=new Actions(driver);
		s.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void frame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBackfromFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	
	public void switchingtab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	public void frames(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchbaccktoFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void verify(WebDriver driver,String expected,String page) {
		Assert.assertEquals(page+ " is displayed "+driver.getCurrentUrl(), expected);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
