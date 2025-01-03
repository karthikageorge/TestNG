package srctest;

import org.testng.annotations.DataProvider;

public class DataProviders {
	//to make a data provider
	@DataProvider(name="Amazone products")
	
	public Object[][] productSearch()
	{
		return new Object [][] {{"shoe"},{"watch"},{"phone"},{"toys"}};//return object array
	}
}
