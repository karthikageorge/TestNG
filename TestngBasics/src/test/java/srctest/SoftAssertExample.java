package srctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample {
	
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
	}
		@Test(priority=1)
		 public void verifyButtonText() {
			WebElement butonText=driver.findElement(By.xpath("//button[@id='button-one']"));
			WebElement headerText=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
			WebElement radioBtnEnable=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
			String actualText= butonText.getText();
			String expectedText = "Show Selected Value";
			softassert.assertEquals(actualText, expectedText);
			
			String actualHeader= headerText.getText();
			String expectedHeader = "Show Selected Value";
			softassert.assertEquals(actualHeader, expectedHeader);//another(multiple) assertions in one testcase
			
			boolean BtnEnabled = radioBtnEnable.isEnabled();
			Assert.assertTrue(BtnEnabled);
			softassert.assertAll();//differeence of soft and hard assertions-->note
			
	}
		

}
