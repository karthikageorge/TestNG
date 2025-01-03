package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipExample {
	WebDriver driver;
@BeforeMethod
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/window-popup.php");
}
@Test
public void verifyTooltip() {
	WebElement btnTooltip=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	String actualTooltip=btnTooltip.getAttribute("title");
	System.out.println(actualTooltip);
	String expectedTooltip="Follow @obsqurazone on Facebook";
	//String expectedTooltip="Follow obsqurazone on Facebook";
	Assert.assertEquals(actualTooltip, expectedTooltip);

}
}
