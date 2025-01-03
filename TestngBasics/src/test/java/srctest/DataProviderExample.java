package srctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	public class LaunchBrowser {
		WebDriver driver;
		@BeforeMethod
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://www.amazon.in/");
			driver.get("https://www.facebook.com/");
		}
		
		@Test(dataProvider = "Amazone products",dataProviderClass = DataProviders.class)//dataproviders class
		public void searchProduct(String product) {//to receive the product as parameter
			WebElement searchproduct=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchproduct.sendKeys(product);
			
		}
		
}
	

}
