package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class actionUtil {
	
	WebDriver driver;
	public actionUtil(WebDriver driver) {
		this.driver=driver;
	}
    /*method to retrieve the data from excel*/
	public  static String getdata(String path,String sn,int r,int c) 
	{
		try {
			FileInputStream f1 = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f1);
			String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
		    return d;
		    
		} catch (Exception e) {
			return null;
		}
					
	}
	/*method to validate based on title*/
	public void validateTitle(String expectedTitle)	
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		System.out.println("pass:title is matching");
		}
		catch (Exception e) {
		System.out.println("fail:title is not matching");
		Assert.fail();
		}
	}
	
	/*captures the screenshot*/
	public void captureScreenshot(String scriptName)
	{
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(basetest.userDir+"\\screenshot\\"+scriptName+".png");
	    try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
	
	}
	
	/*method to validate based on visibility of webelement*/
	public void validateElementVisibility(WebElement element)	
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("pass:element is visible");
		}
		catch (Exception e) {
		System.out.println("fail:element is not visible");
		Assert.fail();
		}
	}
}
