package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {
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
 	public void getDetails() {
 		WebElement positionRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[3]")); 
 	 	String officeName=positionRow.getText();
 	 	System.out.println("Office name of Cedric Kelly is "+officeName);
 	 	List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[8]//td")); 
 	 	for(WebElement details:tableHeadings) {
 	 		System.out.println(details.getText());
 	 	}
 	 	
 		
 	}
}
