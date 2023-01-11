package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUser_page2 {
	/* identifies first name */
	@FindBy(xpath = "(//input[@name='firstName'])[2]")
	private WebElement tbFirstName;
	/* identifies last name */
	@FindBy(xpath = "(//input[@name='lastName'])[2]")
	private WebElement tbLastName;
	/* identifies email */
	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement tbEmail;
	/* identifies save and send invitation */
	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	private WebElement btnSave;
	
	/*creates a new user*/
	public void createUser(String fn,String ln,String em)
	{
		this.tbFirstName.sendKeys(fn);
		this.tbLastName.sendKeys(ln);
		this.tbEmail.sendKeys(em);
		this.btnSave.click();
		
	}

	public addUser_page2(WebDriver driver) {
		/* intialises webelements */
		PageFactory.initElements(driver, this);
	}
}
