package scripts;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import generic.basetest;
import pages.initialisePages;

public class p1 extends basetest{

	@Test
	public void actiLoginScript()
	{
	initialisePages pages=new initialisePages(driver);
	/*logs in to the actitime app*/
	pages.actiTimeLogin.login(p.getProperty("username") , p.getProperty("password"));
    
	util.validateTitle("actiTIME - Enter Time-Track");
	
	
	}
}
