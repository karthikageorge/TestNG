package srctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonExample {
	WebDriver driver;
	
	 @BeforeMethod
	 public void launchbrowser() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selenium.qabible.in/radio-button-demo.php");
	 }
		
	 @Test(invocationCount = 2)//same test case iterate multiple times
	 public void verifyShowSelectedButton() {
	  
	  WebElement button1=driver.findElement(By.xpath("//button[contains(text(),'Show Selected Value')]"));
	  
	  String actualButtonName=button1.getText();
	  System.out.println(actualButtonName);
	  String expButtonName="Show Selected Value";
	  Assert.assertEquals(actualButtonName,expButtonName,"message displayed when test is failed");
	 }
		

	 @Test(priority = 1)//testcase run priority wise
	 public void verifyRadioButtonIsEnabled() {
	  
	  WebElement radBtn1=driver.findElement(By.xpath("//input[@id='inlineRadio1']")); 
	  boolean actualstatus=radBtn1.isEnabled();
	  boolean expectedStatus=true;
	  //Assert.assertEquals(actualstatus,expectedStatus); 
	  Assert.assertTrue(actualstatus);//by defalut check wheather its true or false
	}
		
	 @Test(enabled = false)//testcase won't run
	 public void verifyButtonIsDisplayed() {
	  
	  WebElement button2=driver.findElement(By.xpath("//button[contains(text(),'Get Results')]")); 
	  boolean actualbtnstatus=button2.isDisplayed();
	  boolean expectedbtnStatus=true;
	  Assert.assertTrue(actualbtnstatus);//by defalut check wheather its true or false
	}
}
