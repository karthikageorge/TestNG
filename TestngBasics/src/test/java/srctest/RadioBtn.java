package srctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBtn {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
	}
	@Test(priority=1,invocationCount = 2)
	 public void verifyButtonText() {
		WebElement butonText=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualText= butonText.getText();
		String expectedText = "Show Selected Value";
		
		Assert.assertEquals(actualText, expectedText);
		
	}
	@Test(dependsOnMethods = "verifyButtonText")
	//enabled=false
	public void radioBtnisEnabled() {
		WebElement butonText=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean BtnEnabled = butonText.isEnabled();
		Assert.assertTrue(BtnEnabled);
		System.out.println(BtnEnabled);
	}

}
