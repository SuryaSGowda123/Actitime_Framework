package dataproviders;

import org.testng.annotations.DataProvider;
import generic.actionUtil;
import generic.basetest;

public class actidata {

	@DataProvider
	public Object[][] createUserData()
	{
		Object[][] d=new Object[1][5];
		d[0][0]=actionUtil.getdata(basetest.excelPath,"adduser", 1, 0);
		d[0][1]=actionUtil.getdata(basetest.excelPath,"adduser", 1, 1);
		d[0][2]=actionUtil.getdata(basetest.excelPath,"adduser", 1, 2);
		d[0][3]=actionUtil.getdata(basetest.excelPath,"adduser", 1, 3);
		d[0][4]=actionUtil.getdata(basetest.excelPath,"adduser", 1, 4);
		return d;
		
	}
}
