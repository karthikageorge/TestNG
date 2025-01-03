package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Six_DimentionalDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider = "Personal Details",dataProviderClass = SixDimentionalDataProviders.class)
	public void enterDetails(String Firstname,String Lastname,String Username,String City,String State,String Zip) {
		WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		WebElement userName=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		WebElement submitFormBtn=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		WebElement chekboxAgree=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		
		firstName.sendKeys(Firstname);
		lastName.sendKeys(Lastname);
		userName.sendKeys(Username);
		city.sendKeys(City);
		state.sendKeys(State);
		zip.sendKeys(Zip);
		chekboxAgree.click();
		submitFormBtn.click();
		
		
		
	}

}
