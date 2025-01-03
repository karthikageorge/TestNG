package srctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider = "Login",dataProviderClass = FacebookDataProviders.class)
	public void enteremailpass(String email,String password) {
		WebElement usernameField = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		WebElement passwordFiled = driver.findElement(By.xpath("//input[@id='pass']"));
		usernameField.sendKeys(email);
		passwordFiled.sendKeys(password);//multidementional 
		
	}

}
