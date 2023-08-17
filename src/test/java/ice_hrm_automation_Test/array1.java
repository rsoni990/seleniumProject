package ice_hrm_automation_Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class array1 {
	@DataProvider
	public Object[][] cerdentials()
	{
		Object[][] object=new Object[][] {
			{1,"Pune","City"},
			{2,"Mumbai","City"},
			{3,"Nagpur","CIty"},
			{4,"Delhi","Capital"}
		};
		return object;
	}

	@Test(dataProvider="cerdentials")
	public void test(int a,String city, String type)
	{
		System.out.println(a+" "+city+" "+type);
	}
}
