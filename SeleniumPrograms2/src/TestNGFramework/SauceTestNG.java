package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceTestNG {
	    WebDriver driver;
	    
	    //Login process
	  //@Test (priority=1)
	    @Test
	    public void a_loginPage() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	    }
	
	    //Logout process
	  //  @Test (priority=2)
	    @Test
	    public void b_logoutPage() {
	    driver.findElement(By.xpath("//span[contains(text(),'Products')]/preceding::button[2]")).click();
 		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		//driver.close();
	}

}
