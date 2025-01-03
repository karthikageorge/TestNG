package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAssignmentVerifyCss {
WebDriver driver;
@BeforeMethod
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/bootstrap-alert.php");
}
@Test
public void verifybackgroundColor() {
	WebElement autoclosableAlert=driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']"));
	String actualBackgroungcolor = autoclosableAlert.getCssValue("background-color");
	System.out.println(actualBackgroungcolor);
	String expectedBackgroundcolor = "rgba(220, 53, 69, 1)";
	//String expectedBackgroundcolor = "rgba(220, 53, 70, 1)";
	Assert.assertEquals(actualBackgroungcolor, expectedBackgroundcolor);
}
@Test
public void verifyFontColor() {
	WebElement autoclosableAlert2=driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']"));
	String actualFontcolor = autoclosableAlert2.getCssValue("color");
	System.out.println(actualFontcolor);
	String expectedFontcolor = "rgba(255, 255, 255, 1)";
	//String expectedFontcolor = "rgba(2588, 255, 255, 1)";
	Assert.assertEquals(actualFontcolor, expectedFontcolor);
}
@Test
public void verifyHeader() {
	WebElement header=driver.findElement(By.xpath("//div[contains(text(),'Bootstrap Alert')]"));
	String actualHeadername=header.getText();
	System.out.println(actualHeadername);
	String expectedHeader="Bootstrap Alert";
	//String expectedHeader="Bootstrap";
	Assert.assertEquals(actualHeadername, expectedHeader);
	
}
}
