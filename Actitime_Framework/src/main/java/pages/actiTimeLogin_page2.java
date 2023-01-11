package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin_page2 {
	/* identifies username */
	@FindBy(name = "username")
	private WebElement tbUsername;

	/* identifies password */
	@FindBy(name = "pwd")
	private WebElement tbPassword;

	/* identifies login button */
	@FindBy(id = "loginButton")
	private WebElement btnLogin;

	/* enters the data into username */
	public void setUsername(String un) {
		this.tbUsername.sendKeys(un);
	}

	/* enters the data into password */
	public void setpassword(String pw) {
		this.tbPassword.sendKeys(pw);
	}

	/* clicks on login button */
	public void clickLogin() {
		this.btnLogin.click();
	}

	/* will log in to app */
	public void login(String un, String pw) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();

	}

	public actiTimeLogin_page2(WebDriver driver) {
		/* intialises webelements */
		PageFactory.initElements(driver, this);
	}
}
