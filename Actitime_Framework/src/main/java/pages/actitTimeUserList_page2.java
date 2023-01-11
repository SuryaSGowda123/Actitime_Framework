package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitTimeUserList_page2 {
    /*identifies departmenets*/
	@FindBy(xpath="(//div[contains(text(),'Departments')])[1]")
	private WebElement btnDepartments;
	
	/*identifies new user*/
	@FindBy(xpath="//div[text()='New User']")
	private WebElement btnNewUser;
	
	/*identifies Bulk invitations*/
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	private WebElement btnBulkInvitations;
	
	/*clicks on departments*/
	public void clickDepartments()
	{
		this.btnDepartments.click();
	}
	
	/*clicks on new user*/
	public void clickNewUser()
	{
		this.btnNewUser.click();
	}
	
	/*clicks on BulkInvitations*/
	public void clickBulkInvitations()
	{
		this.btnBulkInvitations.click();
	}
	
	public actitTimeUserList_page2(WebDriver driver) {
		/*intialises webelements*/
		PageFactory.initElements(driver, this);
	}
}
