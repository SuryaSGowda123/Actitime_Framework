package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.basetest;

public class actiTimeEnterTimeTrack_page2 {

	/*identifies tasks*/
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement btnTasks;
	
	/*identifies Reports*/
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement btnReports;
	
	/*identifies users*/
	@FindBy(xpath="//a[@class='content users']")
	private WebElement btnUsers;
	
	/*identifies logout*/
	@FindBy(id="logoutLink")
	private WebElement btnLogout;
	/*clicks on tasks*/
	public void clickTasks()
	{
		this.btnTasks.click();
	}
	/*clicks on users*/
	public void clickUsers()
	{
		basetest.util.validateElementVisibility(btnUsers);
		this.btnUsers.click();
	}
	/*clicks on reports*/
	public void clickReports()
	{
		this.btnReports.click();
	}
	/*clicks on logout*/
	public void clickLogout()
	{
		this.btnLogout.click();
	}
	
	public actiTimeEnterTimeTrack_page2(WebDriver driver) {
		/*intialises webelements*/
		PageFactory.initElements(driver, this);
	}
	
}
