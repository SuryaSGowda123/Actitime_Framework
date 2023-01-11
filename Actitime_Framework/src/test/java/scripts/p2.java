package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import dataproviders.actidata;
import generic.basetest;
import pages.initialisePages;

public class p2 extends basetest{

	@Test(dataProviderClass=actidata.class,dataProvider="createUserData")
	public void addUserScript(String un,String pw,String fn,String ln,String em) throws InterruptedException
	{
		/*creates an Object of initialise pages*/
		initialisePages pages=new initialisePages(driver);
		/* logs in to the app */
		pages.actiTimeLogin.login(un ,pw);
		/* clicks on users */
		pages.actitimeEnter.clickUsers();
		/* clicks on new user */
		pages.actitimeUsers.clickNewUser();
		/* pauses for 2 sec */
		Thread.sleep(2000);
		/* creates a new user */
	    pages.addUser.createUser(fn,ln,em);

	}
}
