package srctest;

import org.testng.annotations.DataProvider;

public class FacebookDataProviders {
	@DataProvider(name="Login")
	public Object[][] LoginData()
	{
		return new Object [][] {{"aadarsg","psw1"},{"aswathy","psw2"},{"karthika","psw3"}};
	}
}
