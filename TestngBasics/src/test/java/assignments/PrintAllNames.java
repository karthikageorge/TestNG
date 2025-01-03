package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllNames {
	WebDriver driver; 
	 
 	@BeforeMethod 
 	public void launchBrowser() 
 	{ 
 		WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver 
 		driver=new ChromeDriver(); 
 		driver.manage().window().maximize(); 
 		driver.get("https://selenium.qabible.in/table-pagination.php"); 
 	}	
 	@Test
 	public void allNames() {
 		////table[@id='dtBasicExample']//tbody//tr
 		List<WebElement>names = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]")); 
 	 	System.out.println("All names are "); 
 	 	for (WebElement a: names) 
 	 	{ 
 	 		System.out.println(a.getText()); 
 	 	} 
 	}
}
