package assignments;

import org.testng.annotations.DataProvider;

public class SixDimentionalDataProviders {
@DataProvider(name="Personal Details")
	
	public Object[][] informations()
	{
		return new Object [][] {{"Mathew","Alex","mathewalex","changanachrry","india","686010"},
			{"Suby","Mathew","subymathew","changanacherry","india","689010"}};//return object array
	}
}
