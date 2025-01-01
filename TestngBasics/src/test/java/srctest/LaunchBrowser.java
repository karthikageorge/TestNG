package srctest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void verifyAmazoneTitle() {
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@Test
	public void verifyCurrentUrl() {
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
		String expectedurl="https://www.amazon.in/";
		Assert.assertEquals(actualurl,expectedurl);
	}
	

}
