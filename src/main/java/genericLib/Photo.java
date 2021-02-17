package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * 
 * @author QSP
 *
 */
public class Photo implements Autoconstant {
	/**
	 * Photo of failed testcases
	 * @param driver
	 * @param name
	 * @return
	 * @throws IOException
	 */
	public String getphoto(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date = d.toString().replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(photoPath+date+name+".png");
		FileUtils.copyFile(src,dest);
		return date;
		
	}

}
