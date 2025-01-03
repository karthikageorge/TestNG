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

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyImage {
	WebDriver driver;
	
	@BeforeMethod
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/dynamic-load.php");
	
}
@Test(priority=1)
public void verifybuttonText() {
	WebElement btnText=driver.findElement(By.xpath("//button[@id='save']"));
	String actualbtnText=btnText.getText();
	System.out.println(actualbtnText);
	String expectedbtnText="Get New User";
	Assert.assertEquals(actualbtnText, expectedbtnText);

}
@Test(priority=2)
public void clickBtn() {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement btnText=driver.findElement(By.xpath("//button[@id='save']"));
	wait.until(ExpectedConditions.elementToBeClickable(btnText));
	btnText.click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='loading']/div/img")));
	WebElement image=driver.findElement(By.xpath("//div[@id='loading']/div/img"));
	boolean img=image.isDisplayed();
	System.out.println(img);
	Assert.assertTrue(img);

}

}
