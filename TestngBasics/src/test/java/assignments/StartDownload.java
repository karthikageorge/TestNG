package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartDownload {
	SoftAssert softassert=new SoftAssert();
	
	WebDriver driver;
	
	 @BeforeMethod
	 public void launchbrowser() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
	 }
	 @Test
	 public void enableStartDownload() {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(600));
		    WebElement startBtn=driver.findElement(By.xpath("//button[@id='downloadButton']"));
			boolean buttonIsEnabled=startBtn.isEnabled();
			System.out.println("Button is enabled = "+buttonIsEnabled);
			Assert.assertTrue(buttonIsEnabled);
			
			startBtn.click();
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
			WebElement completeText=driver.findElement(By.xpath("//div[text()='Complete!']"));
			String actualText=completeText.getText();
			System.out.println(actualText);
			String expectedText="Complete!";
			Assert.assertEquals(actualText, expectedText);
			softassert.assertAll();
			
	 }
}
