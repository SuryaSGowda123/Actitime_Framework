package pages;

import org.openqa.selenium.WebDriver;

public class initialisePages {

	public actiTimeLogin_page2 actiTimeLogin;
	public actiTimeEnterTimeTrack_page2 actitimeEnter;
	public actitTimeUserList_page2 actitimeUsers;
	public addUser_page2 addUser;
	
	public initialisePages(WebDriver driver) {
		
		this.actiTimeLogin=new actiTimeLogin_page2(driver);
		this.actitimeEnter=new actiTimeEnterTimeTrack_page2(driver);
		this.actitimeUsers=new actitTimeUserList_page2(driver);
		this.addUser=new addUser_page2(driver);
	}
	
	
}
